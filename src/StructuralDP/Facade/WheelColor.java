package StructuralDP.Facade;

import StructuralDP.Facade.abstractions.IBodyColor;

public class WheelColor implements IBodyColor {
    @Override
    public void changeColor(String color) {
        System.out.println("Color wheel in:\t"+color);
    }
}
