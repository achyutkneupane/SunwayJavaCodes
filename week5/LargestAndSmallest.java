import java.util.Scanner;

/**
 * LargestAndSmallest
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 * @question
 * 2. Find largest and smallest elements of an array along
 * with the index number of those elements.
 * 
 * @description
 * This class `LargestAndSmallest` is used to find the largest
 * and smallest elements of an array along with the index number
 * of those elements. It has 3 methods `printLargestAndSmallest()`,
 * `findIndexOfLargest()` and `findIndexOfSmallest()`.
 * 
 * `printLargestAndSmallest()` prints the largest and smallest
 * elements of an array. `findIndexOfLargest()` finds the index
 * number of the largest element of an array. `findIndexOfSmallest()`
 * finds the index number of the smallest element of an array.
 * 
 * The array is set to {34, 56, 78, 90, 23, 45, 67, 89, 12}
 * for testing.
 * 
 */
public class LargestAndSmallest {
    public int findIndexOfLargest(int[] numArray) {
        int largest = numArray[0];
        int index = 0;
        for(int i = 0; i < numArray.length; i++) {
            if(numArray[i] > largest) {
                largest = numArray[i];
                index = i;
            }
        }
        return index;
    }
    public int findIndexOfSmallest(int[] numArray) {
        int smallest = numArray[0];
        int index = 0;
        for(int i = 0; i < numArray.length; i++) {
            if(numArray[i] < smallest) {
                smallest = numArray[i];
                index = i;
            }
        }
        return index;
    }
    public void printLargestAndSmallest(int[] numArray) {
        int indexOfLargest = this.findIndexOfLargest(numArray);
        int indexOfSmallest = this.findIndexOfSmallest(numArray);
        System.out.println("Largest number is "+numArray[indexOfLargest]+" at index "+indexOfLargest);
        System.out.println("Smallest number is "+numArray[indexOfSmallest]+" at index "+indexOfSmallest);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LargestAndSmallest largestAndSmallest = new LargestAndSmallest();
        // array for testing is: {34, 56, 78, 90, 23, 45, 67, 89, 12}
        int[] numArray = new int[]{34, 56, 78, 90, 23, 45, 67, 89, 12};
        largestAndSmallest.printLargestAndSmallest(numArray);
        scan.close();
    }
}