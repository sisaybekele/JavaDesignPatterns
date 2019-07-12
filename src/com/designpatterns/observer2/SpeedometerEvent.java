package com.designpatterns.observer2;

import java.util.EventObject;

public class SpeedometerEvent extends EventObject {
    private  int Speed;
public SpeedometerEvent(Object obj, int Speed) {
    super(obj);
    this.Speed = Speed;
}

public int getSpeed (){return Speed;}
}
