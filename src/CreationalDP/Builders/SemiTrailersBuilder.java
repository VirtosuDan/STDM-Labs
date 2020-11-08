package CreationalDP.Builders;

import CreationalDP.Builders.abstractions.TransportBuilder;

public class SemiTrailersBuilder extends TransportBuilder {
    public String getInfoAboutBody() {
        return "Truck equiped with Trailers.";
    }
}
