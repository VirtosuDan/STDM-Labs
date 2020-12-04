package BehavioralDP;
import java.util.Scanner;

public class BehavioralClient {
    public void behavioral() {
        ChangeSummerWheels summerWheels = new ChangeSummerWheels();
        ChangeAllSeasonsWheels allSeasonsWheels = new ChangeAllSeasonsWheels();
        ChangeWinterWheels winterWheels = new ChangeWinterWheels();
        System.out.println("Please enter the current season or if you like Universal Wheels type universal:");
        Scanner scanner = new Scanner(System.in);


            String season = scanner.next();
            if ("Summer".equalsIgnoreCase(season)) {
                summerWheels.changeWheels();
            }else if("Winter".equalsIgnoreCase(season)) {
                winterWheels.changeWheels();
            }else if("Universal".equalsIgnoreCase(season)) {
                allSeasonsWheels.changeWheels();
            }else
                    System.out.println("Not recognized.");
        }
    }
