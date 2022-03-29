import java.util.Scanner;

/**
 * SumAndProduct
 * 
 * @author Achyut Neupane <to@achyut.com.np>
 * 
 * Q. Define a method that returns the product and
 * the sum of two numbers entered by the user.
 * 
 * This code has the code with class `SumAndProduct`
 * which has a constructor where two numbers are
 * initialized. It has a method `productOfNumbers`
 * which returns the product of the two numbers and
 * a method `sumOfNumbers` which returns the sum of
 * the two numbers. 
 * 
*/

public class SumAndProduct {
    int num1,num2;

    // Constructor to initialize the two numbers
    SumAndProduct(int num1,int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // `productOfNumbers` method to return the product of the two numbers
    public int productOfNumbers() {
        return this.num1*this.num2;
    }

    // `sumOfNumbers` method to return the sum of the two numbers
    public int sumOfNumbers() {
        return this.num1+this.num2;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        SumAndProduct sap = new SumAndProduct(num1,num2);
        System.out.println("The product of two numbers are: "+sap.productOfNumbers());
        System.out.println("The sum of two numbers are: "+sap.sumOfNumbers());
        scan.close();
    }
}
