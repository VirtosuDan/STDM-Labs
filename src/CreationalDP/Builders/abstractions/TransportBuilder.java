package CreationalDP.Builders.abstractions;

import CreationalDP.models.Transport;

public abstract class TransportBuilder {
    private Transport transport;

    public Transport getTransport() {
        return transport = new Transport();
    }
    public void addBrand(String brand) {
        transport.setBrand(brand);
    }
    public void addModel(String model) {
        transport.setModel(model);
    }
    public void addType(String type) {
        transport.setType(type);
    }
    public void addBody(String body) {
        transport.setBody(body);
    }

    public abstract String getInfoAboutBody();
}


