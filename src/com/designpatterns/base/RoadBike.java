package com.designpatterns.base;

import com.designpatterns.java.BikeColor;

public abstract class RoadBike extends AbstractBike{

    protected  RoadBike(WheelInterface Wheel, BikeColor Color){
        super(Wheel,Color);
    }
    protected RoadBike(WheelInterface Wheel) {
        this(Wheel, BikeColor.BLACK);
    }

    @Override
    public float getprice() {
        return 670.00f;
    }
}


