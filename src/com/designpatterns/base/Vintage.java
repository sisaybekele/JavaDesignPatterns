package com.designpatterns.base;

import com.designpatterns.java.BikeColor;

public class Vintage extends RoadBike {
    public Vintage(WheelInterface Wheel, BikeColor Color){
        super(Wheel,Color);
    }
    public Vintage(WheelInterface Wheel){
        this(Wheel,BikeColor.RED);
    }

    @Override
    public float getprice() {
        return 600.00f;
    }
}
