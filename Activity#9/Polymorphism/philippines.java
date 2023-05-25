package Polymorphism;
//CHILD CLASS
public class philippines extends country {

    philippines(){
        country="Philippines";
        nationality="Filipino";
        language="Tagalog";
    }

    void greet(){
        System.out.println("Kamusta from "+country);
    }
    
}
