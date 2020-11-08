package StructuralDP.Adapter;

import StructuralDP.Adapter.abstractions.IMovable;

public class RuralSpeed implements IMovable {
    @Override
    public double getSpeed() {
        return 30;
    }
}
