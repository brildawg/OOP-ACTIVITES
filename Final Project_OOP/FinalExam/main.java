package FinalExam;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    static ArrayList<restaurant> resto = new ArrayList<restaurant>();

    // MAIN METHOD
    public static void main(String[] args) {
        System.out.println("RESTAURANT RESERVATION SYSTEM\n");
        systemMenu();
    }

    // METHOD FOR SYSTEM MENU
    static void systemMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n--------------------------------------------------\n\t\t SYSTEM MENU \n--------------------------------------------------");
        System.out.println("\n\tA. View All Reservation");
        System.out.println("\tB. Make Reservation");
        System.out.println("\tC. Delete Reservation");
        System.out.println("\tD. Generate Report");
        System.out.println("\tE. Exit\n--------------------------------------------------");
        System.out.print("Select your choice : ");
        String choice = scan.nextLine();
        while (true) {
            if (choice.equalsIgnoreCase("A")) {
                viewReservations();
                break;
            } else if (choice.equalsIgnoreCase("B")) {
                makeReservations();
                break;
            } else if (choice.equalsIgnoreCase("C")) {
                deleteReservations();
                break;
            } else if (choice.equalsIgnoreCase("D")) {
                generateReport();
                break;
            } else if (choice.equalsIgnoreCase("E")) {
                exitProgram();
                break;
            } else {
                System.out.println("\nINVALID INPUT, TRY AGAIN...\n");
                systemMenu();
                break;
            }
        }
        scan.close();

    }

    // METHOD FOR "A" to View reservations
    static void viewReservations() {
        if (resto.isEmpty()) {
            System.out.println("\n\t\t\tNo Reservation found!\t");
        } else {
            System.out.println("\n\t\t\t\tRESULTS FOR RESERVATIONS\t\n");
            System.out.printf("%-5s %-20s %-20s %-20s %-20s %-20s%n", "ID", "DATE", "TIME", "NAME", "ADULTS",
                    "CHILDREN");
            int id = 1;
            for (restaurant restaurants : resto) {
                String names = restaurants.getName();
                String dates = restaurants.getDate();
                String times = restaurants.getTime();
                int numOfAdults = restaurants.getNumOfAd();
                int numOfChildrens = restaurants.getNumOfChild();

                System.out.printf("%-5s %-20s %-20s %-20s %-20s %-20s%n", id, dates, times, names, numOfAdults,numOfChildrens);
                id++;
            }
        }
        systemMenu();
    }

    // METHOD FOR "B" to Make Reservations
    static void makeReservations() {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter Name : ");
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
        resto.add(new restaurant(name, date, time, adults, children));
        System.out.println("\n\tReservation is added successfully!\n");
        systemMenu();
        scan.close();
    }

    // METHOD FOR "C" to Delete Reservations
    static void deleteReservations() {
        Scanner scan = new Scanner(System.in);
        if(resto.isEmpty()){
            System.out.println("------------------------ No data found ------------------------");
        }else{
            System.out.print("\nEnter ID#  of the Reservation you would like to delete : ");
            int idno=scan.nextInt();
            if(idno>=1 && idno<=resto.size()){
                resto.remove(idno-1);
                System.out.println("Reservation ID number "+idno + " has been deleted");
            }else{
                System.out.println("Reservation ID#, not found");
            }
        }
        systemMenu();
        scan.close();
    }


    // METHOD FOR "D" to Generate Report
    static void generateReport() {
        if (resto.isEmpty()) {
            System.out.println("NO DATA FOUND!!");
            systemMenu();
        } else {
            System.out.println("\n\t\t\t\t\t\tREPORT\n");
            System.out.printf("%-5s %-20s %-20s %-20s %-20s %-20s %-20s%n", "ID", "DATE", "TIME", "NAME", "ADULTS",
                    "CHILDREN", "SUBTOTAL");
            int id = 1;
            int totalAdults = 0;
            int totalChild = 0;
            int totalOfSubtotal = 0;

            for (restaurant restaurants : resto) {
                String names = restaurants.getName();
                String dates = restaurants.getDate();
                String times = restaurants.getTime();
                int numOfAdults = restaurants.getNumOfAd();
                int numOfChildrens = restaurants.getNumOfChild();

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
            System.out.println("\nTotal adults : " + totalAdults);
            System.out.println("Total number of Kids : " + totalChild);
            System.out.println("Grand total : PHP " + totalOfSubtotal + ".00");
            System.out.println("\n....................nothing follows....................");
            systemMenu();
        }
    }
    //METHOD FOR "E" exit program
    static void exitProgram() {
        System.out.println("\nProgram is Closed, Thank you!");
    }
    
}
