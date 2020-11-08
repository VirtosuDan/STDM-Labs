package CreationalDP.Builders;

import CreationalDP.Builders.abstractions.TransportBuilder;

public class SuvBuilder extends TransportBuilder {
    public String getInfoAboutBody() {
        return "Car classification that combines elements of road-going passenger cars with features from off-road vehicles.";
    }
}
