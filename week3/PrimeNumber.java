/**
 * PrimeNumber
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 * @question
 * Write a program to print all prime numbers in between 1 to 100
 * 
 * @description
 * This class `PrimeNumber` is used to print all prime numbers
 * in between 1 to 100. It has a method `isPrime()` which
 * returns true if the number is a prime number and false if
 * it is not. It also has a method `getPrimes()` which prints
 * all prime numbers in between 1 to 100 in a same line. 
 * 
 */
public class PrimeNumber {
    public static boolean isPrime(int num) {
        boolean isPrime = true;
        if(num == 1) {
            return false;
        }
        for (int i = 2; i <= (int) ((num - 1) / 2); i++) {
            isPrime = (num % i == 0) ? false : true;
            if(!isPrime) break;
        }
        return isPrime;
    }
    public static void getPrimes() {
        for (int i = 1; i <= 100; i++) {
            if(isPrime(i)) {
                System.out.print((i==2 ? " " :", ")+i);
            }
        }
        // Adding line change to the end
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.print("Prime numbers between 1 to 100 are:");
        PrimeNumber.getPrimes();
    }
}