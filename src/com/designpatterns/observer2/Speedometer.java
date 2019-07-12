package com.designpatterns.observer2;

import javax.xml.bind.Unmarshaller;
import java.util.ArrayList;
import java.util.List;

public class Speedometer {
    private  int CurrentSpeed;
    private List<SpeedometerListener> Listeners;

    public  Speedometer(){
        CurrentSpeed = 0;
        Listeners = new ArrayList<>();
    }//end constructor
    public void SetCurrentSpeed(int speed){
        this.CurrentSpeed = speed;
        firstSpeedChanged();
    }//end method
    public int getCurrentSpeed(){return CurrentSpeed;}

    public void addSpeedometerListener(SpeedometerListener obj) {
        Listeners.add(obj);
    }

    public void removeSpeedometerListener(SpeedometerListener obg){
        Listeners.remove(obg);
    }

    private  void  firstSpeedChanged(){
        SpeedometerEvent SpeedEvent = new SpeedometerEvent(this,getCurrentSpeed());
        for(SpeedometerListener Listen : Listeners){
            Listen.SpeedChange(SpeedEvent);
        }
    }
}
