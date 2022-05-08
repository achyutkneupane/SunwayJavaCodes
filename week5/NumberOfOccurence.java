package week5;

/**
 * NumberOfOccurence
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 * @question
 * 6. Write a java program to print the number of occurrences
 * of each element in an array.
 * 
 * @description
 * This class `NumberOfOccurence` is used to find the number of
 * occurrences of each element in an array. It has a method
 * `countOccurence()`. The array is set to
 * {1,2,3,1,2,3,1,2,3,1,2,4} for testing. The method
 * `countOccurence()` returns the number of occurrences of each
 * element in the array.
 */
public class NumberOfOccurence {

    public void countOccurence(int[] arr) {
        int length = arr.length;
        int[] uniqueElements = new int[]{};
        int[] count = new int[]{};
        for(int i=0; i<length;i++) {
            int index = this.existsIn(uniqueElements, arr[i]);
            if(index == -1) {
                uniqueElements = this.addToArray(uniqueElements, arr[i]);
                count = this.addToArray(count, 1);
            } else {
                count[index]++;
            }
        }
        for(int i=0; i<uniqueElements.length;i++) {
            System.out.println(uniqueElements[i] + " occurred " + count[i] + " times.");
        }
    }
    public int existsIn(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }
    public int[] addToArray(int[] array, int element) {
        int returnArray[] = new int[array.length+1];
        for(int i=0; i<array.length; i++) {
            returnArray[i] = array[i];
        }
        returnArray[array.length] = element;
        return returnArray;
    }
    public static void main(String[] args) {
        int[] numArray = new int[]{1,2,3,1,2,3,1,2,3,1,2,4};
        NumberOfOccurence numberOfOccurence = new NumberOfOccurence();
        numberOfOccurence.countOccurence(numArray);
    }
}