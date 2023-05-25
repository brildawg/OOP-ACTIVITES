package FinalExam;

import java.util.Scanner;

public class restaurant {

    private String name;
    private String date;
    private String time;
    private int numOfAdults;
    private int numOfChildren;

    restaurant(String name, String date, String time, int numOfAdults, int numOfChildren){
        this.name=name;
        this.date=date;
        this.time=time;
        this.numOfAdults=numOfAdults;
        this.numOfChildren=numOfChildren;
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
