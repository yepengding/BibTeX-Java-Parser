package org.veritasopher.bibtexparser.generator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Util {

    public static void writeToFile(String content, Path pathToFile) {
        try {
            Files.createDirectories(pathToFile.getParent());

            Files.writeString(pathToFile, content);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
