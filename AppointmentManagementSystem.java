import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Visitor {
    private String name;
    private int age;
    private String contactNumber;
    private String address;

    public Visitor(String name, int age, String contactNumber, String address) {
        this.name = name;
        this.age = age;
        this.contactNumber = contactNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Address: " + address);
    }
}

class Appointment {
    private String visitorName;
    private String date;
    private String timeSlot;

    public Appointment(String visitorName, String date, String timeSlot) {
        this.visitorName = visitorName;
        this.date = date;
        this.timeSlot = timeSlot;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public void displayDetails() {
        System.out.println("Visitor Name: " + visitorName);
        System.out.println("Date: " + date);
        System.out.println("Time Slot: " + timeSlot);
    }
}

class Clinic {
    private List<Visitor> visitors;
    private Map<String, List<Appointment>> appointments;

    public Clinic() {
        visitors = new ArrayList<>();
        appointments = new HashMap<>();
    }

    public void addVisitor(Visitor visitor) {
        visitors.add(visitor);
    }

    public void editVisitorDetails(String visitorName, String contactNumber, String address) {
        for (Visitor visitor : visitors) {
            if (visitor.getName().equalsIgnoreCase(visitorName)) {
                visitor.setContactNumber(contactNumber);
                visitor.setAddress(address);
                break;
            }
        }
    }

    public void viewVisitorsList() {
        System.out.println("===== Visitors List =====");
        for (Visitor visitor : visitors) {
            System.out.println(visitor.getName());
        }
    }

    public void viewAppointmentSchedule(String date) {
        System.out.println("===== Appointment Schedule for " + date + " =====");
        List<Appointment> appointmentList = appointments.getOrDefault(date, new ArrayList<>());
        for (Appointment appointment : appointmentList) {
            appointment.displayDetails();
        }
    }

    public void bookAppointment(String visitorName, String date, String timeSlot) {
        Appointment appointment = new Appointment(visitorName, date, timeSlot);
        List<Appointment> appointmentList = appointments.getOrDefault(date, new ArrayList<>());
        appointmentList.add(appointment);
        appointments.put(date, appointmentList);
        System.out.println("Appointment booked successfully.");
    }

    public void editAppointment(String visitorName, String date, String newTimeSlot) {
        List<Appointment> appointmentList = appointments.getOrDefault(date, new ArrayList<>());
        for (Appointment appointment : appointmentList) {
            if (appointment.getVisitorName().equalsIgnoreCase(visitorName)) {
                appointment.setTimeSlot(newTimeSlot);
                System.out.println("Appointment updated successfully.");
                return;
            }
        }
        System.out.println("Appointment not found.");
    }
}

public class AppointmentManagementSystem {
    public static void main(String[] args) {
        Clinic clinic = new Clinic();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("===== Appointment Management System =====");
            System.out.println("1. Visitors List");
            System.out.println("2. Add new Visitor");
            System.out.println("3. Edit Visitor Details");
            System.out.println("4. View Appointment Schedule for a Day");
            System.out.println("5. Book an Appointment");
            System.out.println("6. Edit/Cancel Appointment");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    clinic.viewVisitorsList();
                    break;

                case 2:
                    scanner.nextLine();
                    System.out.print("Enter visitor name: ");
                    String visitorName = scanner.nextLine();
                    System.out.print("Enter visitor age: ");
                    int visitorAge = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter visitor contact number: ");
                    String contactNumber = scanner.nextLine();
                    System.out.print("Enter visitor address: ");
                    String address = scanner.nextLine();
                    Visitor visitor = new Visitor(visitorName, visitorAge, contactNumber, address);
                    clinic.addVisitor(visitor);
                    System.out.println("Visitor added successfully.");
                    break;

                case 3:
                    scanner.nextLine(); 
                    System.out.print("Enter visitor name: ");
                    visitorName = scanner.nextLine();
                    System.out.print("Enter new contact number: ");
                    contactNumber = scanner.nextLine();
                    System.out.print("Enter new address: ");
                    address = scanner.nextLine();
                    clinic.editVisitorDetails(visitorName, contactNumber, address);
                    System.out.println("Visitor details updated successfully.");
                    break;

                case 4:
                    scanner.nextLine(); 
                    System.out.print("Enter date (DD-MM-YYYY): ");
                    String date = scanner.nextLine();
                    clinic.viewAppointmentSchedule(date);
                    break;

                case 5:
                    scanner.nextLine();
                    System.out.print("Enter visitor name: ");
                    visitorName = scanner.nextLine();
                    System.out.print("Enter date (DD-MM-YYYY): ");
                    date = scanner.nextLine();
                    System.out.print("Enter time slot: ");
                    String timeSlot = scanner.nextLine();
                    clinic.bookAppointment(visitorName, date, timeSlot);
                    break;

                case 6:
                    scanner.nextLine();
                    System.out.print("Enter visitor name: ");
                    visitorName = scanner.nextLine();
                    System.out.print("Enter date (DD-MM-YYYY): ");
                    date = scanner.nextLine();
                    System.out.print("Enter new time slot: ");
                    timeSlot = scanner.nextLine();
                    clinic.editAppointment(visitorName, date, timeSlot);
                    break;

                case 7:
                    exit = true;
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }

        scanner.close();
    }
}
