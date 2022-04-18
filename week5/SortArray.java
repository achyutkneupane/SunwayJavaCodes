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
 * array in ascending and descending order.
 * 
 */
public class SortArray {
    public int[] sortInDescendingOrder(int[] numArray) {
        int[] sortedArray = new int[numArray.length];
        for(int i = 0; i < numArray.length; i++) {
            sortedArray[i] = numArray[i];
        }
        for(int i = 0; i < numArray.length; i++) {
            for(int j = i+1; j < numArray.length; j++) {
                if(sortedArray[i] < sortedArray[j]) {
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }
        return sortedArray;
    }    
}