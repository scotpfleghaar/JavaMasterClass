import java.util.Random;

import javafx.beans.binding.When.NumberConditionBuilder;



public class Account {

    Random rand = new Random();
    //50 is the maximum and the 1 is our minimum
    //Bank code:
    String bankCode = "443933";
    int a = rand.nextInt(99999999) + 10000000;
     

    private String number = (bankCode + Integer.toString(a));
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    //Constructor
    public Account(){
        //Optional creation of default fields
        this("52452452",0.00,"Default Name", "Default Address","Default Phone");

        System.out.println("Empty Constructor Call");
    }

    public Account(String number, double balance, String customerName, String customerPhoneNumber, String customerEmailAddress){
        System.out.println("Account Constructor with parameters called");
        this.number = number; // This style is better rather than calling the setter because it can conflict with inheritance
        this.balance = balance;
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerEmailAddress = customerEmailAddress;
    }

    public Account(String customerName, String customerPhoneNumber, String customerEmailAddress){
        this("9999999",100.55,customerName,customerPhoneNumber,customerEmailAddress);
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of "+depositAmount+" processed. Now balance is "+ this.balance);
    }

    public void withdrawl(double withdrawlAmount){
        if(balance - withdrawlAmount <= 0){
            System.out.println("Only " + this.balance + " available. Withdrawl not processed");
        } else {
            this.balance -= withdrawlAmount;
            System.out.println("Withdrawl of " + withdrawlAmount + " processed. Remaining amount = " + this.balance);
        }
    }

    //Getters and Setters
    public String getNumber(){
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName(){
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress(){
        return customerEmailAddress;
    }
    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber(){
        return customerPhoneNumber;
    }
    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}