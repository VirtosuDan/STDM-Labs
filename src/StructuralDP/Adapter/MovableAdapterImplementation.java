package StructuralDP.Adapter;

import StructuralDP.Adapter.abstractions.IMovable;
import StructuralDP.Adapter.abstractions.IMovableAdapter;

public class MovableAdapterImplementation implements IMovableAdapter {
    private IMovable movable;

    public MovableAdapterImplementation(IMovable movable) {
        this.movable = movable;
    }

    @Override
    public double getSpeed() {
        double mph = movable.getSpeed();
        return convertMPHtoKMPH(mph);
    }

    private double convertMPHtoKMPH(double mph){
        return mph*1.60934;
    }
}
