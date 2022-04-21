import java.util.Scanner;

/**
 * RemoveElement
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 * @question
 * 7. Write a Java Program to remove a particular element from an array.
 * 
 * @description
 * This class `RemoveElement` is used to remove a particular element from an
 * array. The array is set to {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} for testing.
 * It has two methods `removeElement()` and `existsIn()`. The method
 * `removeElement()` removes the element from the array. The method
 * `existsIn()` returns the index of the element in the array.
 * 
 */
public class RemoveElement {
    
    public int[] removeElement(int[] arr, int element) {
        int length = arr.length;
        int[] newArray = new int[length - 1];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (arr[i] != element) {
                newArray[index] = arr[i];
                index++;
            }
        }
        return newArray;
    }


    public static boolean existsIn(int[] arr, int element) {
        boolean exists = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                exists = true;
            }
        }
        return exists;
    }

    public static void main(String[] args) {
        int[] numArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numToRemove;
        boolean existsInArray;

        System.out.println("Original Array");
        for (int elem : numArray) {
            System.out.print(elem + " ");
        }
        System.out.println();

        RemoveElement removeElement = new RemoveElement();
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Enter the number to remove: ");
            numToRemove = scan.nextInt();
            existsInArray = RemoveElement.existsIn(numArray, numToRemove);
            if(!existsInArray) System.out.println("Number not in list to delete");
        } while (!existsInArray);
        int[] newArray;
        newArray = removeElement.removeElement(numArray, numToRemove);
        System.out.println("Removed Array");
        for (int elem : newArray) {
            System.out.print(elem + " ");
        }
        System.out.println();
        scan.close();
    }
}