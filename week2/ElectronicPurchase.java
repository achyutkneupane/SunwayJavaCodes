import java.util.Scanner;

public class ElectronicPurchase {

    char type;
    double amount;
    String name,address;

    ElectronicPurchase() {
        this.type = ' ';
        this.amount = 0.0;
        this.name = "";
        this.address = "";
    }
    ElectronicPurchase(char type, double amount, String name, String address) {
        this.type = type;
        this.amount = amount;
        this.name = name;
        this.address = address;
    }
    
    public boolean isLaptop() {
        return this.type == 'L';
    }

    public double returnDiscountPercentage() {
        if(this.amount > 100000) {
            return isLaptop() ? 10 : 15;
        } else if(this.amount >= 57001) {
            return isLaptop() ? 7.5 : 10;
        } else if(this.amount >= 25001) {
            return isLaptop() ? 5 : 7.5;
        } else {
            return isLaptop() ? 0 : 5;
        }
    }

    public double returnDiscountAmount() {
        return this.amount * (this.returnDiscountPercentage()/100);
    }

    public double returnTotalAmount() {
        return this.amount - this.returnDiscountAmount();
    }

    public void printDetails() {
        System.out.println("Name: "+this.name);
        System.out.println("Address: "+this.address);
        System.out.println("Type: "+(this.isLaptop() ? "Laptop" : "Desktop"));
        System.out.println("Amount: Rs."+this.amount);
        System.out.println("Discount Percentage: "+this.returnDiscountPercentage()+"%");
        System.out.println("Discount Amount: Rs."+this.returnDiscountAmount());
        System.out.println("Total Amount: Rs."+this.returnTotalAmount());
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char type;
        do {
            System.out.println("Enter the type of the product: ");
            type = scan.useDelimiter("\n").next().charAt(0);
        } while(type != 'L' && type != 'D');
        System.out.println("Enter the amount of the purchase: ");
        double amount = scan.nextDouble();
        System.out.println("Enter the name of the customer: ");
        String name = scan.nextLine();
        System.out.println("Enter the address of the customer: ");
        String address = scan.nextLine();
        ElectronicPurchase ep = new ElectronicPurchase(type, amount, name, address);
        ep.printDetails();
        scan.close();
    }
}
