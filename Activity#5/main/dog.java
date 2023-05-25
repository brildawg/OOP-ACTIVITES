package main;

public class dog {
    String breed;
    String size;
    String colour;
    int age;

    public void Eat(String food){
        System.out.println("Eating "+food);
    }

    public void Run(String speed){ 
        System.out.println("Running speed is, "+speed);
    }
    public void Sleep(int time){
        System.out.println("Sleeping "+time+" hours everyday");
    }
    public void Name(String name){
        System.out.println("The name of the dog is, "+name);
    }
}
