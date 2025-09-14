class Patient {
    private static String hospitalName = "AIIMS";
    private static int totalPatients = 0;

    private String name, ailment;
    private int age;
    private final int patientID;

    Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public void displayPatient() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient p1 = new Patient("Rahul", 30, "Fever", 101);
        Patient p2 = new Patient("Simran", 25, "Cold", 102);

        p1.displayPatient();
        p2.displayPatient();
        Patient.getTotalPatients();
    }
}
