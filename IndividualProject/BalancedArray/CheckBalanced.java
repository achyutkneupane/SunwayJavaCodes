package BalancedArray;

/**
 * CheckBalanced
 */
public class CheckBalanced {
    public boolean isEven(int num) {
        return num % 2 == 0;
    }
    public boolean isOdd(int num) {
        return num % 2 != 0;
    }
    public int isBalanced(int[] numArray) {
        int isBalanced = 1;
        for(int i=0;i<numArray.length; i++) {
            if((isEven(i) && isOdd(numArray[i]) || (isOdd(i) && isEven(numArray[i])))) {
                isBalanced = 0;
                break;
            }
        }
        return isBalanced;
    }
    public static void main(String[] args) {
        CheckBalanced checkBalanced = new CheckBalanced();
        int[] array1 = new int[]{2,3,6,7};
        int[] array2 = new int[]{6,7,2,3,12};
        int[] array3 = new int[]{7,15,2,3};
        int[] array4 = new int[]{16,6,2,3};
        int[] array5 = new int[]{};
        System.out.println(checkBalanced.isBalanced(array1));
        System.out.println(checkBalanced.isBalanced(array2));
        System.out.println(checkBalanced.isBalanced(array3));
        System.out.println(checkBalanced.isBalanced(array4));
        System.out.println(checkBalanced.isBalanced(array5));
    }
}