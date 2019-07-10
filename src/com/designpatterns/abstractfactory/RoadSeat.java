package com.designpatterns.abstractfactory;

public class RoadSeat implements  BikeSeatInterface {
    @Override
    public String getSeatParts() {
        return "Seat parts For the Road Bike.";
    }
}
