package org.veritasopher.bibtexparser;

import org.apache.commons.cli.*;
import org.veritasopher.bibtexparser.generator.JSONGenerator;
import org.veritasopher.bibtexparser.parser.BibTeXParser;
import org.veritasopher.bibtexparser.parser.model.Bib;

import java.io.File;

/**
 * BibTeX Parser Entry Point
 *
 * @author Yepeng Ding
 */
public class App {

    private static final String VERSION = "v1.0";
    private static final String USAGE = "BibTeXJavaParser [options] [bib file paths]";

    private static Options options;
    private static final HelpFormatter formatter = new HelpFormatter();

    public static void main(String[] args) {
        initOptions();
        CommandLineParser parser = new DefaultParser();

        try {
            CommandLine cmd = parser.parse(options, args);
            argHandler(cmd);
        } catch (ParseException e) {
            System.err.println(e.getLocalizedMessage());
            formatter.printHelp(USAGE, options);
            System.exit(0);
        }
    }

    private static void argHandler(CommandLine cmd) {
        if (cmd.hasOption("v")) {
            System.out.println(VERSION);
            System.exit(0);
        } else if (cmd.hasOption("h")) {
            formatter.printHelp(USAGE, options);
            System.exit(0);
        }

        if (cmd.getArgs().length == 0) {
            System.err.println("Please specify at least one bib file path as input");
            formatter.printHelp(USAGE, options);
            System.exit(0);
        }

        // Handle bib file inputs
        String outputPath = ".";
        String outputType = "json";

        if (cmd.hasOption("o")) {
            outputPath = cmd.getOptionValue("o");
        }

        if (cmd.hasOption("t")) {
            outputType = cmd.getOptionValue("t");
        }

        BibTeXParser bibTeXParser = new BibTeXParser();
        JSONGenerator jsonGenerator;

        for (String arg :
                cmd.getArgs()) {

            System.out.println("Parsing " + arg);

            Bib bib = bibTeXParser.parse(arg);
            jsonGenerator = new JSONGenerator(bib);
            switch (outputType) {
                case "json" -> {
                    String path = outputPath + File.separator + arg + ".json";
                    jsonGenerator.generateToFile(path);
                    System.out.println("JSON file (" + arg + ".json" + ") is output to " + path);
                }
                case "console" -> {
                    System.out.println("=== Output " + arg + " to console ===");
                    jsonGenerator.generateToConsole();
                }
                default -> System.err.println("Unsupported output type " + outputType);
            }

        }


    }

    private static void initOptions() {
        options = new Options();
        Option version = new Option("v", "version", false, "print current version.");
        Option help = new Option("h", "help", false, "print help.");
        Option outputPath = Option.builder("o")
                .longOpt("output")
                .hasArg()
                .argName("path")
                .type(String.class)
                .desc("output directory path.")
                .build();
        Option outputType = Option.builder("t")
                .longOpt("to")
                .hasArg()
                .argName("type")
                .type(String.class)
                .desc("output type (json, print).")
                .build();
        options.addOption(version);
        options.addOption(help);
        options.addOption(outputPath);
        options.addOption(outputType);
    }
}
