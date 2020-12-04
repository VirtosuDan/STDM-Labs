package BehavioralDP;

public class ChangeWinterWheels implements IChangingWheelsStrategy{
    @Override
    public void changeWheels() {
        System.out.println("If the temperature outside is less than 7 grades or is snowing , change to Winter WHeels!");
    }
}
