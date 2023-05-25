package FinalProject;

import java.util.Scanner;

public class Reservation {
    private String name;
    private String date;
    private String time;
    private int numOfAdults;
    private int numOfChildren;

    Reservation(String name, String date, String time, int numOfAdults, int numOfChildren){
        this.name=name;
        this.date=date;
        this.time=time;
        this.numOfAdults=numOfAdults;
        this.numOfChildren=numOfChildren;
    }
    void displayReservation(){
        System.out.println("All Reservations");
        System.out.println();
        System.out.printf("%-5s %-10s %-7s %-8s%n","ID", "DATE", "TIME", "NAME", "ADULTS", "CHILDREN");
        
    }
    public void setName(String name){
        this.name=name;

    }
    public String getName(){
        return name;
    }
    public void setdate(String date){
        this.date=date;
    }
    public String getDate(){
        return date;
    }
    public void setTime(String time){
        this.time=time;
    }
    public String getTime(){
        return time;
    }
    public void setAdults(int numOfAdults){
        this.numOfAdults=numOfAdults;
    }
    public int getNumOfAd(){
        return numOfAdults;
    }
    public void setChild(int numOfChildren){
        this.numOfChildren=numOfChildren;
    }

    public int getNumOfChild(){
        return numOfChildren;
    }

   

}
