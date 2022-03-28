package org.veritasopher.bibtexparser;

import java.util.Objects;


/**
 * Utils for Test
 *
 * @author Yepeng Ding
 */
public class Util {

    public static String getFilePathInResource(String filePath) {
        return Objects.requireNonNull(Thread.currentThread().getContextClassLoader().getResource(filePath)).getPath();
    }

}
