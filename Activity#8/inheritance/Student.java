package inheritance;

public class Student extends Persons {

    private String stuID;
    private String Major;
    private int nos;

    //Constructor
    Student(String name, int YOB, String stuID, String Major, int nos){
        super(name, YOB);
        this.stuID=stuID;
        this.Major=Major;
        this.nos=nos;
    }
    //setters
    public void setStudID(String stuID){
        this.stuID=stuID;
    }
    //setters
    public String getStudID(){
        return stuID;
    }
    //setters
    public void setMajor(String Major){
        this.Major=Major;

    }
    //getters
    public String getMajor(){
        return Major;
    }
    //setters
    public void setNos(int nos){
        this.nos=nos;
    }
    //getters
    public int getNos(){
        return nos;
    }
    //Info 
    public void printInfo(){
        System.out.println("\n--------------------------------------");
        super.printInfo();
        int i=nos+1;
        System.out.println("Your ID Number is : "+getStudID());
        System.out.println("Your Program is "+getMajor());
        System.out.println("No. of students "+getNos());
        System.out.println("Incemented number is "+i);
    }


}
