package com.designpatterns.Decorator;

import com.designpatterns.base.BikeInterface;

public class WhiteTireOption extends AbstractBikeOption {
    public WhiteTireOption(BikeInterface bike){super(bike);}

    @Override
    public float getprice() {
        return DecoratedBike.getprice()+ 80.00f;
    }
}
