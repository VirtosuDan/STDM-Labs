package CreationalDP.Factories;

import CreationalDP.Builders.CabrioletBuilder;
import CreationalDP.Builders.SaloonBuilder;
import CreationalDP.Builders.SuvBuilder;
import CreationalDP.Factories.abstractions.IAbstractFactory;
import CreationalDP.Builders.abstractions.TransportBuilder;

public class CarFactory implements IAbstractFactory {
    public TransportBuilder getBuilder(String body) {
        TransportBuilder builder = null;
        if(body.equals("Saloon") || body.equals("saloon")){
            builder= new SaloonBuilder();
        }
        else if(body.equals("Suv") || body.equals("suv")){
            builder= new SuvBuilder();
        }
        else if(body.equals("Cabriolet") || body.equals("cabriolet") || body.equals("cabri")){
            builder = new CabrioletBuilder();
        }
        else
        {
            System.out.println("No such body exists");
        }
        return builder;
    }
}