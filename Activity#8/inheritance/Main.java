package inheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Student Name : ");
        String name=scan.nextLine();
        System.out.print("Enter Birth Year : ");
        int YOB=scan.nextInt();
        scan.nextLine();
        System.out.print("Enter ID Number : ");
        String id=scan.nextLine();
        System.out.print("Enter Program : ");
        String prog=scan.nextLine();
        System.out.print("Enter No of Student : ");
        int nos=scan.nextInt();

        scan.close();

        //Object person
        Persons p = new Persons(name, YOB);
        p.setName(name);
        p.setYOB(YOB);
        //Object Student
        Student s = new Student(name, YOB, id, prog, nos);
        s.setStudID(id);
        s.setMajor(prog.toUpperCase());
        s.setNos(nos);
        s.printInfo();
    }   
}
