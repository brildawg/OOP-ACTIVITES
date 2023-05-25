package FinalProject;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    static ArrayList<Reservation> reserv = new ArrayList<Reservation>();

    public static void main(String[] args) {
        Reservation r = new Reservation(null, null, null, 0, 0);
        displayMenu();
    }

    static void displayMenu() {
        Scanner scan = new Scanner(System.in);

        System.out.println("System Menu");
        System.out.println("\n\tA. View All Reservation");
        System.out.println("\tB. Make Reservation");
        System.out.println("\tC. Delete Reservation");
        System.out.println("\tD. Generate Report");
        System.out.println("\tE. Exit");
        System.out.print("Select your choice : ");
        String choice = scan.nextLine();
        while (!choice.equals("e")) {
            if (choice.equalsIgnoreCase("A")) {
                viewReservation();
                break;
            } else if (choice.equalsIgnoreCase("B")) {
                makeReservation();
                break;
            } else if (choice.equalsIgnoreCase("C")) {

            } else if (choice.equalsIgnoreCase("D")) {
                generateReport();
                break;
            } else if (choice.equalsIgnoreCase("E")) {
                exitProgram();
                break;
            } else {
                System.out.println("Invalid input");
                displayMenu();
                break;
            }
        }

    }

    static void viewReservation() {
        if (reserv.isEmpty()) {
            System.out.println("No reservation found!");
        } else {
            System.out.printf("%-5s %-20s %-20s %-20s %-20s %-20s%n", "ID", "DATE", "TIME", "NAME", "ADULTS",
                    "CHILDREN");
            int id = 1;
            for (Reservation reservation : reserv) {
                String names = reservation.getName();
                String dates = reservation.getDate();
                String times = reservation.getTime();
                int numOfAdults = reservation.getNumOfAd();
                int numOfChildrens = reservation.getNumOfChild();

                System.out.printf("%-5s %-20s %-20s %-20s %-20s %-20s%n", id, dates, times, names, numOfAdults,
                        numOfChildrens);
                id++;
            }
        }
        displayMenu();

    }

    static void makeReservation() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = scan.nextLine();
        System.out.print("Enter Date : ");
        String date = scan.nextLine();
        System.out.print("Enter Time : ");
        String time = scan.nextLine();
        int adults;
        while (true) {
            try {
                System.out.print("Enter number of Adults: ");
                adults = Integer.parseInt(scan.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number for Adults.");
            }
        }
        int children;
        while (true) {
            try {
                System.out.print("Enter number of Children: ");
                children = Integer.parseInt(scan.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number for Children.");
            }
        }
        reserv.add(new Reservation(name, date, time, adults, children));
        System.out.println("Reservation is added successfully!\n");
        displayMenu();

    scan.close();

    }

    // UNFINISHED
    static void deleteReservation() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter # that you want to delete : ");
        int id = scan.nextInt();

    }

    static void generateReport() {
        if (reserv.isEmpty()) {
            System.out.println("NO DATA TO DISPLAY!!!!");
            displayMenu();
        } else {
            System.out.printf("%-5s %-20s %-20s %-20s %-20s %-20s %-20s%n", "ID", "DATE", "TIME", "NAME", "ADULTS",
                    "CHILDREN", "SUBTOTAL");
            int id = 1;
            int totalAdults = 0;
            int totalChild = 0;
            int totalOfSubtotal = 0;

            for (Reservation reservation : reserv) {
                String names = reservation.getName();
                String dates = reservation.getDate();
                String times = reservation.getTime();
                int numOfAdults = reservation.getNumOfAd();
                int numOfChildrens = reservation.getNumOfChild();

                int adult = numOfAdults * 500;
                int child = numOfChildrens * 300;
                int subTotal = adult + child;
                System.out.printf("%-5d %-20s %-20s %-20s %-20d %-20d %-20d%n", id, dates, times, names, numOfAdults,
                        numOfChildrens, subTotal);
                id++;
                totalAdults += numOfAdults;
                totalChild += numOfChildrens;
                totalOfSubtotal += subTotal;

            }
            System.out.println("Total adults : " + totalAdults);
            System.out.println("Total number of Kids : " + totalChild);
            System.out.println("Grand total : PHP " + totalOfSubtotal + ".00");
        }
        displayMenu();
    }

    static void exitProgram() {
        System.out.println("Program is Closed, Thank you!");
    }
}
