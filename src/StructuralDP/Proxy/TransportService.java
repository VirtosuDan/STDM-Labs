package StructuralDP.Proxy;

import StructuralDP.Proxy.abstractions.IRepair;

public class TransportService implements IRepair {
    @Override
    public void callToService() {
        System.out.println("Reservation complete!");
    }
}
