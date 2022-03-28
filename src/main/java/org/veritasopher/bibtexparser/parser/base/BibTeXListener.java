// Generated from /Users/michaeltei/Projects/PracticeProjects/BibTeXParser/src/main/resources/BibTeX.g4 by ANTLR 4.9.2
package org.veritasopher.bibtexparser.parser.base;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BibTeX}.
 */
public interface BibTeXListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BibTeX#bibTex}.
	 * @param ctx the parse tree
	 */
	void enterBibTex(BibTeX.BibTexContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibTeX#bibTex}.
	 * @param ctx the parse tree
	 */
	void exitBibTex(BibTeX.BibTexContext ctx);
	/**
	 * Enter a parse tree produced by {@link BibTeX#entry}.
	 * @param ctx the parse tree
	 */
	void enterEntry(BibTeX.EntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibTeX#entry}.
	 * @param ctx the parse tree
	 */
	void exitEntry(BibTeX.EntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link BibTeX#field}.
	 * @param ctx the parse tree
	 */
	void enterField(BibTeX.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibTeX#field}.
	 * @param ctx the parse tree
	 */
	void exitField(BibTeX.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link BibTeX#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(BibTeX.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibTeX#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(BibTeX.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link BibTeX#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(BibTeX.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibTeX#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(BibTeX.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link BibTeX#article}.
	 * @param ctx the parse tree
	 */
	void enterArticle(BibTeX.ArticleContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibTeX#article}.
	 * @param ctx the parse tree
	 */
	void exitArticle(BibTeX.ArticleContext ctx);
	/**
	 * Enter a parse tree produced by {@link BibTeX#book}.
	 * @param ctx the parse tree
	 */
	void enterBook(BibTeX.BookContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibTeX#book}.
	 * @param ctx the parse tree
	 */
	void exitBook(BibTeX.BookContext ctx);
	/**
	 * Enter a parse tree produced by {@link BibTeX#booklet}.
	 * @param ctx the parse tree
	 */
	void enterBooklet(BibTeX.BookletContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibTeX#booklet}.
	 * @param ctx the parse tree
	 */
	void exitBooklet(BibTeX.BookletContext ctx);
	/**
	 * Enter a parse tree produced by {@link BibTeX#inbook}.
	 * @param ctx the parse tree
	 */
	void enterInbook(BibTeX.InbookContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibTeX#inbook}.
	 * @param ctx the parse tree
	 */
	void exitInbook(BibTeX.InbookContext ctx);
	/**
	 * Enter a parse tree produced by {@link BibTeX#incollection}.
	 * @param ctx the parse tree
	 */
	void enterIncollection(BibTeX.IncollectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibTeX#incollection}.
	 * @param ctx the parse tree
	 */
	void exitIncollection(BibTeX.IncollectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BibTeX#inproceedings}.
	 * @param ctx the parse tree
	 */
	void enterInproceedings(BibTeX.InproceedingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibTeX#inproceedings}.
	 * @param ctx the parse tree
	 */
	void exitInproceedings(BibTeX.InproceedingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BibTeX#proceedings}.
	 * @param ctx the parse tree
	 */
	void enterProceedings(BibTeX.ProceedingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibTeX#proceedings}.
	 * @param ctx the parse tree
	 */
	void exitProceedings(BibTeX.ProceedingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BibTeX#manual}.
	 * @param ctx the parse tree
	 */
	void enterManual(BibTeX.ManualContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibTeX#manual}.
	 * @param ctx the parse tree
	 */
	void exitManual(BibTeX.ManualContext ctx);
	/**
	 * Enter a parse tree produced by {@link BibTeX#mastersthesis}.
	 * @param ctx the parse tree
	 */
	void enterMastersthesis(BibTeX.MastersthesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibTeX#mastersthesis}.
	 * @param ctx the parse tree
	 */
	void exitMastersthesis(BibTeX.MastersthesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link BibTeX#phdthesis}.
	 * @param ctx the parse tree
	 */
	void enterPhdthesis(BibTeX.PhdthesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibTeX#phdthesis}.
	 * @param ctx the parse tree
	 */
	void exitPhdthesis(BibTeX.PhdthesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link BibTeX#misc}.
	 * @param ctx the parse tree
	 */
	void enterMisc(BibTeX.MiscContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibTeX#misc}.
	 * @param ctx the parse tree
	 */
	void exitMisc(BibTeX.MiscContext ctx);
	/**
	 * Enter a parse tree produced by {@link BibTeX#techreport}.
	 * @param ctx the parse tree
	 */
	void enterTechreport(BibTeX.TechreportContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibTeX#techreport}.
	 * @param ctx the parse tree
	 */
	void exitTechreport(BibTeX.TechreportContext ctx);
	/**
	 * Enter a parse tree produced by {@link BibTeX#unpublished}.
	 * @param ctx the parse tree
	 */
	void enterUnpublished(BibTeX.UnpublishedContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibTeX#unpublished}.
	 * @param ctx the parse tree
	 */
	void exitUnpublished(BibTeX.UnpublishedContext ctx);
}