/**
 * PatternTwo
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 * @question
 * Write a Java Program to print the following pattern:
 *  *
 *  **
 *  ***
 *  ****
 *  *****
 * 
 * @description
 * This class 'PatternTwo' is used to print the given pattern.
 * It has a main method which is used to print the pattern.
 * There are two ways to print the pattern. One is using nested
 * for loop and the other is using single for loop.
 * 
 */
public class PatternTwo {
    public static void main(String[] args) {
        System.out.println("Pattern 2:");
        for(int i=0;i<5;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Without using nested for loop:");
        for(int i=0;i<5;i++) {
            System.out.println("*".repeat(i+1));
        }
    }
}
