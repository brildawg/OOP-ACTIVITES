package Polymorphism;
//CHILD CLASS
public class brazil extends country {
    
    brazil(){
        country="Brazil";
        nationality="Brazilian";
        language="Portuguese";
    }

    void greet(){
        System.out.println("olá from "+country);
    }
}
