package com.designpatterns.adapter;

import com.designpatterns.base.Abstractwheel;

    public class UltraWheelAdapter extends Abstractwheel{
        public  UltraWheelAdapter(UltraWheel ultraWheel){
            //public AbstractWheel(int Size,boolean wide)
            super(ultraWheel.getWheelSize(),false);
        }
    }

