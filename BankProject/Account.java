/**
 * Account
 */
public class Account {
    private String name;
    private long accountNumber;
    private char typeOfAccount;
    private double totalBalance;

    Account(String name, long accountNumber, char typeOfAccount, double totalBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.typeOfAccount = typeOfAccount;
        this.totalBalance = totalBalance;
    }

    // getters
    public String getName() {
        return this.name;
    }
    public long getAccountNumber() {
        return this.accountNumber;
    }
    public String getTypeOfAccount() {
        if(this.typeOfAccount == 'S') return "Saving";
        else if(this.typeOfAccount == 'C') return "Current";
        else return "Invalid";
    }
    public double getTotalBalance() {
        return this.totalBalance;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setTypeOfAccount(char typeOfAccount) {
        this.typeOfAccount = typeOfAccount;
    }
    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    // methods
    public void depositAmount(double depositAmount) {
        double newBalance = this.totalBalance + depositAmount;
        this.setTotalBalance(newBalance);
    }

    public boolean withdrawAmount(double withdrawAmount) {
        if(withdrawAmount > this.getTotalBalance()) {
            System.out.println("Insufficient Balance.");
            return false;
        }
        double newBalance = this.totalBalance - withdrawAmount;
        this.setTotalBalance(newBalance);
        return true;
    }

    public void displayDetails() {
        System.out.println();
        System.out.println("Name: " + this.getName());
        System.out.println("Account Number: " + this.getAccountNumber());
        System.out.println("Account Type: "+ this.getTypeOfAccount());
        System.out.println("Current balance: " + this.getTotalBalance());
    }
}