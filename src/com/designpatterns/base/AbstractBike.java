package com.designpatterns.base;

import com.designpatterns.java.BikeColor;

public abstract class AbstractBike implements BikeInterface{
    private  WheelInterface Wheel;
    private BikeColor Color;

    protected AbstractBike(WheelInterface Wheel,BikeColor Color){
        this.Wheel = Wheel;
        this.Color = Color;
    }

protected AbstractBike(WheelInterface Wheel){
this(Wheel,BikeColor.UNPAINTED);
}

    @Override
    public WheelInterface getWheel() {
        return Wheel;
    }

    @Override
    public BikeColor getColor() {
        return Color;
    }

    @Override
    public void paint(BikeColor Color) {
        this.Color = Color;
    }
    @Override
    public float getprice() {
        return 900.00f;
    }


    @Override
    public void CleanFrame() {
        System.out.println("Cleaning Frame.....");
    }

    @Override
    public void airTires() {
        System.out.println("Airing up Tires.....");
    }

    @Override
    public void testRide() {
        System.out.println("Taking bike out for a test ride...");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+
                " ("+Wheel+", "+Color+",price = $"+getprice()+")";
    }


}

