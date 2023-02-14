import java.util.ArrayList;
import java.util.Scanner;

class practice {
    public static void main(String[] args) {

        ArrayList<String> stdid = new ArrayList<String>();
        ArrayList<String> stdname = new ArrayList<String>();
        ArrayList<String> stdcollege = new ArrayList<String>();
        ArrayList<String> stdprogram = new ArrayList<String>();

        while (true) {
            String id = "";
            String name = "";
            String college = "";
            String program = "";
            Scanner scan = new Scanner(System.in);

            System.out.print("Enter Student ID Number : ");
            id = scan.nextLine();
            while (id.isBlank()) {
                System.out.println("Please enter Student ID Number");
                System.out.print("Enter Student ID Number : ");
                id = scan.nextLine();
            }
            stdid.add(id);
            System.out.print("Enter Student Fullname : ");
            name = scan.nextLine();
            while (name.isBlank()) {
                System.out.println("Please enter Student full name");
                System.out.print("Enter Student ID Number : ");
                name = scan.nextLine();
            }
            stdname.add(name);

            System.out.print("Enter Student College : ");
            college = scan.nextLine();
            while (college.isBlank()) {
                System.out.println("Please enter Student collge");
                System.out.print("Enter Student College : ");
                college = scan.nextLine();
                
            }
            stdcollege.add(college);

            System.out.print("Enter Student Program : ");
            program = scan.nextLine();
            while (program.isBlank()) {
                System.out.println("Please enter Student program");
                System.out.print("Enter Student Program : ");
                program = scan.nextLine();

            }
            stdprogram.add(program);

            System.out.print("Do you want to add more? YES/NO ");
            String add = scan.nextLine();
            if (add.equalsIgnoreCase("No")) {
                
                System.out.println("\nLIST OF STUDENTS PARTICIPANTS\n\nID NUMBER\tSTUDENT NAME\tCOLLEGE\tPROGRAM");
                for (int i = 0; i < stdname.size(); i++) {
                    System.out.println(stdid.get(i) + "\t\t" + stdname.get(i) + "\t\t" + stdcollege.get(i) + "\t\t"
                            + stdprogram.get(i));
                }
                break;
            } else if (add.equalsIgnoreCase("Yes")) {
                System.out.println();
            } else {
                System.out.println("Choice invalid");
                break;
            }
        }
    }
}
