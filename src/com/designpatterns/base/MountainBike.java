package com.designpatterns.base;

import com.designpatterns.java.BikeColor;

public abstract class MountainBike extends AbstractBike {
    protected  MountainBike(WheelInterface Wheel, BikeColor Color){
        super(Wheel,Color);
    }
    protected  MountainBike(WheelInterface Wheel){
        this(Wheel, BikeColor.CHROME);
    }
}
