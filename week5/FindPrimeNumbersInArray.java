/**
 * FindPrimeNumbersInArray
 * 
 * @author
 * Achyut Neupane
 * 
 * @question
 * 10. Write a java program to print the prime numbers
 * found in an array with the index number.
 * 
 * @description
 * This class `FindPrimeNumbersInArray` is used to find the prime
 * numbers found in an array with the index number. It has two
 * methods `existsIn()` and `isPrime()`. The array is set to
 * {5,8,13,18,24,43,55,67,89,100} for testing. The method `existsIn()`
 * returns the index of the element in the array. The method
 * `isPrime()` returns true if the element is prime.
 */

public class FindPrimeNumbersInArray {
    public int existsIn(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }
    public boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] numArray = new int[]{5,8,13,18,24,43,55,67,89,100};
        FindPrimeNumbersInArray findPrimeNumbersInArray = new FindPrimeNumbersInArray();
        for(int i=0; i<numArray.length; i++) {
            if(findPrimeNumbersInArray.isPrime(numArray[i])) {
                System.out.println(numArray[i] + " - at index "+ findPrimeNumbersInArray.existsIn(numArray, numArray[i]));
            }
        }
    }
}
