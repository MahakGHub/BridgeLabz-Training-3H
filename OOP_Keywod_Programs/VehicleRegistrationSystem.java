class Vehicle {
    private static double registrationFee = 2000;

    private String ownerName, vehicleType;
    private final String registrationNumber;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public void displayVehicle() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration No: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Arjun", "Car", "DL01AB1234");
        Vehicle v2 = new Vehicle("Sneha", "Bike", "DL05XY5678");

        v1.displayVehicle();
        v2.displayVehicle();

        Vehicle.updateRegistrationFee(2500);
        v1.displayVehicle();
    }
}
