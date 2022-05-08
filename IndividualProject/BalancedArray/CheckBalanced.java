package IndividualProject.BalancedArray;

/**
 * CheckBalanced
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 * @question
 * Write a method named isDivisible that takes an integer array
 * and a divisor and returns 1 if all its elements are divided
 * by the divisor with no remainder. Otherwise, it returns 0.
 * 
 * @description
 * 
 * 
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
}