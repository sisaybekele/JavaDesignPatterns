package com.designpatterns.Decorator;

import com.designpatterns.base.BikeInterface;

public class CustomGripOption extends AbstractBikeOption {
    public CustomGripOption(BikeInterface bike){
        super(bike);}

    @Override
    public float getprice() {
        return DecoratedBike.getprice()+20.00f;
    }
}

