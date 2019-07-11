package com.designpatterns.Decorator;

import com.designpatterns.base.BikeInterface;

public class LeatherSeatOption extends AbstractBikeOption {
    public  LeatherSeatOption(BikeInterface bike){super(bike);}

    @Override
    public float getprice() {
        return DecoratedBike.getprice()+ 40.00f;
    }
}
