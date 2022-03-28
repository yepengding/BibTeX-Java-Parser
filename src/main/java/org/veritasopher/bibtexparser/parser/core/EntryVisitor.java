package org.veritasopher.bibtexparser.parser.core;

import org.veritasopher.bibtexparser.parser.base.BibTeX;
import org.veritasopher.bibtexparser.parser.base.BibTeXBaseVisitor;
import org.veritasopher.bibtexparser.parser.model.Entry;
import org.veritasopher.bibtexparser.parser.model.Field;
import org.veritasopher.bibtexparser.parser.model.type.EntryType;

import java.util.List;

/**
 * BibTeX Entry Visitor
 *
 * @author Yepeng Ding
 */
public class EntryVisitor extends BibTeXBaseVisitor<Entry> {

    private final FieldVisitor fieldVisitor;

    public EntryVisitor() {
        fieldVisitor = new FieldVisitor();
    }

    @Override
    public Entry visitArticle(BibTeX.ArticleContext ctx) {
        return new Entry(EntryType.ARTICLE, getFieldsFromContext(ctx.field()));
    }

    @Override
    public Entry visitInproceedings(BibTeX.InproceedingsContext ctx) {
        return new Entry(EntryType.INPROCEEDINGS, getFieldsFromContext(ctx.field()));
    }

    private List<Field> getFieldsFromContext(List<BibTeX.FieldContext> fieldContexts) {
        return fieldContexts.stream()
                .map(fieldVisitor::visit)
                .toList();
    }

}
