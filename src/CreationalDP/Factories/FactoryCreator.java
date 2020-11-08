package CreationalDP.Factories;

import CreationalDP.Factories.abstractions.IAbstractFactory;

public final class FactoryCreator {
    //Singleton Desing Patter
    private static FactoryCreator instance = null;

    private FactoryCreator() {}
    public static FactoryCreator getInstance() {
                if (instance == null) {
                    instance = new FactoryCreator();
                }
        return instance;
    }

    public IAbstractFactory getFactory(String car1) {
        IAbstractFactory factory = null;
        if(car1.equals("Bike") || car1.equals("bike")){
            factory = new BikeFactory();
        }
        else if(car1.equals("Car") || car1.equals("car")){
            factory = new CarFactory();
        }
        else if(car1.equals("Truck") || car1.equals("truck")){
            factory = new Big_CarFactory();
        }
        else
        {
            System.out.println("No such transport exists.");
        }

        return factory;
    }
}
