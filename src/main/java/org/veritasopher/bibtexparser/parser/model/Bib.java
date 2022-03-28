package org.veritasopher.bibtexparser.parser.model;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * BibTeX Class
 *
 * @author Yepeng Ding
 */
@ToString
public class Bib {

    @Getter
    private final List<Entry> entries;

    public Bib() {
        this.entries = new ArrayList<>();
    }

    public void addEntry(Entry entry) {
        this.entries.add(entry);
    }

    public String toString(Function<Bib, String> transform) {
        return transform.apply(this);
    }

}
