package com.designpatterns.singleton;

import sun.security.x509.SerialNumber;

public class SerialNumberGenerator {
    private static SerialNumberGenerator instance;
    private  int Count = 642135;

    public  synchronized static SerialNumberGenerator getInstance(){
        if(instance ==null){
            instance = new SerialNumberGenerator();
        }//end if statement
        return instance;
    }//end method
    private SerialNumberGenerator(){}
    public synchronized  int getNextSerial(){return ++Count;}



}//end class
