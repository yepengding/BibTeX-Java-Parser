package org.veritasopher.bibtexparser.parser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.veritasopher.bibtexparser.parser.base.BibTeX;
import org.veritasopher.bibtexparser.parser.base.BibTeXLexer;
import org.veritasopher.bibtexparser.parser.base.BibTeXVisitor;
import org.veritasopher.bibtexparser.parser.core.BibVisitor;
import org.veritasopher.bibtexparser.parser.exception.ThrowingErrorListener;
import org.veritasopher.bibtexparser.parser.model.Bib;

import java.io.FileInputStream;
import java.io.IOException;

public class BibTeXParser {

    public Bib parse(String filePath) throws IOException {
        CharStream charStream = CharStreams.fromStream(new FileInputStream(filePath));

        ParseTree parseTree = getParseTreeFromSource(charStream);

        BibVisitor bibVisitor = new BibVisitor();

        return bibVisitor.visit(parseTree);
    }

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
