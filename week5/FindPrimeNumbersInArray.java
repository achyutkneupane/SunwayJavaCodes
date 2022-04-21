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
        int[] numArray = new int[]{1,2,3,-5,4,5,6,7,8,9,10};
        FindPrimeNumbersInArray findPrimeNumbersInArray = new FindPrimeNumbersInArray();
        for(int i=0; i<numArray.length; i++) {
            if(findPrimeNumbersInArray.isPrime(numArray[i])) {
                System.out.println(numArray[i] + " - at index "+ findPrimeNumbersInArray.existsIn(numArray, numArray[i]));
            }
        }
    }
}