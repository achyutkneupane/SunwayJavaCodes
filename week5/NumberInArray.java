package week5;

import java.util.Scanner;

/**
 * NumberInArray
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 * @question
 * 1. Take 10 integer inputs from the user and store them in an array.
 * Again ask the user to give a number. Now, tell the user whether
 * that number is present in the array or not.
 * 
 * @description
 * This class `NumberInArray` is used to check whether a number is
 * present in an array or not. It takes an array of 10 integers
 * from user input and a number from user input and checks whether
 * the number is present in the array or not. If the number is
 * present in the array, it prints "Number is present in the array"
 * else it prints "Number is not present in the array".
 * It has two methods `takeInput()` and `checkNumber()`. `takeInput()`
 * is used to take input from user and store it in an array.
 * `checkNumber()` is used to check whether the number is present
 * in the array or not.
 * 
 */
public class NumberInArray {
    int[] numArray;
    NumberInArray() {
        this.numArray = new int[10];
    }
    public void takeInput(Scanner scan) {
        for(int i = 0; i < this.numArray.length; i++) {
            System.out.println("Enter number "+(i+1)+": ");
            this.numArray[i] = scan.nextInt();
        }
    }
    public boolean checkNumber(int num) {
        for(int i = 0; i < this.numArray.length; i++) {
            if(this.numArray[i] == num) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NumberInArray numArray = new NumberInArray();

        numArray.takeInput(scan);

        System.out.println("Enter number to check: ");
        int num = scan.nextInt();
        scan.close();

        if(numArray.checkNumber(num)) {
            System.out.println("Number "+num+" is present in the array");
        } else {
            System.out.println("Number "+num+" is not present in the array");
        }
    }
}