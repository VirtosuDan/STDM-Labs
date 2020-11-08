package CreationalDP.models;

public class Transport {
    private String brand = "";
    private String model = "";
    private String type = "";
    private String body = "";

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBody(String body) {
        this.body = body;
    }

    String getModel() {
        return this.model;
    }

    String getType() {
        return this.type;
    }

    String getBody() {
        return this.body;
    }
}
