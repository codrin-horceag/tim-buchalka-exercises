package Udemy;

public class BankAccount {
    public static void main(String[] args) {

    }
    private int accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerNumber;

    public BankAccount(){
        this(12345, 2.50, "Default name", "Default e-mail", "default number");
    }

    public BankAccount(int accountNumber, double balance, String customerName, String customerEmail, String customerNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerNumber = customerNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public void deposit(int deposit){
        this.balance += deposit;
        System.out.println("New balance is " + this.balance);
    }

    public void withdraw(int withdraw){
        if(this.balance < withdraw)
            System.out.println("Insufficient funds! Remaining balance is " + this.balance);
        else this.balance -= withdraw;
        System.out.println("Remaining balance is " + this.balance);
    }
}

