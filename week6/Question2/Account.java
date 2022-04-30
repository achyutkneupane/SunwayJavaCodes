package week6.Question2;

import java.util.Scanner;

/**
 * Account
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 */
public class Account {
    static int lastAccountNumber = 1000;
    private String name;
    private String address;
    private int accountType;
    private double balance;
    private String accountNumber;

    static Scanner scan = new Scanner(System.in);

    /**
     * Company
     * 
     * @param name
     * @param address
     * @param accountType
     * @param balance
     */
    public Account(String name, String address, int accountType, double balance) {
        this.name = name;
        this.address = address;
        this.accountType = accountType;
        this.balance = balance;
        this.accountNumber = "BA"+lastAccountNumber++;
    }

    /**
     * getName
     * 
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * setName
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getAddress
     * 
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * setAddress
     * 
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * getAccountType
     * 
     * @return accountType
     */
    public String getAccountType() {
        if(this.accountType == 1) {
            return "Savings";
        } else if(this.accountType == 2) {
            return "Current";
        } else {
            return "Invalid";
        }
    }

    /**
     * setAccountType
     * 
     * @param accountType
     */
    public void setAccountType(int accountType) {
        this.accountType = accountType;
    }

    /**
     * getBalance
     * 
     * @return balance
     */
    public double getBalance() {
        return this.balance;
    }

    /**
     * setBalance
     * 
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * getAccountNumber
     * 
     * @return accountNumber
     */
    public String getAccountNumber() {
        return this.accountNumber;
    }


    /**
     * display
     * 
     * @param account
     */
    public void display() {
        System.out.println("Name: " + this.getName());
        System.out.println("Address: " + this.getAddress());
        System.out.println("Account Type: " + this.getAccountType());
        System.out.println("Balance: " + this.getBalance());
        System.out.println("Account Number: " + this.getAccountNumber());
        System.out.println();
    }

    /**
     * depositAmount
     * 
     */
    public void depositAmount() {
        System.out.println("Enter amount to be deposited: ");
        double amount = scan.nextDouble();
        this.setBalance(this.getBalance() + amount);
        System.out.println("Amount deposited successfully");
        System.out.println();
        this.display();
        System.out.println();
    }

    /**
     * withdrawAmount
     * 
     */
    public void withdrawAmount() {
        System.out.println("Enter amount to be withdrawn: ");
        double amount = scan.nextDouble();
        if (this.getBalance() < amount) {
            System.out.println("Insufficient balance");
            System.out.println();
        } else {
            this.setBalance(this.getBalance() - amount);
            System.out.println("Amount withdrawn successfully");
            System.out.println();
            this.display();
            System.out.println();
        }
    }

    /**
     * changeAddress
     * 
     * @param account
     */
    public void changeAddress() {
        System.out.println("Enter new address: ");
        String address = scan.next();
        this.setAddress(address);
        System.out.println("Address changed successfully");
        System.out.println();
        this.display();
        System.out.println();
    }
}