package com.mjc.stage2.entity;

public class SymbolLeaf extends AbstractTextComponent{

    private char value;

    public SymbolLeaf(TextComponentType componentType, char value) {
        super(componentType);
        this.value = value;
    }

    @Override
    public String operation() {
        return String.valueOf(value);
    }

    @Override
    public void add(AbstractTextComponent textComponent) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void remove(AbstractTextComponent textComponent) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public int getSize() {
        throw new UnsupportedOperationException("This operation is not supported");
    }
}
