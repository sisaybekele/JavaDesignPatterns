package com.designpatterns.Decorator;

import com.designpatterns.base.AbstractBike;
import com.designpatterns.base.BikeInterface;

public class AbstractBikeOption extends AbstractBike {
    protected BikeInterface DecoratedBike;

    public AbstractBikeOption(BikeInterface bike){
        super(bike.getWheel());
        this.DecoratedBike = bike;
    }
}
