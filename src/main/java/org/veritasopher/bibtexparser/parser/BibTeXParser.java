package org.veritasopher.bibtexparser.parser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.veritasopher.bibtexparser.parser.base.BibTeX;
import org.veritasopher.bibtexparser.parser.base.BibTeXLexer;
import org.veritasopher.bibtexparser.parser.core.BibVisitor;
import org.veritasopher.bibtexparser.parser.exception.ThrowingErrorListener;
import org.veritasopher.bibtexparser.parser.exception.type.ParsingException;
import org.veritasopher.bibtexparser.parser.model.Bib;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * BibTeX Parser
 *
 * @author Yepeng Ding
 */
public class BibTeXParser {

    /**
     * Parse a BibTeX source file
     *
     * @param filePath BibTeX file path
     * @return Bib object
     */
    public Bib parse(String filePath) {
        Bib bib;

        try {
            // Read file as a char stream
            CharStream charStream = CharStreams.fromStream(new FileInputStream(filePath));

            // Generate a parse tree from the char stream
            ParseTree parseTree = getParseTreeFromSource(charStream);

            // Instantiate the BibVisitor (root visitor)
            BibVisitor bibVisitor = new BibVisitor();
            bib = bibVisitor.visit(parseTree);
        } catch (IOException exception) {
            throw new ParsingException(exception.getLocalizedMessage());
        }

        return bib;
    }

    /**
     * Generate a parse tree from a given char stream
     *
     * @param source char stream
     * @return parse tree
     */
    public ParseTree getParseTreeFromSource(CharStream source) {
        BibTeXLexer lexer = new BibTeXLexer(source);
        lexer.removeErrorListeners();
        lexer.addErrorListener(ThrowingErrorListener.INSTANCE);
        BibTeX parser = new BibTeX(new CommonTokenStream(lexer));
        parser.removeErrorListeners();
        parser.addErrorListener(ThrowingErrorListener.INSTANCE);
        parser.setBuildParseTree(true);
        return parser.bibTex();
    }

}
