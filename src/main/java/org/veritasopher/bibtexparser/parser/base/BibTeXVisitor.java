// Generated from /Users/michaeltei/Projects/PracticeProjects/BibTeXParser/BibTeXJavaParser/BibTeX-Grammar/BibTeX.g4 by ANTLR 4.9.2
package org.veritasopher.bibtexparser.parser.base;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BibTeX}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BibTeXVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BibTeX#bibTex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBibTex(BibTeX.BibTexContext ctx);
	/**
	 * Visit a parse tree produced by {@link BibTeX#entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry(BibTeX.EntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link BibTeX#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(BibTeX.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link BibTeX#key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(BibTeX.KeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link BibTeX#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(BibTeX.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link BibTeX#article}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArticle(BibTeX.ArticleContext ctx);
	/**
	 * Visit a parse tree produced by {@link BibTeX#book}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBook(BibTeX.BookContext ctx);
	/**
	 * Visit a parse tree produced by {@link BibTeX#booklet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooklet(BibTeX.BookletContext ctx);
	/**
	 * Visit a parse tree produced by {@link BibTeX#inbook}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInbook(BibTeX.InbookContext ctx);
	/**
	 * Visit a parse tree produced by {@link BibTeX#incollection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncollection(BibTeX.IncollectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BibTeX#inproceedings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInproceedings(BibTeX.InproceedingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BibTeX#proceedings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProceedings(BibTeX.ProceedingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BibTeX#manual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitManual(BibTeX.ManualContext ctx);
	/**
	 * Visit a parse tree produced by {@link BibTeX#mastersthesis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMastersthesis(BibTeX.MastersthesisContext ctx);
	/**
	 * Visit a parse tree produced by {@link BibTeX#phdthesis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhdthesis(BibTeX.PhdthesisContext ctx);
	/**
	 * Visit a parse tree produced by {@link BibTeX#misc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMisc(BibTeX.MiscContext ctx);
	/**
	 * Visit a parse tree produced by {@link BibTeX#techreport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTechreport(BibTeX.TechreportContext ctx);
	/**
	 * Visit a parse tree produced by {@link BibTeX#unpublished}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpublished(BibTeX.UnpublishedContext ctx);
}