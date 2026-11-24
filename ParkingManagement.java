
import java.util.Scanner;

public class ParkingManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice, vehicleType, hours, continueChoice;
        int slots = 10;
        int fee;

        while (true) {

            System.out.println("\n=================================");
            System.out.println("     PARKING MANAGEMENT SYSTEM");
            System.out.println("=================================");
            System.out.println("1. Vehicle Entry");
            System.out.println("2. Vehicle Exit");
            System.out.println("3. Check Parking Slots");
            System.out.println("4. Exit Application");

            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    if (slots > 0) {

                        System.out.println("1. Bike  2. Car  3. Bus");
                        System.out.print("Enter Vehicle Type: ");
                        vehicleType = sc.nextInt();

                        if (vehicleType >= 1 && vehicleType <= 3) {

                            slots--;

                            System.out.println("Vehicle Entry Successful!");
                            System.out.println("Available Slots: " + slots);

                        } else {
                            System.out.println("Invalid Vehicle Type!");
                        }

                    } else {
                        System.out.println("Parking is Full!");
                    }

                    break;

                case 2:

                    if (slots < 10) {

                        System.out.println("1. Bike  2. Car  3. Bus");
                        System.out.print("Enter Vehicle Type: ");
                        vehicleType = sc.nextInt();

                        System.out.print("Enter Parking Hours: ");
                        hours = sc.nextInt();

                        if (vehicleType >= 1 && vehicleType <= 3 && hours > 0) {

                            fee = hours * (vehicleType == 1 ? 10 :
                                   vehicleType == 2 ? 20 : 30);

                            slots++;

                            System.out.println("Vehicle Exit Successful!");
                            System.out.println("Parking Fee: Rs." + fee);
                            System.out.println("Available Slots: " + slots);

                        } else {
                            System.out.println("Invalid Vehicle Type or Hours!");
                        }

                    } else {
                        System.out.println("No Vehicle Available!");
                    }

                    break;

                case 3:

                    System.out.println("Available Slots: " + slots);
                    break;

                case 4:

                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice!");
            }

            System.out.println("\nDo you want to continue?");
            System.out.println("1. Yes  2. No");

            continueChoice = sc.nextInt();

            if (continueChoice == 2) {
                System.out.println("Returning to Main Menu...");
                continue;
            }
        }
    }
}

