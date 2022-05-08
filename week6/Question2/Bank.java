package week6.Question2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Bank
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 */
public class Bank {

    static Scanner scan = new Scanner(System.in);

    /**
     * enterInformation
     * 
     * @param scan
     * @param i
     * @return Account
     */
    public Account enterInformation(int i) {
        System.out.println("Enter the name of the account holder "+(i+1));
        String name = scan.next();
        System.out.println("Enter the address of the account holder "+(i+1));
        String address = scan.next();
        System.out.println("Enter the account type "+(i+1));
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        int accountType = scan.nextInt();
        System.out.println("Enter the balance of the account "+(i+1));
        double balance = scan.nextDouble();
        System.out.println();
        return new Account(name, address, accountType, balance);
    }

    /**
     * showOptions
     * 
     * @param scan
     */
    public void showOptions(Account account) {
        int option;
        do {
            System.out.println("Enter an option: ");
            System.out.println("1. Print Details");
            System.out.println("2. Deposit amount");
            System.out.println("3. Withdraw amount");
            System.out.println("4. Change Address");
            System.out.println("0. Exit");
            System.out.println();
            option = scan.nextInt();
            switch(option) {
                case 1:
                    account.display();
                    break;
                case 2:
                    account.depositAmount();
                    break;
                case 3:
                    account.withdrawAmount();
                    break;
                case 4:
                    account.changeAddress();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } while (option != 0);
    }

    /**
     * main method
     * 
     * @param args
     */
    public static void main(String[] args) {
        Bank newBank = new Bank();
        ArrayList<Account> bankAccountList = new ArrayList<Account>();
        for(int i=0;i<5;i++) {
            bankAccountList.add(newBank.enterInformation(i));
        }
        String accountNumber = null;
        System.out.println();
        System.out.println("Enter Account Number (Starting with BAXXXX): ");
        boolean getAccountNumber = true;
        while(getAccountNumber) {
            try {
                accountNumber = scan.next();
                getAccountNumber = false;
            } catch(java.util.NoSuchElementException e) {
                System.out.println("Exception: " + e);
            }
        }
        boolean found = false;
        for(Account account:bankAccountList) {
            if(account.getAccountNumber().equals(accountNumber)) {
                found = true;
                newBank.showOptions(account);
            }
        }
        if(!found) {
            System.out.println("Account not found");
        }
    }
}