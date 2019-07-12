package com.designpatterns.java;
import com.designpatterns.Decorator.CustomGripOption;
import com.designpatterns.Decorator.GoldFrameOption;
import  com.designpatterns.abstractfactory.*;
import com.designpatterns.adapter.UltraWheel;
import com.designpatterns.adapter.UltraWheelAdapter;
import com.designpatterns.base.*;
import com.designpatterns.behavioral.MountainBikeRange;
import com.designpatterns.behavioral.RoadBikeRange;
import com.designpatterns.builder.BikeBuilder;
import com.designpatterns.builder.BikeDirector;
import com.designpatterns.builder.RoadBikeBuilder;
import com.designpatterns.builder.RoadBikeDirector;
import com.designpatterns.facade.BikeFacade;
import com.designpatterns.observer.Gearbox;
import com.designpatterns.observer.SpeedMonitor;
import com.designpatterns.observer.Speedometer;
import com.designpatterns.singleton.SerialNumberGenerator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        observerExample2();
        //observerExample();
        //iterattorExample2();
        //iteratorExample();
        //facadeExample();
        //DecoratedExample();
        //AdapterExample();
        //SingletonExample();
        //builderExample();
       //abstractFactoryExamples();
	// write your code here
    }//end method

    private static void observerExample2(){
        com.designpatterns.observer2.Speedometer Speed
                = new com.designpatterns.observer2.Speedometer();
        Speed.addSpeedometerListener(new com.designpatterns.observer2.SpeedMonitor());
        Speed.addSpeedometerListener(new com.designpatterns.observer2.Gearbox());

        Speed.SetCurrentSpeed(5);
        Speed.SetCurrentSpeed(10);
        Speed.SetCurrentSpeed(20);
        Speed.SetCurrentSpeed(30);
        Speed.SetCurrentSpeed(35);

    }

    private static void observerExample(){
        SpeedMonitor monitor = new SpeedMonitor();
        Speedometer speed = new Speedometer();
        speed.addObserver(monitor);
        speed.addObserver(new Gearbox());

        speed.SeatCurrentSpeed(5);
        speed.SeatCurrentSpeed(10);
        speed.SeatCurrentSpeed(15);
        speed.SeatCurrentSpeed(20);
        speed.SeatCurrentSpeed(26);
        speed.SeatCurrentSpeed(33);
    }

    private static void  iterattorExample2(){
        System.out.println("=== Our Mountain Bikes===");
        MountainBikeRange bikeRange = new MountainBikeRange();

        for(BikeInterface bike : bikeRange.getRange()){
            System.out.println(bike);
        }
    }

    private static void iteratorExample(){
        System.out.println("=== Our Road Bikes===");
        RoadBikeRange bikeRange = new RoadBikeRange();
        printIterator(bikeRange.iterator());
    }

    private static void printIterator(Iterator iter){
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }

   private static void facadeExample(){
       BikeFacade facade = new BikeFacade();
       facade.prepareForSale(new DownHill(new wideWheel(24)));
   }




   private static void DecoratedExample(){
        BikeInterface myTourBike = new Touring((new NarrowWheel(24)));
        System.out.println(myTourBike);

        myTourBike = new CustomGripOption(myTourBike);
        System.out.println(myTourBike);

        myTourBike = new GoldFrameOption(myTourBike);
        System.out.println(myTourBike);
   }



private  static void AdapterExample(){
    UltraWheel UltraWheel = new UltraWheel (28);
        List<WheelInterface> wheels =  new ArrayList<>();
        wheels.add(new  NarrowWheel (24));
    wheels.add(new  NarrowWheel (20));
    wheels.add(new  wideWheel (24));
    wheels.add(new  UltraWheelAdapter(UltraWheel));
    wheels.add(new  UltraWheelAdapter(new UltraWheel (26)));

    for (WheelInterface wheel :  wheels){
        System.out.println( wheel );
    }


}
private static  void SingletonExample(){
        System.out.println("Generating Serial Number");
    SerialNumberGenerator generator = SerialNumberGenerator.getInstance();
    System.out.println("next Serial = " + generator.getNextSerial());
    System.out.println("next Serial = " + generator.getNextSerial());
    System.out.println("next Serial = " + generator.getNextSerial());
    System.out.println("next Serial = " + generator.getNextSerial());
}//end method

    private static void builderExample(){
        RoadBike bike = new Touring(new NarrowWheel (22));
        BikeBuilder builder = new RoadBikeBuilder(bike);
        BikeDirector director = new RoadBikeDirector();
        BikeInterface bikeInterface =director.build(builder);
        System.out.println(bikeInterface);
    }

    private static void  abstractFactoryExamples(){
        AbstractBikeFactory factory = new RoadBikeFactory();
        BikeFrameInterface frame = factory.CreateFrame();
        BikeSeatInterface Seat =factory.CreateSeat();
        System.out.println(frame.getFrameParts());
        System.out.println(Seat.getSeatParts());
    }
}//end class
