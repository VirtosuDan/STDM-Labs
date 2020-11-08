package CreationalDP.Builders;

import CreationalDP.Builders.abstractions.TransportBuilder;

//Trucks Builders
public class SmallBuilder extends TransportBuilder {
    public String getInfoAboutBody() {
        return "Truck with maximal weight of 7.5T";
    }
}
