package week4.Patterns;
/**
 * PatternThree
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 * @question
 * Write a Java Program to print the following pattern:
 * 
 *      *
 *     **
 *    ***
 *   ****
 *  *****
 * 
 * @description
 * This class 'PatternThree' is used to print the given pattern.
 * It has a main method which is used to print the pattern.
 * There are two ways to print the pattern. One is using nested
 * for loop and the other is using single for loop.
 */
public class PatternThree {
    public static void main(String[] args) {
        System.out.println("Pattern 3:");
        for(int i=0;i<5;i++) {
            for(int j=0;j<5;j++) {
                if(j<(4-i)) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Without using nested for loop:");
        for(int i=0;i<5;i++) {
            System.out.println(" ".repeat(4-i) + "*".repeat(i+1));
        }
    }
}