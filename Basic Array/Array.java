import java.util.Arrays;
import java.util.Scanner;

class JavaArray{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
		
		String[] IDnumber ={"2022-001","2022-002", "2022-003", "2020-004"};
		String[] StudentName= {"James Copper", "Princess Smith","Dianna Ross","James Butler"};
		String [] Course= {"BSIT","BSCS","BSIS","BSEMC"};
		String[] Sports= {"Basketball", "Badminton","Swimming","Baseball"};
		long[] Contact= {920864756L, 9178765454L, 9167657382L, 9108877635L};
        
		
		System.out.println("Student Names : " +Arrays.toString(StudentName));
		System.out.print("Enter Student index : ");
		int index = scan.nextInt();

        if(index==0){
            System.out.println("\nIndex number : "+index+"\nStudent ID : "+IDnumber[0]+"\nName of Student : "+StudentName[0]
            +"\nCourse : "+Course[0]+"\nSports : "+Sports[0]+"\nContact : 0"+Contact[0]);
        }else if(index==1){
            System.out.println("\nIndex number : "+index+"\nStudent ID : "+IDnumber[1]+"\nName of Student : "+StudentName[1]
            +"\nCourse : "+Course[1]+"\nSports : "+Sports[1]+"\nContact : 0"+Contact[1]);
        }else if(index==2){
            System.out.println("\nIndex number : "+index+"\nStudent ID : "+IDnumber[2]+"\nName of Student : "+StudentName[2]
            +"\nCourse : "+Course[2]+"\nSports : "+Sports[2]+"\nContact : 0"+Contact[2]);
        }else if(index==3){
            System.out.println("\nIndex number : "+index+"\nStudent ID : "+IDnumber[3]+"\nName of Student : "+StudentName[3]
            +"\nCourse : "+Course[3]+"\nSports : "+Sports[3]+"\nContact : 0"+Contact[3]);
        }else{
            System.out.println("INDEX OUT OF BOUNDS");
        }
        scan.close();
    }
}