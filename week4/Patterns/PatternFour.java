package week4.Patterns;
/**
 * PatternFour
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 * @question
 * Write a Java Program to print the following pattern:
 *      *
 *     ***
 *    *****
 *   *******
 *  *********
 * 
 * @description
 * This class 'PatternFour' is used to print the given pattern.
 * It has a main method which is used to print the pattern.
 * There are two ways to print the pattern. One is using nested
 * for loop and the other is using single for loop.
 */
public class PatternFour {
    public static void main(String[] args) {
        System.out.println("Pattern 4:");
        int n = 5;
        for(int i=0;i<n;i++) {
            for(int j=0;j<(2*n-1);j++) {
                if(j<((n-i-1))) System.out.print(" ");
                else if(j >= n-i-1 && j <= n+i-1) System.out.print("*");
                else System.out.print("");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Without using nested for loop:");
        for(int i=0;i<n;i++) {
            System.out.println(" ".repeat(n-i-1) + "*".repeat(2*i+1));
        }
    }
}
