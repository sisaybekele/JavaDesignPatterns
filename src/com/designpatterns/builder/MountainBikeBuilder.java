package com.designpatterns.builder;

import com.designpatterns.base.BikeInterface;
import com.designpatterns.base.MountainBike;

public class MountainBikeBuilder extends BikeBuilder {

    private MountainBike bikeInprogress;
    public  MountainBikeBuilder(MountainBike bike){
        this.bikeInprogress = bike;
    }


    @Override
    public BikeInterface getBike() {
        return bikeInprogress;
    }

    @Override
    public void buildHandleBars() {
        System.out.println("Building Handle Bars");
    }

    @Override
    public void buildwideTires() {
        System.out.println("Building  Wide Tires");
    }
}//end class
