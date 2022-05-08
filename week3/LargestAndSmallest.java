package week3;

import java.util.Scanner;

/**
 * LargestAndSmallest
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 * @question
 * Write a Java program to enter the numbers till the user
 * wants and at the end the program should display the
 * largest and smallest numbers entered.
 * 
 * @description
 * This class `LargestAndSmallest` is used to enter the
 * numbers till the user wants and at the end the program
 * displays the largest and smallest numbers entered.
 * It has a method `getLargestAndSmallest()` which changes
 * the largest and smallest numbers if the number entered
 * is greater than the largest or smaller than the smallest.
 * 
 */
public class LargestAndSmallest {
    int largest, smallest;
    LargestAndSmallest() {
        this.largest = Integer.MIN_VALUE;
        this.smallest = Integer.MAX_VALUE;
    }
    public void getLargestAndSmallest(int num) {
        if(num == 0) return;
        if (num > this.largest) {
            this.largest = num;
        }
        if (num < this.smallest) {
            this.smallest = num;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers: (0 to stop)");
        LargestAndSmallest largestAndSmallest = new LargestAndSmallest();
        int num;
        do {
            num = scan.nextInt();
            largestAndSmallest.getLargestAndSmallest(num);
        } while (num != 0);
        System.out.println("Largest number: " + largestAndSmallest.largest);
        System.out.println("Smallest number: " + largestAndSmallest.smallest);
        scan.close();
    }
}