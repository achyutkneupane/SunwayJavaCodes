package week3;

import java.util.Scanner;

/**
 * ReverseNumber
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 * @question
 * Write a java program to reverse a number using a while loop.
 * 
 * @description
 * This class `ReverseNumber` is used to reverse a number
 * using a while loop. It has a method `getRev()` which
 * returns the reversed number.
 * 
 */
public class ReverseNumber {
    int num, rev;
    ReverseNumber(int num) {
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

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scan.nextInt();

        ReverseNumber number = new ReverseNumber(num);
        System.out.println("The reverse of "+number.num+" is: " + number.getRev());
        scan.close();
    }
}