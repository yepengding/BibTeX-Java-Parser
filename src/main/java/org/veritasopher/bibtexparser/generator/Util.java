package org.veritasopher.bibtexparser.generator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Util {

    public static void writeToFile(String content, Path pathToFile) {
        try {
            Files.createDirectories(pathToFile.getParent());

            Files.writeString(pathToFile, content);

            // Test writing
            String fileContent = Files.readString(pathToFile);
            System.out.println(fileContent);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
