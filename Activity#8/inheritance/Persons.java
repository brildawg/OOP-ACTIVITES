package inheritance;

public class Persons {
    private String name;
    private int YOB;
    private int age;

    //Constructor
    Persons(String name, int YOB){
        this.name=name;
        this.YOB=YOB;
        this.age=calculateAge(YOB);
        
    }
    //Age calculate
    public int calculateAge(int YOB){
        int latestYear = 2023;
        latestYear-=YOB;
        return latestYear;
    }
    //setters
    public void setName(String name){
        this.name=name;
    }
    //getters
    public String getName(String name){
        return name;
    }
    //setters
    public void setYOB(int YOB){
        this.YOB=YOB;
    }
    //getters
    public int getYOB(int YOB){
        return YOB;
    }
    //Info
    public void printInfo(){
        System.out.println("Your name is "+getName(name.toUpperCase()));
        System.out.println("Year of birth "+getYOB(YOB));
        System.out.println("Your age is "+age);
    }
}
