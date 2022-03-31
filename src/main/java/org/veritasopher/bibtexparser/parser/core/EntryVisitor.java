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
        return new Entry(EntryType.ARTICLE, ctx.IDENTIFIER().getText(), getFieldsFromContext(ctx.field()));
    }

    @Override
    public Entry visitBook(BibTeX.BookContext ctx) {
        return new Entry(EntryType.BOOK, ctx.IDENTIFIER().getText(), getFieldsFromContext(ctx.field()));
    }

    @Override
    public Entry visitBooklet(BibTeX.BookletContext ctx) {
        return new Entry(EntryType.BOOKLET, ctx.IDENTIFIER().getText(), getFieldsFromContext(ctx.field()));
    }

    @Override
    public Entry visitInbook(BibTeX.InbookContext ctx) {
        return new Entry(EntryType.INBOOK, ctx.IDENTIFIER().getText(), getFieldsFromContext(ctx.field()));
    }

    @Override
    public Entry visitIncollection(BibTeX.IncollectionContext ctx) {
        return new Entry(EntryType.INCOLLECTION, ctx.IDENTIFIER().getText(), getFieldsFromContext(ctx.field()));
    }

    @Override
    public Entry visitInproceedings(BibTeX.InproceedingsContext ctx) {
        return new Entry(EntryType.INPROCEEDINGS, ctx.IDENTIFIER().getText(), getFieldsFromContext(ctx.field()));
    }

    @Override
    public Entry visitProceedings(BibTeX.ProceedingsContext ctx) {
        return new Entry(EntryType.PROCEEDINGS, ctx.IDENTIFIER().getText(), getFieldsFromContext(ctx.field()));
    }

    @Override
    public Entry visitManual(BibTeX.ManualContext ctx) {
        return new Entry(EntryType.MANUAL, ctx.IDENTIFIER().getText(), getFieldsFromContext(ctx.field()));
    }

    @Override
    public Entry visitMastersthesis(BibTeX.MastersthesisContext ctx) {
        return new Entry(EntryType.MASTERTHESIS, ctx.IDENTIFIER().getText(), getFieldsFromContext(ctx.field()));
    }

    @Override
    public Entry visitPhdthesis(BibTeX.PhdthesisContext ctx) {
        return new Entry(EntryType.PHDTHESIS, ctx.IDENTIFIER().getText(), getFieldsFromContext(ctx.field()));
    }

    @Override
    public Entry visitMisc(BibTeX.MiscContext ctx) {
        return new Entry(EntryType.MISC, ctx.IDENTIFIER().getText(), getFieldsFromContext(ctx.field()));
    }

    @Override
    public Entry visitTechreport(BibTeX.TechreportContext ctx) {
        return new Entry(EntryType.TECHREPORT, ctx.IDENTIFIER().getText(), getFieldsFromContext(ctx.field()));
    }

    @Override
    public Entry visitUnpublished(BibTeX.UnpublishedContext ctx) {
        return new Entry(EntryType.UNPUBLISHED, ctx.IDENTIFIER().getText(), getFieldsFromContext(ctx.field()));
    }

    /**
     * Visit fields under a type of entry context
     *
     * @param fieldContexts FieldContext list
     * @return Field list
     */
    private List<Field> getFieldsFromContext(List<BibTeX.FieldContext> fieldContexts) {
        return fieldContexts.stream()
                .map(fieldVisitor::visit)
                .toList();
    }

}
