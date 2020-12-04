import BehavioralDP.BehavioralClient;
import CreationalDP.CreationalClient;
import StructuralDP.StructuralClient;

import java.io.IOException;
import java.util.Scanner;

public class MainClient {

    public static void main(String[] args) throws IOException {
            while (true) {
            System.out.println("\n\n\t\t\t\t\t\t\t\tWelcome to my Transport App \n\t\t\t In order to perform operations please choose a number:");
            System.out.println("\t\t\t\t\t1.Buy a new Transport");
            System.out.println("\t\t\t\t\t2.Color the body of your Transport");
            System.out.println("\t\t\t\t\t3.Schedule for a service");
            System.out.println("\t\t\t\t\t4.Adapt your speed form MPH in KMPH");
            System.out.println("\t\t\t\t\t5.Change your wheels depending of the season");
            System.out.println("\t\t\t\t\t6.Exit");

            Scanner input = new Scanner(System.in);

                String operation = input.next();
                switch (operation) {
                    case "1":
                        CreationalClient client = new CreationalClient();
                        client.creational();
                    case "2":
                        StructuralClient structuralClient = new StructuralClient();
                        structuralClient.facade();
                        break;
                    case "3":
                        StructuralClient structuralClient2 = new StructuralClient();
                        structuralClient2.proxy();
                        break;
                    case "4":
                        StructuralClient structuralClient3 = new StructuralClient();
                        structuralClient3.adapter();
                        break;
                    case "5":
                        BehavioralClient behavioralClient = new BehavioralClient();
                        behavioralClient.behavioral();
                        break;
                    case "6":
                        System.exit(0);
                        break;
                    default:
                        System.out.println("No such command");
                }
            }

        }
    }

