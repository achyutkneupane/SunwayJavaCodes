/**
 * CopyArray
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 * @question
 * 9. Write a Java code to copy the elements of an Array into another array.
 * 
 * @description
 * This class `CopyArray` is used to copy the elements of an Array into another
 * array. It has a method `copyArray()` which returns the copied array. The
 * array is set to {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} for testing. The method
 * `copyArray()` copies the elements of the array into another array and
 * returns the copied array.
 */

public class CopyArray {
    
    public int[] copyArray(int[] arr) {
        int length = arr.length;
        int[] newArray = new int[length];
        for (int i = 0; i < length; i++) {
            newArray[i] = arr[i];
        }
        return newArray;
    }
    public static void main(String[] args) {
        int[] numArray = new int[]{1,2,3,4,5,6,7,8,9,10};

        System.out.println("Original Array");
        for(int elem : numArray) {
            System.out.print(elem + " ");
        }
        System.out.println();

        CopyArray copyArray = new CopyArray();
        int[] newArray = copyArray.copyArray(numArray);
        
        System.out.println("Copied Array");
        for(int elem : newArray) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}