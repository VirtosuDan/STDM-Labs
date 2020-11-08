package CreationalDP.Factories;

import CreationalDP.Builders.ScooterBuilder;
import CreationalDP.Builders.SportBuilder;
import CreationalDP.Builders.ThreeWheelBuilder;
import CreationalDP.Factories.abstractions.IAbstractFactory;
import CreationalDP.Builders.abstractions.TransportBuilder;

public class BikeFactory implements IAbstractFactory {
    public TransportBuilder getBuilder(String body) {

        TransportBuilder builder = null;
        if(body.equals("Scooter") || body.equals("scooter")){
            builder= new ScooterBuilder();
        }
        else if(body.equals("Sport") || body.equals("sport")){
            builder= new SportBuilder();
        }
        else if(body.equals("3Wheel") || body.equals("ThreeWheel") || body.equals("threewheel")){
            builder = new ThreeWheelBuilder();
        }
        else
        {
            System.out.println("No such body exists");
        }
        return builder;
    }
}

