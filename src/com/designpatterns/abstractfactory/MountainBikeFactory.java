package com.designpatterns.abstractfactory;

public class MountainBikeFactory extends AbstractBikeFactory {
    @Override
   public BikeFrameInterface CreateFrame() {
        return new MountainFrame();
    }

    @Override
    public BikeSeatInterface CreateSeat() {
        return new MountainSeat();
    }
}
