package org.veritasopher.bibtexparser.parser.model.type;

/**
 * BibTeX Value Type
 *
 * @author Yepeng Ding
 */
public enum ValueType {

    INTEGER {
        @Override
        public Class<?> getTypeClass() {
            return Integer.class;
        }
    },

    STRING {
        @Override
        public Class<?> getTypeClass() {
            return String.class;
        }
    };

    public abstract Class<?> getTypeClass();

}
