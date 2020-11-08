package CreationalDP.Builders;

import CreationalDP.Builders.abstractions.TransportBuilder;

//Cars builders
public class SaloonBuilder extends TransportBuilder {
    public String getInfoAboutBody() {
        return "Passenger car in a three-box configuration with separate compartments for engine, passenger, and cargo.";
    }
}
