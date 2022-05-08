package week5;
/**
 * CheckEqual
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 * @question
 * 8. Write a Java program to check if two arrays are equal.
 * Equal arrays means both the arrays must have the same
 * elements .
 * 
 * @description
 * This class `CheckEqual` is used to check if two arrays are equal.
 * It has a method `checkEqual()` which returns true if the
 * arrays are equal. Otherwise, it returns false. The arrays are
 * set to {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} and {1, 2, 3, 4, 5, 6, 8, 9, 11, 78, 10}
 * for testing.
 * 
 */
public class CheckEqual {
    public boolean checkEqual(int[] arr1, int[] arr2) {
        int length = arr1.length;
        if (length != arr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] numArray1 = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] numArray2 = new int[]{1,2,3,4,5,6,8,9,11,78,10};
        CheckEqual checkEqual = new CheckEqual();
        boolean isEqual = checkEqual.checkEqual(numArray1, numArray2);
        if(isEqual) System.out.println("Both arrays are equal");
        else System.out.println("Both arrays are not equal");
    }
}