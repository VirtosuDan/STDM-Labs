package StructuralDP.Proxy;
import StructuralDP.Proxy.abstractions.IRepair;

//Schedule a service from phone
public class TransportServiceProxy implements IRepair {

    private boolean isScheduled;
    private TransportService transportService;

    public TransportServiceProxy() {
        this.isScheduled = false;
        this.transportService = new TransportService();
    }

    public boolean isScheduled(){
        return isScheduled;
    }
    public void setScheduled(boolean scheduled){
        isScheduled = scheduled;
    }

    private void scheduleByPhone(){
        System.out.println("Scheduled for service succesfully");
        this.isScheduled = true;
    }

    @Override
    public void callToService() {
        scheduleByPhone();
        if(this.isScheduled){
            this.transportService.callToService();
        }

    }
}
