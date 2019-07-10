package com.designpatterns.base;

public abstract class Abstractwheel implements WheelInterface{

    private int Size;
    private boolean wide;

    public Abstractwheel(int Size,boolean wide){
        this.Size = Size;
        this.wide = wide;
    }

    @Override
    public int getSize() {
        return Size;
    }

    @Override
    public boolean isWide() {
        return wide;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()  +"at" +Size+ "inches";
    }

}
