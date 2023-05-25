import java.util.Scanner;
//WITHOUT GLOBAL VARIABLES
class methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] subejct = { "ENGLISH", "MATH", "SCIENCE", "HISTORY", "PE" };
        double[] grades = new double[5];
        double average;

        System.out.print("Enter Student name : ");
        String stdname = scan.nextLine();

        for (int i = 0; i < 5; i++) {
            System.out.print("Grade in " + subejct[i] + " : ");
            grades[i] = scan.nextDouble();
        }

        name(stdname);
        average=averageGrade(grades);
        remarks(average);
        int passed = passedSubject(grades);
        int failed = 5 - passed;
        System.out.println("Number of Passed " + passed + " Number of Failed " + failed);



    }

    // student name
    static void name(String name) {
        System.out.println("\nName of student : " + name.toUpperCase());
    }

    // average grade
    static double averageGrade(double[] grades) {
        double total = 0;
        for (int i = 0; i < 5; i++) {
            total += grades[i];
        }

        System.out.println("Average Remarks : " + (total) / 5);
        return total;
    }

    // remarks
    static void remarks(double grades) {
        if (grades >= 95 && grades <= 100) {
            System.out.println("Average Remarks : Excellent");
        } else if (grades >= 90 && grades <= 94) {
            System.out.println("Average Remarks : Very Good");
        } else if (grades >= 85 && grades <= 89) {
            System.out.println("Average Remarks : Good");
        } else if (grades >= 75 && grades <= 84) {
            System.out.println("Average Remarks : Passed");
        } else {
            System.out.println("Average Remarks : Failed");
        }
    }
    static int passedSubject(double grades[]){
        int psub=0;
        for(int i=0; i<5; i++){
            if(grades[i]>=75){
                psub++;
            }
        }
        return psub;
    }
 
}

