package com.designpatterns.adapter;

public class UltraWheel {
    private  int size;


    public  UltraWheel ( int  Size){
        this.size = Size;
    }//end constractor
    public int getWheelSize(){
        return  size;
    }//end method

    @Override
    public String toString() {
        return " Ultra Wheel "  +  "  (" + size +" )  inches";
    }
}//end class
