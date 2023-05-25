package encapsulation;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Employee ID : ");
        String employeeId=scan.nextLine();
        System.out.print("LastName : ");
        String lname=scan.nextLine();
        System.out.print("Firstname : ");
        String fname=scan.nextLine();
        System.out.print("Mi : ");
        String mi=scan.nextLine();
        System.out.println("------------------------------------------");

        System.out.print("Basic : ");
        double basic=scan.nextDouble();
        System.out.print("Incentive pay : ");
        double incpay=scan.nextDouble();

        System.out.print("House Rent Allowance : ");
        double hra=scan.nextDouble();
        System.out.print("Meal Allowance : ");
        double mealAll=scan.nextDouble();

        System.out.println("------------------------------------------");
        System.out.print("Provident Fund : ");
        double provFund=scan.nextDouble();
        System.out.print("Professional Tax : ");
        double profTax=scan.nextDouble();
        System.out.print("Loan : ");
        double loan=scan.nextDouble();

        //object
        employee emp = new employee(employeeId, lname, fname, mi);
        //setters
        emp.setBasic(basic);
        emp.setIncpay(incpay);
        emp.setHra(hra);
        emp.setMealAll(mealAll);
        System.out.println("EARNINGS");
        displayDash();
        System.out.println("Basic :              "+emp.getBasic());
        System.out.println("Incentive pay :      "+emp.getIncpay());
        System.out.println("House Allowance :    "+emp.getHra());
        System.out.println("Meal Allowance :     "+emp.getMealAll());
        
        //setters
        emp.setProvFund(provFund);
        emp.setProfTax(profTax);
        emp.setLoan(loan);
        displayDash();
        System.out.println("DEDUCTIONS");
        displayDash();

        //getters
        System.out.println("Provident Fund :     "+emp.getProvFund());
        System.out.println("Professional Tax :   "+emp.getProfTax());
        System.out.println("Loan :               "+emp.getLoan());
        displayDash();

        //methods
        System.out.println("Total Earnings>=     "+emp.totalEarnings());
        System.out.println("Total Deductions>=   "+emp.totalDeductions());
        System.out.println("NET PAY=>            "+emp.netPay());
        
    }
    public static void displayDash(){
    System.out.println("------------------------------------------------------------------------------------------------");
    }
}