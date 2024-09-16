package com.mjc.stage2.parser;

import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;
import com.mjc.stage2.entity.TextComponent;
import com.mjc.stage2.entity.TextComponentType;

public class WordParser extends AbstractTextParser{
    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        AbstractTextComponent wordComponent = new TextComponent(TextComponentType.WORD);
        for (char ch : string.toCharArray()) {
            wordComponent.add(new SymbolLeaf(TextComponentType.SYMBOL, ch));
        }
        abstractTextComponent.add(wordComponent);
    }
}
