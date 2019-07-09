package com.designpatterns.base;

import com.designpatterns.java.BikeColor;

public class CrossCountry extends MountainBike {
    public  CrossCountry(WheelInterface Wheel, BikeColor Color){
        super(Wheel,Color);
    }
    public CrossCountry(WheelInterface Wheel){
        this(Wheel,BikeColor.ORANGE);
    }
}
