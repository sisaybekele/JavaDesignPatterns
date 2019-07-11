package com.designpatterns.base;

import com.designpatterns.java.BikeColor;

public interface BikeInterface {
    WheelInterface getWheel();
    BikeColor getColor();
    float getprice();

    void paint(BikeColor Color);
    void  CleanFrame();
    void  airTires();
    void  testRide();

}
