package com.mjc.stage2.impl;

import com.mjc.stage2.Observer;
import com.mjc.stage2.entity.RectangleValues;
import com.mjc.stage2.event.RectangleEvent;
import com.mjc.stage2.warehouse.RectangleWarehouse;

public class RectangleObserver implements Observer {
    @Override

    public void handleEvent(RectangleEvent event) {
        RectangleWarehouse.getInstance().put(event.getSource().getId(),
                new RectangleValues(event.getSource().getSideA()*event.getSource().getSideB(),
                        2*(event.getSource().getSideA()+event.getSource().getSideB())));
    }
}
