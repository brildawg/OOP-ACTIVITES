package Polymorphism;
//MAIN 
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        country c = new country();
        
        country j = new japan();
        j.info();
        j.greet();
        j.sayNationality(3);

        country p = new philippines();
        p.info();
        p.greet();
        p.sayNationality(3);
        

        country b = new brazil();
        b.info();
        b.greet();
        b.sayNationality(3);
    }
}
