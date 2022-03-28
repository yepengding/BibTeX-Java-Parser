package org.veritasopher.bibtexparser.parser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.veritasopher.bibtexparser.parser.base.BibTeX;
import org.veritasopher.bibtexparser.parser.base.BibTeXLexer;
import org.veritasopher.bibtexparser.parser.exception.ThrowingErrorListener;

public class BibTeXParser {

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
