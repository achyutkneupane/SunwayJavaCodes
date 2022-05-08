package week3;

import java.util.Scanner;

/**
 * PalindromeCheck
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 * @question
 * Take input from the user and determine whether it
 * is a palindrome number or not using a loop.
 * 
 * @description
 * This class `PalindromeCheck` is used to check whether
 * a number is a palindrome or not. It has a method
 * `getRev()` which returns the reversed number. It
 * also has a method `isPalindrome()` which returns
 * true if the number is a palindrome and false if
 * it is not.
 * 
 */
public class PalindromeCheck {
    int num,rev;
    boolean isPalindrome;
    PalindromeCheck(int num) {
        this.num = num;
    }
    public int getRev() {
        int number = this.num;
        while (number != 0) {
            this.rev = this.rev * 10 + number % 10;
            number /= 10;
        }
        return this.rev;
    }
    public boolean isPalindrome() {
        int number = this.num;
        int rev = this.getRev();
        this.isPalindrome = (number == rev) ? true : false;
        return this.isPalindrome;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scan.nextInt();

        PalindromeCheck number = new PalindromeCheck(num);
        System.out.println("The number is "+(number.isPalindrome() ? "" : "not " )+"palindrome.");
        scan.close();
    }
}