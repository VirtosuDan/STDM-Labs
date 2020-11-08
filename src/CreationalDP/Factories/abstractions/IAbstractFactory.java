package CreationalDP.Factories.abstractions;

import CreationalDP.Builders.abstractions.TransportBuilder;

public interface IAbstractFactory {
    TransportBuilder getBuilder(String body);
}
