package com.designpatterns.Decorator;

import com.designpatterns.base.BikeInterface;

public class GoldFrameOption extends AbstractBikeOption {
    public GoldFrameOption(BikeInterface bike){super(bike);}

    @Override
    public float getprice() {
        return DecoratedBike.getprice() + 300.00f;

    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " (" + getWheel() + ", Gold price = $" + getprice() +")";
    }
}
