import java.util.Scanner;
//WITH GLOBAL VARIABLES 
class main{
   static double english, math, science, history, pe;
   static double average;
   
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Student Name : ");
        String name=scan.nextLine();
        System.out.print("Grade in ENGLISH : ");
        english=scan.nextDouble();
        System.out.print("Grade in MATH : ");
        math=scan.nextDouble();
        System.out.print("Grade in SCIENCE : ");
        science=scan.nextDouble();
        System.out.print("Grade in HISTORY : ");
        history=scan.nextDouble();
        System.out.print("Grade in PE : ");
         pe=scan.nextDouble();

        studentName(name);
        averageGrade(english, math, science, history, pe);
        remarks(average);
        int passed = passedSubject(english, math, science, history, pe);
        int failed=5-passed;
        System.out.println("Number of Passed "+passed +" Number of Failed "+failed);
        
    }

    //student name
    public static void studentName(String name){
        System.out.println("\nName of student : " + name.toUpperCase());
    }

    //average result
    public static void averageGrade(double eng, double math, double science, double history, double pe){
        double result= (eng + math + science +  history +  pe) /5;
        System.out.println("Computed average : "+result);
        average=result;
        
    }

    //average information
    public static void remarks(double average) {
        if (average >= 95 && average <= 100) {
            System.out.println("Average Remarks : Excellent");
        } else if (average >= 90 && average <= 94) {
            System.out.println("Average Remarks : Very Good");
        } else if (average >= 85 && average <= 89) {
            System.out.println("Average Remarks : Good");
        } else if (average >= 75 && average <= 84) {
            System.out.println("Average Remarks : Passed");
        } else {
            System.out.println("Average Remarks : Failed");
        }
    }

    //passed and failed subjects 
    public static int passedSubject(double eng, double math, double sci, double history, double pe) {
        int total = 0;
        if (eng >= 75) {
            total++;
        }
        if (math >= 75) {
            total++;
        }
        if (sci >= 75) {
            total++;
        }
        if (history >= 75) {
            total++;
        }
        if (pe >= 75) {
            total++;
        }
        return total;
    }
    
}
