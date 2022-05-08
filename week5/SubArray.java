package week5;

/**
 * SubArray
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 * @question
 * 3. If the input array is [10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60],
 * your program should be able to find that the subarray lies between
 * the indexes 3 and 8.
 * 
 * @description
 * This class `SubArray` is used to find the subarray of an array
 * between two indexes. It has a method `isSubArray()`. The array
 * is set to {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60} for testing.
 * The method `isSubArray()` returns true if the subarray lies between
 * the indexes 3 and 8 of the main array. Otherwise, it returns false.
 * 
 */
public class SubArray {
    int[] mainArray;
    SubArray() {
        mainArray = new int[] {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
    }
    public boolean isSubArray(int[] subArray) {
        int[] mainArray = this.mainArray;
        boolean isSubArray = false;
        int j = 0;
        for (int i = 3; i <= 8; i++) {
            if(j>=subArray.length) break;

            if(mainArray[i] == subArray[j]) {
                for (int k = i; k < mainArray.length; k++) {
                    if(j>=subArray.length) break;
                    if(subArray[j] != mainArray[k]) {
                        isSubArray = false;
                        break;
                    }

                    isSubArray = true;
                    j++;
                }
            }
        }
        return isSubArray;
    }
    public static void main(String[] args) {
        SubArray sa = new SubArray();
        int[] subArray = new int[] {25, 40, 32};
        System.out.println(sa.isSubArray(subArray) ? "Given array is the subarray" : "Given array is not the subarray");
    }
}