package com.mjc.stage2.parser;

import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.TextComponent;
import com.mjc.stage2.entity.TextComponentType;

import java.util.List;

public class LexemeParser extends AbstractTextParser{
    private static final String LEXEME_REGEX = "\\s+";
    private static final String WORD_REGEX = "\\w[\\w!=?():]+";

    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        List<String> lexemes = List.of(string.split(LEXEME_REGEX));
        lexemes.stream()
                .filter(s -> s.matches(WORD_REGEX))
                .forEach(s -> abstractTextComponent.add(new TextComponent(TextComponentType.SENTENCE)));
    }
}
