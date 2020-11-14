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

    public void paint(String color){
        wheel.changeColor(color);
        body.changeColor(color);
        hood.changeColor(color);
    }
}
