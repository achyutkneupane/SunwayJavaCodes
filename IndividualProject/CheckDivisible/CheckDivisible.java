package IndividualProject.CheckDivisible;

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
 * This class `CheckDivisible` has method `isDivisible()` which
 * takes `numArray` and `divisor` as parameters and check if all
 * the elements of the array are perfectly divisible by the
 * divisor.
 * Loop is used for every element. It has an integer variable
 * `isDivisible` which is initially 1 and is set to 0 is any
 * element of the array is not perfectly divisible by the divisor.
 * 
 */

public class CheckDivisible {
    public int isDivisible(int[] numArray,int divisor) {
        int isDivisible = 1;
        for (int elem : numArray) {
            if (elem % divisor != 0) {
                isDivisible = 0;
                break;
            }
        }
        return isDivisible;
    }
}