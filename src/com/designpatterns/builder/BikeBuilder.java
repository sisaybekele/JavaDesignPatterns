package com.designpatterns.builder;

import com.designpatterns.base.BikeInterface;

public abstract class BikeBuilder {
    public abstract BikeInterface getBike();
    public void buildStreetTires(){ }
    public void buildwideTires(){}
    public void buildHandleBars(){}
}//end class
