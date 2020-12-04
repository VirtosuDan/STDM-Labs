package StructuralDP;

import StructuralDP.Adapter.InterstatesSpeed;
import StructuralDP.Adapter.MovableAdapterImplementation;
import StructuralDP.Adapter.RuralSpeed;
import StructuralDP.Adapter.abstractions.IMovable;
import StructuralDP.Adapter.abstractions.IMovableAdapter;
import StructuralDP.Facade.Painter;
import StructuralDP.Proxy.TransportServiceProxy;
import StructuralDP.Proxy.abstractions.IRepair;

import java.util.Scanner;

public class StructuralClient {
    public void facade(){
        System.out.println("Choose a color to paint your body , wheels and hood:");
        Scanner input = new Scanner(System.in);
        String color  = input.next();
        Painter painter = new Painter();
        painter.paint(color);
    }
    public void proxy(){
        IRepair repairTransport = new TransportServiceProxy();
        repairTransport.callToService();
    }
    public void adapter(){
        IMovable interstateSpeed = new InterstatesSpeed();
        IMovableAdapter interstateSpeedAdapter = new MovableAdapterImplementation(interstateSpeed);
        System.out.println("The maximal speed for interstate roads in US is 65 MPH or :"+interstateSpeedAdapter.getSpeed()+"km/h");
        IMovable ruralSpeed = new RuralSpeed();
        IMovableAdapter ruralSpeedAdapter = new MovableAdapterImplementation(ruralSpeed);
        System.out.println("The maximal speed for rural roads in US is 30 MPH or :"+ruralSpeedAdapter.getSpeed()+"km/h");
    }
}
