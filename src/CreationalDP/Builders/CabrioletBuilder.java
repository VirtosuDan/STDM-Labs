package CreationalDP.Builders;

import CreationalDP.Builders.abstractions.TransportBuilder;

public class CabrioletBuilder extends TransportBuilder {
    public String getInfoAboutBody() {
        return "Passenger car that can be driven with or without a roof in place.";
    }
}
