package CreationalDP.Factories;

import CreationalDP.Builders.HeavyBuilder;
import CreationalDP.Builders.SemiTrailersBuilder;
import CreationalDP.Builders.SmallBuilder;
import CreationalDP.Factories.abstractions.IAbstractFactory;
import CreationalDP.Builders.abstractions.TransportBuilder;

public class Big_CarFactory implements IAbstractFactory {
    public TransportBuilder getBuilder(String body) {
        TransportBuilder builder = null;
        if(body.equals("Small") || body.equals("small")){
            builder= new SmallBuilder();
        }
        else if(body.equals("Heavy") || body.equals("heavy")){
            builder= new HeavyBuilder();
        }
        else if(body.equals("Semi-Trailer") || body.equals("semi-trailer") || body.equals("semitrailer")){
            builder = new SemiTrailersBuilder();
        }
        else
        {
            System.out.println("No such body exists");
        }
        return builder;
    }
}
