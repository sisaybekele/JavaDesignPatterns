package com.designpatterns.builder;

import com.designpatterns.base.BikeInterface;

public class MountainBikeDirector extends BikeDirector {
    @Override
    public BikeInterface build(BikeBuilder builder) {
        builder.buildHandleBars();
        builder.buildwideTires();
        return builder.getBike();

    }
}
