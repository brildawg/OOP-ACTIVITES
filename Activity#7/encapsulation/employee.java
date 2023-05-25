package encapsulation;

public class employee {
    private String employeeId;
    private String lastName, firtsname, mi;
    private double basic, incpay, hra, mealAll;
    private double provFund, profTax, loan;
    
    public employee(String employeeId, String lastName, String firstName, String middleInitial) {
        this.employeeId = employeeId;
        this.lastName = lastName;
        this.firtsname=firstName;
        this.mi = middleInitial;
        System.out.println("\n------------------------------------------------------------------------------------------------");
        System.out.println("-----------------------------------EMPLOYEES PAYSLIP--------------------------------------------");
        System.out.println("------------------------------------------------------------------------------------------------");
        
        System.out.println("Employee ID : "+employeeId);
        System.out.println("Employee Name : "+firtsname.toUpperCase()+" "+mi.toUpperCase()+" "+" "+lastName.toUpperCase());
        System.out.println("------------------------------------------------------------------------------------------------");
    }
    //setter for basic
    public void setBasic(double basic) {
        this.basic = basic;
    }
    //getter for basic
    public double getBasic() {
        return basic;
    }
    //setter for incpay
    public void setIncpay(double incpay) {
        this.incpay = incpay;
    }
    //getter for incpay
    public double getIncpay() {
        return incpay;
    }
    //setter for hra
    public void setHra(double hra) {
        this.hra = hra;
    }
    //getter for hra
    public double getHra() {
        return hra;
    }
    //setter for mealAll
    public void setMealAll(double mealAll) {
        this.mealAll = mealAll;
    }
    //getter for mealAll
    public double getMealAll() {
        return mealAll;
    }
    //setter for provFund
    public void setProvFund(double provFund) {
        this.provFund = provFund;
    }
    //getter for provFund
    public double getProvFund() {
        return provFund;
    }
    //setter for profTax
    public void setProfTax(double profTax) {
        this.profTax = profTax;
    }
    //getter for profTax
    public double getProfTax() {
        return profTax;
    }
    //setter for loan
    public void setLoan(double loan) {
        this.loan = loan;
    }
    //getter for loan
    public double getLoan() {
        return loan;
    }
    //total earnings
    public double totalEarnings(){
        double totalEarnings = basic + incpay + hra + mealAll;
        return totalEarnings;
    }
    //deductions
    public double totalDeductions(){
        double totalDeductions=provFund+profTax+loan;
        return totalDeductions;
    }
    
    //overall total
    public double netPay(){
        double netPay = totalEarnings()-totalDeductions();
        return netPay;
    }

}
