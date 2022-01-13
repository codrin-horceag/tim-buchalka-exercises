package Udemy;

public class VipCustomer {
    private String name;
    private String creditLimit;
    private String emailAddress;

    public VipCustomer(String name, String creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(){
        this("Default name", "1000", "Default address");
    }

    public VipCustomer(String name, String creditLimit){
        this(name, creditLimit, "Default address");
    }
}
