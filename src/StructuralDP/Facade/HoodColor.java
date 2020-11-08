package StructuralDP.Facade;

import StructuralDP.Facade.abstractions.IBodyColor;

public class HoodColor implements IBodyColor {

    @Override
    public void changeColor(String color) {
        System.out.println("Color hood in:\t"+color);
    }
}
