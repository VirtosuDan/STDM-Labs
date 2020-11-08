package CreationalDP.Builders;

import CreationalDP.Builders.abstractions.TransportBuilder;

//Bikes builders
public class ScooterBuilder extends TransportBuilder {
    public String getInfoAboutBody() {
        return "Small bike up to 50 cm3 , no driver license needed";
    }
}
