import java.util.Scanner;

/**
 * EvenAndOdd
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 * @question
 * Write a Java program that reads a set of integers, and then
 * prints the sum of the even and odd integers using loop.
 * 
 * @description
 * This class `EvenAndOdd` is used to read a set of integers,
 * and then prints the sum of the even and odd integers using
 * loop. It has a method `isEven()` which returns true if the
 * number is even and false if it is odd. It also has a method
 * `sumNumbers()` which perform the sum of even and odd numbers.
 * 
 */
public class EvenAndOdd {
    int sumOfEven, sumOfOdd;
    EvenAndOdd() {
        this.sumOfEven = 0;
        this.sumOfOdd = 0;
    }
    public static boolean isEven(int num) {
        return (num % 2 == 0) ? true : false;
    }
    public void sumNumbers(int num) {
        if (isEven(num)) {
            this.sumOfEven += num;
        } else {
            this.sumOfOdd += num;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers: (0 to stop)");
        EvenAndOdd evenAndOdd = new EvenAndOdd();
        int num;
        do {
            num = scan.nextInt();
            evenAndOdd.sumNumbers(num);
        } while (num != 0);
        System.out.println("Sum of even numbers: " + evenAndOdd.sumOfEven);
        System.out.println("Sum of odd numbers: " + evenAndOdd.sumOfOdd);
        scan.close();
    }
}