import java.util.Scanner;

public class Bank {

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
        Account achyut = new Account(name, accountNumber, typeOfAccount, totalBalance);
        achyut.setName("Achyut Neupane");
        int action;
        do {g
            showMenuText();
            action = scan.nextInt();
            if(action == 1) {
                // For depositing amount
                System.out.println("Enter deposit amount: ");
                long depositAmount = scan.nextLong();
                if(depositAmount <= 0) System.out.println("Enter amount greater than 0.");
                else achyut.depositAmount(depositAmount);
            }
            else if(action == 2) {
                // For withdrawing amount
                boolean withdrawn = false;
                while(withdrawn == false) {
                    System.out.println("Enter amount to withdraw: ");
                    long withdrawAmount = scan.nextLong();
                    if(withdrawAmount <= 0) System.out.println("Enter amount greater than 0.");
                    else withdrawn = achyut.withdrawAmount(withdrawAmount);
                }
            }
            else if(action == 3) achyut.displayDetails();
            else if(action == 0) System.out.println("\nThankyou for using our service.\n");
            else System.err.println("\nInvalid input");
        } while(action != 0);
        scan.close();
    }
}