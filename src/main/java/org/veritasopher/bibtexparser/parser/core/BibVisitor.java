package org.veritasopher.bibtexparser.parser.core;

import org.veritasopher.bibtexparser.parser.base.BibTeX;
import org.veritasopher.bibtexparser.parser.base.BibTeXBaseVisitor;
import org.veritasopher.bibtexparser.parser.model.Bib;

/**
 * BibTeX Visitor
 *
 * @author Yepeng Ding
 */
public class BibVisitor extends BibTeXBaseVisitor<Bib> {

    private final Bib bib;

    private final EntryVisitor entryVisitor;

    public BibVisitor() {
        this.bib = new Bib();
        this.entryVisitor = new EntryVisitor();
    }

    @Override
    public Bib visitEntry(BibTeX.EntryContext ctx) {
        bib.addEntry(entryVisitor.visit(ctx));
        return bib;
    }
}
