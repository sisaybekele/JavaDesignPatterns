package com.designpatterns.observer;

import java.util.Observable;
import java.util.Observer;

public class SpeedMonitor implements Observer {
    public static  final int SPEED_TO_ALERT =30;

    @Override
    public void update(Observable obs, Object arg) {
        Speedometer Speedo = (Speedometer)obs;
        if (Speedo.getCurrentSpeed()> SPEED_TO_ALERT){
            System.out.println("** ALERT**Moving too fast!("
                    +Speedo.getCurrentSpeed()+")");
        }else {
            System.out.println("...nice and steady...("
                    +Speedo.getCurrentSpeed()+")");
        }

    }
}
