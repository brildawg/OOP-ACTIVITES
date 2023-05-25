import java.util.ArrayList;
import java.util.Scanner;

class main {
    public static void main(String[] args) {

        ArrayList<String> studentid = new ArrayList<String>();
        ArrayList<String> fullname = new ArrayList<String>();
        ArrayList<String> college = new ArrayList<>();
        ArrayList<String> program = new ArrayList<>();

        String studentID;
        String fname;
        String stdcollege;
        String stdprogram;
        Scanner scan = new Scanner(System.in);

        while(true){
            //FOR STUDENT ID
            System.out.print("Enter Student ID number : ");
            studentID=scan.nextLine();
            while(studentID.isBlank()){
                System.out.println("Please enter Student ID number!");
                System.out.print("Enter Student ID number : ");
                studentID=scan.nextLine();
            }
            studentid.add(studentID);

            //FOR STUDENT FULLNAME
            System.out.print("Enter Student Fullname : ");
            fname=scan.nextLine();
            while(fname.isBlank()){
                System.out.println("Please enter Student Fullname!");
                System.out.print("Enter Student Fullname : ");
                fname=scan.nextLine();
            }
            fullname.add(fname);

            //FOR STUDENT COLLEGE
            System.out.print("Enter Student College : ");
            stdcollege=scan.nextLine();
            while(stdcollege.isBlank()){
                System.out.println("Please enter Student College!");
                System.out.print("Enter Student College : ");
                stdcollege=scan.nextLine();
            }
            college.add(stdcollege);

            //FOR STUDENT PROGRAM
            System.out.print("Enter Student Program : ");
            stdprogram=scan.nextLine();
            while(stdprogram.isBlank()){
                System.out.println("Please enter Student Program!");
                System.out.print("Enter Student program : ");
                stdprogram=scan.nextLine();
            }
            program.add(stdprogram);

            System.out.print("Do you want to add more? YES/NO : ");   
            String add=scan.nextLine();         
            if(add.equalsIgnoreCase("no")){
                System.out.println("LIST OF STUDENTS PARTICIPANTS");
                System.out.println("ID NUMBER            STUDENT NAME         COLLEGE              PROGRAM");
                for (int i = 0; i < studentid.size(); i++) {

                    String column1Format = "%-20s";
    
                    String formater = column1Format + " " + column1Format + " " + column1Format + " " + column1Format;
    
                    System.out.format(formater, studentid.get(i).toUpperCase(), fullname.get(i).toUpperCase(), college.get(i).toUpperCase(), program.get(i).toUpperCase());
                    System.out.println();
            }
            break;
        }else if(!add.equalsIgnoreCase("yes")){
            System.out.println("Choice invalid!");
            break;
        }else{
            System.out.println();
        }
    }
}
}