package week5;

import java.util.Scanner;

/**
 * ShiftToRight
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 * @question
 * 4. Write a program to shift every element of an array to
 * circularly right. E.g.-
 * INPUT : 1 2 3 4 5
 * OUTPUT : 5 1 2 3 4
 * 
 * @description
 * This class `ShiftToRight` is used to shift every element of an array to
 * circularly right. It has a method `shiftToRight()` which shifts the elements
 * of an array to circularly right. The array is set to {1, 2, 3, 4, 5} for
 * testing according to the question.
 */
public class ShiftToRight {
    public int[] shiftToRight(int[] numArray) {
        int[] shiftedArray = new int[numArray.length];
        for(int i = 0; i < numArray.length; i++) {
            shiftedArray[(i+1)%numArray.length] = numArray[i];
        }
        return shiftedArray;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ShiftToRight rightShiftArray = new ShiftToRight();
        int[] numArray = {1, 2, 3, 4, 5};
        int[] shiftedArray = rightShiftArray.shiftToRight(numArray);
        for(int elem : shiftedArray) {
            System.out.print(elem+" ");
        }
        System.out.println();
        scan.close();
    }    
}