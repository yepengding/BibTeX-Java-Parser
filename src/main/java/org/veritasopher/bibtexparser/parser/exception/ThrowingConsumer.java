package org.veritasopher.bibtexparser.parser.exception;

import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.veritasopher.bibtexparser.parser.exception.type.InternalException;
import org.veritasopher.bibtexparser.parser.exception.type.ParsingException;

import java.util.function.Consumer;

/**
 * Throwing Consumer Interface
 * Wrapping error throwing in lambda functions
 *
 * @author Yepeng Ding
 */
@FunctionalInterface
public interface ThrowingConsumer<T, E extends Exception> {

    void accept(T t) throws E;

    static <T> Consumer<T> throwingConsumerWrapper(ThrowingConsumer<T, Exception> throwingConsumer) {

        return i -> {
            try {
                throwingConsumer.accept(i);
            } catch (ParseCancellationException e) {
                throw new ParsingException(e.getMessage());
            } catch (Exception e) {
                throw new InternalException(e.getMessage());
            }
        };
    }
}
