package org.veritasopher.bibtexparser.parser.model;

import org.veritasopher.bibtexparser.parser.model.type.ValueType;

/**
 * BibTeX Entry Field Record
 *
 * @author Yepeng Ding
 */
public record Field(String key, String value, ValueType valueType) {

}
