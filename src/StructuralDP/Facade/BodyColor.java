package StructuralDP.Facade;

import StructuralDP.Facade.abstractions.IBodyColor;

public class BodyColor implements IBodyColor {
    @Override
    public void changeColor(String color) {
        System.out.println("Color body in:\t"+color);
    }
}
