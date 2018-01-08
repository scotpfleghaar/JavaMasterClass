
public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    //Constructors

    public VipCustomer(){
        this("Defualt Name", "Default Email Address", 0.00);
        System.out.println("Default Constructor");
    }

    public VipCustomer(String name, String emailAddress){
        this(name, emailAddress, 0.00);
        System.out.println("Default Credit Limit constructor called");
    }

    public VipCustomer(String name, String emailAddress, double creditLimit){
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
    }

    // Getters and Setters
    public String getName(){
       return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getCreditLimit(){
        return creditLimit;
    }
    public void setCreditLimit(double creditLimit){
        this.creditLimit = creditLimit;
    }

    public String getEmailAddress(){
    return emailAddress;
    }
    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }
    
}