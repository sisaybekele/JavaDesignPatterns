package com.designpatterns.observer;

import java.util.Observable;

public class Speedometer extends Observable {
    private int CurrentSpeed;

    public Speedometer(){
        CurrentSpeed = 0;
    }

    public  int getCurrentSpeed(){
        return  CurrentSpeed;
    }
    public void SeatCurrentSpeed( int speed){
        this.CurrentSpeed = speed;

        setChanged();
        notifyObservers();
    }
}//end class
