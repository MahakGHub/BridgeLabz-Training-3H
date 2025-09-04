
public class VehicleMain {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Alice", "Car");
        Vehicle v2 = new Vehicle("Bob", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(7000);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
