package com.designpatterns.abstractfactory;

public abstract class AbstractBikeFactory {
   public abstract BikeFrameInterface CreateFrame();
   public abstract BikeSeatInterface CreateSeat();
}
