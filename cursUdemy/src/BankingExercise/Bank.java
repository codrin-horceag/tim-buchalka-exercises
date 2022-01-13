package BankingExercise;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name){
        this.name = name;
        branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String name){
        if(findBranch(name).getName() != null){
            System.out.println("Branch already exists!");
            return false;
        } else {
            branches.add(new Branch(name));
            return true;
        }
    }

    public boolean addCustomer(String branchName, String customerName, double transaction){
        if(findBranch(branchName) == null){
            int position = branches.indexOf(findBranch(branchName));
            branches.get(position).newCustomer(customerName, transaction);
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){
        if(findBranch(branchName) == null){
            int position = branches.indexOf(findBranch(branchName));
            branches.get(position).addCustomerTransaction(customerName, transaction);
            return true;
        }
        return false;
    }

    private Branch findBranch(String name){
        for(int i = 0; i < branches.size(); i++){
            Branch newBranch = this.branches.get(i);
            if(newBranch.getName().equals(name)){
                return newBranch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransaction){
        printTransaction = true;
        int i = 0;
        if(findBranch(branchName) != null){
            while(printTransaction){
                System.out.println("Customer name: " + branches.get(i).getName());
                i++;
            }
            return true;
        }
        return false;
    }
}
