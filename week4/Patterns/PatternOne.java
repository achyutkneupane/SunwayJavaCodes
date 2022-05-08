package week4.Patterns;
/**
 * PatternOne
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 * @question
 * Code to print this pattern:
 *   **********
 *   **********
 *   **********
 *   **********
 * 
 * @description
 * This class 'PatternOne' is used to print the given pattern.
 * It has a main method which is used to print the pattern.
 * There are two ways to print the pattern. One is using nested
 * for loop and the other is using single for loop.
 * 
 */
public class PatternOne {
    public static void main(String[] args) {
        System.out.println("Pattern 1:");
        for(int i=0;i<4;i++) {
            for(int j=0;j<10;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Without using nested for loop:");
        for(int i=0;i<4;i++) {
            System.out.println("*".repeat(10));
        }
    }
}
