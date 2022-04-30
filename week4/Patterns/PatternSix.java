/**
 * PatternSix
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np
 * 
 * @question
 * Write a Java Program to print the following pattern:
 * 
 *      1
 *     212
 *    32123
 *   4321234
 *  543212345
 * 
 * @description
 * This class 'PatternSix' is used to print the given pattern.
 * It has a main method which is used to print the pattern.
 * 
 */
public class PatternSix {
    public static void main(String[] args) {
        System.out.println("Pattern 4:");
        int n = 5;
        for(int i=0;i<n;i++) {
            for(int j=0;j<(2*n-1);j++) {
                if(j<((n-i-1))) System.out.print(" ");
                else if(j >= n-i-1 && j <= n-1) System.out.print(n-j);
                else if(j <= n+i-1 && j > n-1) System.out.print(j-n+2);
                else if(j >= n+i-1) System.out.print("");
            }
            System.out.println();
        }
        System.out.println();
    }
}
