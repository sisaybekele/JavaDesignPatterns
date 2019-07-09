package com.designpatterns.base;

import com.designpatterns.java.BikeColor;

public class Touring extends RoadBike {

    public Touring(WheelInterface Wheel, BikeColor Color){
        super(Wheel,Color);
    }
    public  Touring(WheelInterface Wheel){
        this(Wheel,BikeColor.BLUE);
    }

}
