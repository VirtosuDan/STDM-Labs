package StructuralDP.Facade;

import StructuralDP.Facade.abstractions.IBodyColor;

public class Painter {
    private IBodyColor wheel;
    private IBodyColor body;
    private IBodyColor hood;

    public Painter() {
        wheel = new WheelColor();
        body = new BodyColor();
        hood = new HoodColor();
    }

    public void paintWheel(String color){
        wheel.changeColor(color);
    }
    public void paintBody(String color){
        body.changeColor(color);
    }
    public void paintHood(String color){
        hood.changeColor(color);
    }

}
