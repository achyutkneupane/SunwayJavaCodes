package week5;

import java.util.Scanner;

/**
 * SortArray
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 * @question
 * 5. Write a java program to sort the elements of an integer
 * array in ascending and descending order
 * 
 * @description
 * This class `SortArray` is used to sort the elements of an integer
 * array in ascending and descending order. There are three methods
 * in this class: `sortInAscendingOrder()`, `sortInDescendingOrder()`
 * and `swap()`. The `sortInAscendingOrder()` method sorts the elements
 * of an integer array in ascending order. The `sortInDescendingOrder()`
 * method sorts the elements of an integer array in descending order.
 * The `swap()` method swaps the elements of two integer variables from
 * given array. The array is set to {0, -3, 106, 49, 58} for testing
 * according to the question.
 * 
 */
public class SortArray {
    public int[] sortInDescendingOrder(int[] numArray) {
        if(numArray.length == 0) return numArray;
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for(int i = 0; i < numArray.length-1; i++) {
                if(numArray[i] > numArray[i+1]) {
                    swap(numArray, i, i+1);
                    isSorted = false;
                }
            }
        }
        return numArray;
    }
    public int[] sortInAscendingOrder(int[] numArray) {
        if(numArray.length == 0) return numArray;
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for(int i = 0; i < numArray.length-1; i++) {
                if(numArray[i] < numArray[i+1]) {
                    swap(numArray, i, i+1);
                    isSorted = false;
                }
            }
        }
        return numArray;
    }
    public void swap(int[] numArray, int i, int j) {
        int temp = numArray[i];
        numArray[i] = numArray[j];
        numArray[j] = temp;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SortArray sortArray = new SortArray();
        int[] numArray = {0, -3, 106, 49, 58};
        int[] ascendingArray = sortArray.sortInDescendingOrder(numArray);
        System.out.println("In ascending order: ");
        for(int elem : ascendingArray) {
            System.out.print(elem+" ");
        }
        System.out.println();
        int[] descendingArray = sortArray.sortInAscendingOrder(numArray);
        System.out.println("In descending order: ");
        for(int elem : descendingArray) {
            System.out.print(elem+" ");
        }
        System.out.println();
        scan.close();
    }
}