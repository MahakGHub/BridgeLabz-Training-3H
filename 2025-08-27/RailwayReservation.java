import java.util.*;

public class RailwayReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("1. VandeBharat Train - Fare: 500");
        System.out.println("2. SuperFast Train - Fare: 800");
        System.out.println("3. Rajdhani Train - Fare: 1200");

        System.out.print("Choose train (1/2/3): ");
        int choice = sc.nextInt();
        int fare = 0, totalSeats = 0;

        switch (choice) {
            case 1:
                fare = 500;
                totalSeats = 3; 
                System.out.println("You selected VandeBharat Train.");
                break;
            case 2:
                fare = 800;
                totalSeats = 2;
                System.out.println("You selected SuperFast Train.");
                break;
            case 3:
                fare = 1200;
                totalSeats = 1;
                System.out.println("You selected Rajdhani Train.");
                break;
            default:
                System.out.println("Invalid choice! Defaulting to Vandebharat Train.");
                fare = 500;
                totalSeats = 3;
        }

        int bookedSeats = 0;
        int waitingList = 0;

        
        do {
            System.out.print("Enter number of passengers for booking: ");
            int passengers = sc.nextInt();

            
            for (int i = 1; i <= passengers; i++) {
                if (bookedSeats < totalSeats) {
                    bookedSeats++;
                    System.out.println("Passenger " + i + " booked successfully. Seat No: " + bookedSeats);
                } else {
                    waitingList++;
                    System.out.println("Passenger " + i + " added to waiting list. WL No: " + waitingList);
                }
            }

            System.out.println("Total seats booked: " + bookedSeats);
            System.out.println("Waiting list: " + waitingList);
            System.out.println("Fare per passenger: " + fare);

           
            if (bookedSeats >= totalSeats) {
                System.out.println("Train is full. No more bookings allowed.");
                break;
            }

            System.out.print("Do you want to book more tickets? (yes/no): ");
        } while (sc.next().equalsIgnoreCase("yes"));

        sc.close();
    }
}

