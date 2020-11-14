import StructuralDP.Adapter.InterstatesSpeed;
import StructuralDP.Adapter.MovableAdapterImplementation;
import StructuralDP.Adapter.RuralSpeed;
import StructuralDP.Adapter.abstractions.IMovable;
import StructuralDP.Adapter.abstractions.IMovableAdapter;
import StructuralDP.Facade.Painter;
import StructuralDP.Proxy.TransportServiceProxy;
import StructuralDP.Proxy.abstractions.IRepair;

public class MainClient {

    public static void main(String[] args) {
       /* while (true) {
            try {
                BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("\nEnter the type");
                String type = input.readLine();
                if (type.length() == 0)
                    break;
                System.out.println("\nEnter the brand");
                String brand = input.readLine();
                System.out.println("\nEnter the model");
                String model = input.readLine();
                System.out.println("\nEnter the body");
                String body = input.readLine();

                FactoryCreator creator = FactoryCreator.getInstance();
                IAbstractFactory TransportFactory = creator.getFactory(type);
                TransportBuilder builder = TransportFactory.getBuilder(body);
                builder.addBrand(brand);
                builder.addModel(model);
                builder.addType(type);
                builder.addBody(body);
                builder.getInfoAboutBody();
                } catch (IOException e) {
                    e.printStackTrace();
                }


        }*/
        //Test for Facade
        Painter painter = new Painter();
        painter.paint("black");
        System.out.println("\n\n");

        //Test for Proxy
        IRepair repairTransport = new TransportServiceProxy();
        repairTransport.callToService();
        System.out.println("\n\n");

        //Test for Adapter
        IMovable interstateSpeed = new InterstatesSpeed();
        IMovableAdapter interstateSpeedAdapter = new MovableAdapterImplementation(interstateSpeed);
        System.out.println("The maximal speed for interstate roads in US is:"+interstateSpeedAdapter.getSpeed()+"km/h");
        IMovable ruralSpeed = new RuralSpeed();
        IMovableAdapter ruralSpeedAdapter = new MovableAdapterImplementation(ruralSpeed);
        System.out.println("The maximal speed for rural roads in US is:"+ruralSpeedAdapter.getSpeed()+"km/h");




        }
    }

