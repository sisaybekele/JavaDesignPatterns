package com.designpatterns.java;
import  com.designpatterns.abstractfactory.*;
import com.designpatterns.base.BikeInterface;
import com.designpatterns.base.NarrowWheel;
import com.designpatterns.base.RoadBike;
import com.designpatterns.base.Touring;
import com.designpatterns.builder.BikeBuilder;
import com.designpatterns.builder.BikeDirector;
import com.designpatterns.builder.RoadBikeBuilder;
import com.designpatterns.builder.RoadBikeDirector;
import com.designpatterns.singleton.SerialNumberGenerator;

public class Main {

    public static void main(String[] args) {
        SingletonExample();
        //builderExample();
       //abstractFactoryExamples();
	// write your code here
    }//end method

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
