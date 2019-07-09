package com.designpatterns.base;

import com.designpatterns.java.BikeColor;

public class DownHill extends MountainBike {
    public DownHill(WheelInterface Wheel, BikeColor Color){
        super(Wheel,Color);
    }
    public DownHill(WheelInterface Wheel){
        this(Wheel,BikeColor.GREEN);

    }
}
