package org.veritasopher.bibtexparser.generator;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import org.veritasopher.bibtexparser.parser.model.Bib;
import org.veritasopher.bibtexparser.parser.model.Entry;
import org.veritasopher.bibtexparser.parser.model.Field;

import java.nio.file.Path;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * JSON Generator
 *
 * @author Yepeng Ding
 */
public class JSONGenerator {

    private final Bib bib;
    private final Gson gson;


    public JSONGenerator(Bib bib) {
        this.bib = bib;
        this.gson = new GsonBuilder().setPrettyPrinting().create();
    }

    /**
     * Generate BibTeX JSON to the console
     */
    public void generateToConsole() {
        System.out.println(generateAsString());
    }

    /**
     * Generate BibTeX JSON to the given output path
     *
     * @param path output path
     */
    public void generateToFile(String path) {
        Util.writeToFile(generateAsString(), Path.of(path));
    }

    /**
     * Generate BibTeX JSON string
     *
     * @return BibTeX JSON string
     */
    public String generateAsString() {
        String bibJSON = "[%s]".formatted(getEntriesJSON(bib));
        return gson.toJson(JsonParser.parseString(bibJSON));
    }

    private String getEntriesJSON(Bib bib) {
        return bib.getEntries().stream()
                .map(entry -> """
                        {"id":"%s","type":"%s",%s}
                        """.formatted(
                        entry.id(),
                        entry.type().toString().toLowerCase(),
                        getFieldsJSON(entry)
                ))
                .collect(Collectors.joining(","));
    }

    private String getFieldsJSON(Entry entry) {
        Function<Field, String> fieldToJSON = field -> toStringLiteral(field.key()) + ':' + switch (field.valueType()) {
            case STRING -> toStringLiteral(field.value());
            case INTEGER -> Integer.parseInt(field.value());
        };

        return entry.fields().stream()
                .map(field -> field.toString(fieldToJSON))
                .collect(Collectors.joining(","));
    }

    private String toStringLiteral(String string) {
        return '"' + string.replaceAll("[{}]", "").replace("\"", "\\\"") + '"';
    }


}
