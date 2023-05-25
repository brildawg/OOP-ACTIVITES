import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("EMPLOYEE'S DATA ENTRY");
        System.out.println("------------------------------------------------");

        System.out.print("LastName : ");
        String lname=scan.nextLine();
        System.out.print("FirstName : ");
        String fname=scan.nextLine();
        System.out.print("Mi : ");
        String mi=scan.nextLine();
        System.out.print("Age : ");
        int age=scan.nextInt();
        scan.nextLine();
        System.out.print("Gender : ");
        String gender=scan.nextLine();
        System.out.print("Birth date : ");
        String bdate=scan.nextLine();
        System.out.print("Place of birth : ");
        String pob=scan.nextLine();
        System.out.print("Religion : ");
        String religion=scan.nextLine();
        System.out.print("Civil Status : ");
        String cstatus=scan.nextLine();

        System.out.print("\nStreet/Barangay : ");
        String sb=scan.nextLine();
        System.out.print("City/Municipality : ");
        String cm=scan.nextLine();
        System.out.print("Province : ");
        String prov=scan.nextLine();
        System.out.print("Email address : ");
        String email=scan.nextLine();
        System.out.print("Contact No : ");
        String cno=scan.nextLine(); 

        System.out.print("\nSSS# : ");
        double sssNo=scan.nextDouble();
        System.out.print("Tin# : ");
        double tinNo=scan.nextDouble();
        System.out.print("Pagibig# : ");
        double pagibigNo=scan.nextDouble();
        System.out.print("Philhealth# : ");
        double phNo=scan.nextDouble();

        employeeInfo emp = new employeeInfo(lname,fname,mi,age,gender,bdate,pob,religion,cstatus);
        emp.contactInformation(sb, cm, prov, email, cno);
        emp.governmentids(sssNo, tinNo, pagibigNo, phNo);
       
    }
}
