package org.veritasopher.bibtexparser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;
import org.veritasopher.bibtexparser.generator.JSONGenerator;
import org.veritasopher.bibtexparser.parser.BibTeXParser;
import org.veritasopher.bibtexparser.parser.model.Bib;

import java.io.FileInputStream;
import java.io.IOException;

import static org.veritasopher.bibtexparser.Util.getFilePathInResource;

public class AppTest {

    @Test
    public void testJSONGenerator() {
        BibTeXParser bibTeXParser = new BibTeXParser();
        Bib bib = bibTeXParser.parse(getFilePathInResource("MyPublications.bib"));

        JSONGenerator jsonGenerator = new JSONGenerator(bib);
        jsonGenerator.generateToConsole();
    }

    @Test
    public void testParseMethod() {
        BibTeXParser bibTeXParser = new BibTeXParser();
        Bib bib = bibTeXParser.parse(getFilePathInResource("MyPublications.bib"));

        System.out.println(bib);
    }

    @Test
    public void testParseTree() throws IOException {
        String filePath = getFilePathInResource("MyPublications.bib");

        CharStream charStream = CharStreams.fromStream(new FileInputStream(filePath));

        BibTeXParser bibTeXParser = new BibTeXParser();
        ParseTree parseTree = bibTeXParser.getParseTreeFromSource(charStream);

        System.out.println(parseTree.toStringTree());
    }
}
