import java.util.Scanner;

/**
 * SquareCheck
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 * @question
 * Write a function named isSquare that returns 1 if
 * its integer argument is a square of some integer,
 * otherwise it returns 0. 
 * 
 * @description
 * This class `SquareCheck` is used to check whether
 * a number is a square of some integer or not. It has
 * a method `isSquare()` which returns 1 if the
 * number is a square of some integer and 0 if it is
 * not.
 * 
 */
public class SquareCheck {
    public int isSquare(int num) {
        int i = 1;
        while (i * i <= num) {
            if (i * i == num) {
                return 1;
            }
            i++;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scan.nextInt();
        SquareCheck number = new SquareCheck();
        System.out.println("The number "+num+" is "+(number.isSquare(num) == 1 ? "" : "not " )+"a perfect square.");
        scan.close();
    }   
}