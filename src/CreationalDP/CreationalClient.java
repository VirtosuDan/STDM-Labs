package CreationalDP;

import CreationalDP.Builders.abstractions.TransportBuilder;
import CreationalDP.Factories.FactoryCreator;
import CreationalDP.Factories.abstractions.IAbstractFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreationalClient {

    public  void creational() throws IOException{
         while (true) {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\nEnter the type");
            String type = input.readLine();
             if (type.length() == 0)
             {
                 break;
             }
            System.out.println("\nEnter the brand");
            String brand = input.readLine();
            System.out.println("\nEnter the model");
            String model = input.readLine();
            System.out.println("\nEnter the body");
            String body = input.readLine();

            FactoryCreator creator = FactoryCreator.getInstance();
            IAbstractFactory TransportFactory = creator.getFactory(type);
            TransportBuilder builder = TransportFactory.getBuilder(body);
            builder.addBrand(brand);
            builder.addModel(model);
            builder.addType(type);
            builder.addBody(body);
            builder.getInfoAboutBody();
           }
    }
}
