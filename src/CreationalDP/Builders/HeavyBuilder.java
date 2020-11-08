package CreationalDP.Builders;

import CreationalDP.Builders.abstractions.TransportBuilder;

public class HeavyBuilder extends TransportBuilder {
    public String getInfoAboutBody() {
        return "Truck with minimum weight of 7.5T";
    }
}
