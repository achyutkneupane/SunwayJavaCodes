import java.util.Scanner;

public class ElectronicPurchase {

    /**
     * ElectronicPurchase
     * 
     * @author Achyut Neupane <to@achyut.com.np>
     * 
     * Q. Write a program based on the above criteria, to
     * input name, address, amount of purchase and the type
     * of purchase, L for laptop and D for desktop by a
     * customer. Compute and print the net amount to be
     * paid by a customer along with his name and address.
     * 
     * This code has the class `ElectronicPurchase` which has a constructor
     * where the customer's name, address, amount of purchase and type of
     * purchase are initialized. It has a method `isLaptop` which returns
     * true if the type of purchase is laptop and false for desktop. It
     * has a method `returnDiscountPercentage` which returns the discount
     * percentage for the type of purchase. It has a method `returnDiscountAmount`
     * which returns the discount amount for the type of purchase. It has a
     * method `returnTotalAmount` which returns the net amount to be paid by
     * the customer. It also has a method `printDetails` which prints the
     * details of the customer along with the net amount to be paid.
     * 
     */

    char type;
    double amount;
    String name,address;

    ElectronicPurchase(char type, double amount, String name, String address) {
        this.type = type;
        this.amount = amount;
        this.name = name;
        this.address = address;
    }
    
    // returns true if the type of purchase is laptop
    public boolean isLaptop() {
        return this.type == 'L';
    }

    // returns the discount percentage for the type of purchase
    public double returnDiscountPercentage() {
        if(this.amount > 100000) {
            return isLaptop() ? 10 : 15;
        } else if(this.amount >= 57001) {
            return this.isLaptop() ? 7.5 : 10;
        } else if(this.amount >= 25001) {
            return this.isLaptop() ? 5 : 7.5;
        } else {
            return this.isLaptop() ? 0 : 5;
        }
    }

    // returns the discount amount for the type of purchase
    public double returnDiscountAmount() {
        return this.amount * (this.returnDiscountPercentage()/100);
    }

    // returns the net amount to be paid by the customer
    public double returnTotalAmount() {
        return this.amount - this.returnDiscountAmount();
    }

    // prints the details of the customer along with the net amount to be paid
    public void printDetails() {
        System.out.println("Name: "+this.name);
        System.out.println("Address: "+this.address);
        System.out.println("Type: "+(this.isLaptop() ? "Laptop" : "Desktop"));
        System.out.println("Amount: Rs."+this.amount);
        System.out.println("Discount Percentage: "+this.returnDiscountPercentage()+"%");
        System.out.println("Discount Amount: Rs."+this.returnDiscountAmount());
        System.out.println("Total Amount: Rs."+this.returnTotalAmount());
    }

    // useDelimiter("\n") is used to remove the linebreak from the input
    // otherwise the next nextLine() will be skipped
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char type;
        // Asks for the type of product (L for laptop and D for desktop) until the user enters L or D
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
