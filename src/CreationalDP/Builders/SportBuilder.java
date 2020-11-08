package CreationalDP.Builders;

import CreationalDP.Builders.abstractions.TransportBuilder;

public class SportBuilder extends TransportBuilder {
    public String getInfoAboutBody() {
        return "Sport bike , with powerful engine , needs driver licence";
    }
}
