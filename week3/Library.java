import java.util.Scanner;

/**
 * Library
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 * @question
 * Accept the number of days from the user
 * and calculate the charge for library
 * 
 * @criteria
 * Rs. 2 per day till 5 days,
 * Rs. 3 per day for 6 to 10 days,
 * Rs. 4 per day for 11 to 15 days,
 * Rs. 5 per day after 15 days
 * 
 * @description
 * This class `Library` is used to calculate the
 * library charge. It has a method `getCharge()` which
 * returns the charge of library based on the number
 * of days provided by the user and by criterias
 * mentioned above.
 * 
 */
public class Library {
    int days, charge;

    Library(int days) {
        this.days = days;
    }

    public int getCharge() {
        if (this.days <= 5) {
            this.charge = 2 * this.days;
        } else if (this.days <= 10) {
            this.charge = 2 * 5 + 3 * (this.days - 5);
        } else if (this.days <= 15) {
            this.charge = 2 * 5 + 3 * 5 + 4 * (this.days - 10);
        } else {
            this.charge = 2 * 5 + 3 * 5 + 4 * 5 + 5 * (this.days - 15);
        }
        return this.charge;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of days:");
        int days = scan.nextInt();

        Library lib = new Library(days);
        System.out.println("The total charge is: Rs. " + lib.getCharge());
        scan.close();
    }
}