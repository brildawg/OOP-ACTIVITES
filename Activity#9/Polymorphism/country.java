package Polymorphism;

import java.util.Scanner;

//PARENT CLASS
public class country {

    Scanner scan = new Scanner(System.in);

    String country;
    String nationality;
    String language;

    void info(){
        System.out.println("\nCountry name : "+country);
        System.out.println("Nationality : "+nationality);
        System.out.println("Language name : "+language);
    }
    
    void greet(){
        System.out.println("Hello from "+country);
    }

    void sayNationality(int say){

        for(int i =0; i<say; i++){
            System.out.println("I am "+nationality+"!");
        }
    }

 
    
}
