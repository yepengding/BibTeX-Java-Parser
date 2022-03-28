package org.veritasopher.bibtexparser.parser.model;

import org.veritasopher.bibtexparser.parser.model.type.ValueType;

import java.util.function.Function;

/**
 * BibTeX Entry Field Record
 *
 * @author Yepeng Ding
 */
public record Field(String key,
                    String value,
                    ValueType valueType) {

    public String toString(Function<Field, String> transform) {
        return transform.apply(this);
    }

}
