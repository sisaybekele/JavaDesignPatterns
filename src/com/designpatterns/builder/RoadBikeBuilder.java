package com.designpatterns.builder;

import com.designpatterns.base.BikeInterface;
import com.designpatterns.base.RoadBike;

public class RoadBikeBuilder extends BikeBuilder {

    private RoadBike bikeInprogerss;
    public RoadBikeBuilder(RoadBike bike){
        this.bikeInprogerss = bike;
    }
    @Override
    public BikeInterface getBike() {
        return bikeInprogerss;
    }

    @Override
    public void buildHandleBars() {
        super.buildHandleBars();
        System.out.println("building Handle Bars");
    }

    @Override
    public void buildStreetTires(){
        System.out.println("Buildeing Street Tires");
    }


}//end class
