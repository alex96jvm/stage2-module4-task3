package com.mjc.stage2.parser;

import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;
import com.mjc.stage2.entity.TextComponentType;

public class LexemeParser extends AbstractTextParser{
    private static final String LEXEME_REGEX = "\\s+";
    private static final String WORD_REGEX = "\\w[\\w!=?():]+";

    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        String[] lexemes = string.split("(?<=\\s)|(?=\\s)");
        for (String lexeme : lexemes) {
            if (lexeme.matches(LEXEME_REGEX)) {
                abstractTextComponent.add(new SymbolLeaf(TextComponentType.SYMBOL, ' '));
            } else {
                if (nextParser != null) {
                    nextParser.parse(abstractTextComponent, lexeme);
                }
            }
        }
    }
}