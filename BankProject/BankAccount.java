package BankProject;
import java.util.Scanner;

public class BankAccount {
    String name;
    long accountNumber;
    char typeOfAccount;
    double totalBalance;

    BankAccount(String name, long accountNumber, char typeOfAccount, double totalBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.typeOfAccount = typeOfAccount;
        this.totalBalance = totalBalance;
    }

    public void depositAmount(double depositAmount) {
        this.totalBalance += depositAmount;
    }

    public boolean withdrawAmount(double withdrawAmount) {
        if(withdrawAmount > this.totalBalance) {
            System.out.println("Insufficient Balance.");
            return false;
        }
        this.totalBalance -= withdrawAmount;
        return true;
    }

    public void displayDetails() {
        System.out.println();
        System.out.println("Name: " + this.name);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Type: "+ this.accountType());
        System.out.println("Current balance: " + this.totalBalance);
    }

    public String accountType() {
        if(this.typeOfAccount == 'S') return "Saving";
        else if(this.typeOfAccount == 'C') return "Current";
        else return "Invalid";
    }

    public static void showMenuText() {
        System.out.println();
        System.out.println("Enter action: ");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("0. Exit");
    }

    public static void main(String[] args) {
        String name;
        long accountNumber;
        char typeOfAccount;
        double totalBalance;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Account Name:");
        name = scan.nextLine();
        System.out.println("Enter Account Number:");
        accountNumber = scan.nextLong();
        System.out.println("Enter Current Balance:");
        totalBalance = scan.nextDouble();
        System.out.println("Enter account type ('S' for saving and 'C' for current):");
        typeOfAccount = scan.next().charAt(0);
        BankAccount achyut = new BankAccount(name, accountNumber, typeOfAccount, totalBalance);
        int action;
        do {
            showMenuText();
            action = scan.nextInt();
            if(action == 1) {
                // For depositing amount
                System.out.println("Enter deposit amount: ");
                long depositAmount = scan.nextLong();
                if(depositAmount <= 0)
                    System.out.println("Enter amount greater than 0.");
                else
                    achyut.depositAmount(depositAmount);
            }
            else if(action == 2) {
                // For withdrawing amount
                System.out.println("Enter amount to withdraw: ");
                long withdrawAmount = scan.nextLong();
                if(withdrawAmount <= 0)
                    System.out.println("Enter amount greater than 0.");
                else
                    achyut.withdrawAmount(withdrawAmount);
            }
            else if(action == 3) {
                // to display details
                achyut.displayDetails();
            }

            else if(action == 0) {
                System.out.println("\nThankyou for using our service.\n");
            }
            else {
                System.err.println("\nInvalid input");
            }
        } while(action != 0);
        scan.close();
    }
}