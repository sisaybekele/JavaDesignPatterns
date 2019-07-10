package com.designpatterns.abstractfactory;

public class RoadBikeFactory extends AbstractBikeFactory {
    @Override
   public BikeFrameInterface CreateFrame() {
        return new RoadFrame();
    }

    @Override
   public BikeSeatInterface CreateSeat() {
        return new RoadSeat();
    }
}
