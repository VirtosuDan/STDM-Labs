package CreationalDP.Builders;

import CreationalDP.Builders.abstractions.TransportBuilder;

public class ThreeWheelBuilder extends TransportBuilder {

    public String getInfoAboutBody() {
        return "Three wheel bike, often equiped with sidecars";
    }
}
