package com.designpatterns.visitor;

import sun.reflect.generics.visitor.Visitor;

public class Spokes implements VisitableInterface {

    @Override
    public void acceptVisitor(WheelVisitorInterface visitor) {
        visitor.visit(this);

    }
}
