package org.veritasopher.bibtexparser.parser.model;

import org.veritasopher.bibtexparser.parser.model.type.EntryType;

import java.util.List;
import java.util.function.Function;

/**
 * BibTeX Entry Record
 *
 * @author Yepeng Ding
 */
public record Entry(EntryType type,
                    String id,
                    List<Field> fields) {

    public String toString(Function<Entry, String> transform) {
        return transform.apply(this);
    }

}
