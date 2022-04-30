import java.util.Scanner;

/**
 * SwapNumbers
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 * @question
 * Write a Java Program to swap two numbers using the third variable.
 * 
 * @description
 * This class 'SwapNumbers' is used to swap two numbers. There are two
 * attributes 'num1' and 'num2' which are used to store the values of
 * two numbers. It has two methods 'withTemp' and 'withoutTemp' which
 * are used to swap the numbers with and without using a temporary
 * variable respectively. It also has a main method which is used to
 * call the methods. 
 * 
 */

public class SwapNumbers {
    int num1,num2;
    SwapNumbers(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public void withTemp() {
        int temp = this.num1;
        this.num1 = this.num2;
        this.num2 = temp;
        System.out.println("Swapped numbers with third variable are: "
                            +this.num1+" "+this.num2);
    }
    public void withoutTemp() {
        this.num1 = this.num1-this.num2;
        this.num2 = this.num1+this.num2;
        this.num1 = this.num2-this.num1;
        System.out.println("Swapped numbers without third variable are: "
                            +this.num1+" "+this.num2);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1 = scan.nextInt();
        System.out.println("Enter number 2:");
        int num2 = scan.nextInt();
        SwapNumbers obj = new SwapNumbers(num1,num2);
        obj.withTemp();
        obj.withoutTemp();
        scan.close();
    }
}
