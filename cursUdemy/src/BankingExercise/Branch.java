package BankingExercise;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch (String name){
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double transaction){
        Customer newCustomer = new Customer(name);
        newCustomer.addTransaction(transaction);
        if(findCustomer(name) == null){
            customers.add(newCustomer);
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String name, double transaction){
        if(findCustomer(name) == null){
            int position = customers.indexOf(findCustomer(name));
            customers.get(position).addTransaction(transaction);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String name){
        for(int i = 0; i < customers.size(); i++){
            Customer newCustomer = this.customers.get(i);
            if(newCustomer.getName().equals(name)){
                return newCustomer;
            }
        }
        return null;
    }
}
