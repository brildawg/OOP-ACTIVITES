package Polymorphism;
//CHILD CLASS
public class japan extends country {

    japan(){
        country="Japan";
        nationality="japanese";
        language="Nihongo";
    }

    void greet(){
        System.out.println("Kon'nichiwa from "+country);
    }
  
}
