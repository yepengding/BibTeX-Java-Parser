package org.veritasopher.bibtexparser.parser.exception.type;


import org.veritasopher.bibtexparser.parser.exception.BaseException;

public class ParsingException extends BaseException {
    public ParsingException(String message) {
        super(message);
    }

    public ParsingException(String source, String message) {
        super(source, message);
    }

    public ParsingException(String source, String message, Throwable cause) {
        super(source, message, cause);
    }

    public ParsingException(String source, int line, String message) {
        super(source, line, message);
    }

    public ParsingException(String source, int line, int col, String message) {
        super(source, line, col, message);
    }
}
