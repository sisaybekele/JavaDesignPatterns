package com.designpatterns.abstractfactory;

public class MountainSeat implements BikeSeatInterface {
    @Override
    public String getSeatParts() {
        return "Seat parts for the mountain Bike.";
    }
}
