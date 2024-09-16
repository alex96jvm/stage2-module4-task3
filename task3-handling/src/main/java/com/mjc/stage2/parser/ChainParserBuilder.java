package com.mjc.stage2.parser;

import java.util.ArrayList;
import java.util.List;

public class ChainParserBuilder {
    private List<AbstractTextParser> parsers = new ArrayList<>();

    public ChainParserBuilder() {
    }

    public ChainParserBuilder setParser(AbstractTextParser abstractTextParser) {
        parsers.add(abstractTextParser);
        return this;
    }

    public AbstractTextParser build() {
        AbstractTextParser textParser = parsers.getFirst();
        for (int i = 1; i < this.parsers.size(); i++) {
            if (textParser != null) {
                textParser.setNextParser(this.parsers.get(i));
            }
        }
        return textParser;
    }
}
