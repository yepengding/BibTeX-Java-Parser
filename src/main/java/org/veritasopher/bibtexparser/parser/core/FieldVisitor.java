package org.veritasopher.bibtexparser.parser.core;

import org.veritasopher.bibtexparser.parser.base.BibTeX;
import org.veritasopher.bibtexparser.parser.base.BibTeXBaseVisitor;
import org.veritasopher.bibtexparser.parser.exception.type.ParsingException;
import org.veritasopher.bibtexparser.parser.model.Field;
import org.veritasopher.bibtexparser.parser.model.type.ValueType;

/**
 * BibTeX Entry Field Visitor
 *
 * @author Yepeng Ding
 */
public class FieldVisitor extends BibTeXBaseVisitor<Field> {

    @Override
    public Field visitField(BibTeX.FieldContext ctx) {
        // Check key and value are not null
        if (ctx.key() == null) {
            throw new ParsingException("Filed key is not identified.");
        } else if (ctx.value() == null) {
            throw new ParsingException("Filed (%s) has null value".formatted(ctx.key().IDENTIFIER().getText()));
        }

        // Get key
        String key = ctx.key().IDENTIFIER().getText();

        // Set value and value type
        if (ctx.value().STRING_LITERAL() != null) {
            // String literal
            String value = ctx.value().STRING_LITERAL().getText();
            // Clear two ends
            value = value.substring(1, value.length() - 1);
            return new Field(key, value, ValueType.STRING);
        } else if (ctx.value().INTEGER_LITERAL() != null) {
            // Integer literal
            return new Field(key, ctx.value().INTEGER_LITERAL().getText(), ValueType.INTEGER);
        } else {
            throw new ParsingException("The type of field (%s) value is not supported.");
        }
    }
}
