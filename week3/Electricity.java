import java.util.Scanner;

/**
 * Electricity
 * 
 * @author Achyut Neupane<to@achyut.com.np>
 * 
 * @question
 * Write a program to calculate the electricity bill
 * (accept number of unit from user)
 * 
 * @criteria
 * No Charge for first 100 units
 * Rs. 5 per unit for next 100 units
 * Rs. 10 per unit after 200 units
 * 
 * @description
 * This class `Electricity` is used to calculate the
 * electricity bill. It has a method `getPrice()` which
 * returns the price of electricity based on the unit
 * provided by the user and by criterias mentioned above.
 * 
 */
public class Electricity {
    int unit;
    long cost;

    Electricity(int unit) {
        this.unit = unit;
    }
    public long getPrice() {
        if (this.unit <= 100) {
            this.cost = 0;
        } else if (this.unit <= 200) {
            this.cost = 5 * (this.unit - 100);
        } else {
            this.cost = 5 * 100 + 10 * (this.unit - 200);
        }
        return this.cost;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of units:");
        int unit = scan.nextInt();

        Electricity elec = new Electricity(unit);
        System.out.println("The total bill amount is: Rs. "+elec.getPrice());
        scan.close();
    }
}