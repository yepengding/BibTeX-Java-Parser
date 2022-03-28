package org.veritasopher.bibtexparser.parser.model;

import lombok.Getter;
import lombok.ToString;
import org.veritasopher.bibtexparser.parser.model.type.EntryType;

import java.util.ArrayList;
import java.util.List;

/**
 * BibTeX Entry Class
 *
 * @author Yepeng Ding
 */
@ToString
public class Entry {

    @Getter
    private final EntryType type;

    private final List<Field> fields;

    public Entry(EntryType type, List<Field> fields) {
        this.type = type;
        this.fields = fields;
    }

    public void addField(Field field) {
        this.fields.add(field);
    }

}
