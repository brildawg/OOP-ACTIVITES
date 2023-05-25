public class employeeInfo {
    
    String lname, fname, mi;
    int age;
    String gender, bdate, pob;
    String religion, cstatus;
   

    employeeInfo(String lname, String fname, String mi,int age, String gender, String bdate,
    String pob, String religion, String cstatus){
        this.lname=lname;
        this.fname=fname;
        this.mi=mi;
        this.age=age;
        this.gender=gender;
        this.bdate=bdate;
        this.pob=pob;
        this.religion=religion;
        this.cstatus=cstatus;
        System.out.println("\n------------------------------------------------------------------------");
        System.out.println("PERSONAL DATA");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("\nName : "+fname.toUpperCase()+" "+mi.toUpperCase()+" "+lname.toUpperCase());
        System.out.println("Age : "+age);
        System.out.println("Gender : "+gender.toUpperCase()+"\nBirth date : "+bdate.toUpperCase()+"\nPlace of birth : "+pob.toUpperCase()+"\nReligion : "+religion.toUpperCase());
        System.out.println("Civil Status : "+cstatus.toUpperCase());
    }   

    void contactInformation(String sb,String cm, String prov, String email, String contactno){   
        System.out.println("\n------------------------------------------------------------------------");
        System.out.println("CONTACT INFORMATION");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Address : "+sb.toUpperCase()+" "+cm.toUpperCase());
        System.out.println("Province : "+prov.toUpperCase());
        System.out.println("Email : "+email.toUpperCase());
        System.out.println("ContactNo : "+contactno);
    }
    void governmentids(double sssNo, double tinNo, double pagibigNo, double phNo){
        System.out.println("\n------------------------------------------------------------------------");
        System.out.println("GOVERNMENT ID");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("SSS# : "+sssNo);
        System.out.println("TIN# : "+tinNo);
        System.out.println("PAGIBIG# : "+pagibigNo);
        System.out.println("PHILHEALTH : "+phNo);
    }  
    
}
