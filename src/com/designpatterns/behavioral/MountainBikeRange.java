package com.designpatterns.behavioral;

import com.designpatterns.base.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class MountainBikeRange implements Iterable<BikeInterface>{
    private BikeInterface[]bikes;

    public MountainBikeRange(){
        bikes = new BikeInterface[5];

        bikes[0] = new DownHill(new wideWheel(22));
        bikes[1] = new DownHill(new wideWheel(24));
        bikes[2] = new CrossCountry(new wideWheel(26));
        bikes[3] = new CrossCountry(new wideWheel(24));
        bikes[4] = new CrossCountry(new wideWheel(22));

    }//end constructor

    public BikeInterface[] getRange(){
        return  bikes;

    }//end method

    @Override
    public Iterator<BikeInterface> iterator() {
        return Arrays.asList(bikes).listIterator();
    }
}//end class
