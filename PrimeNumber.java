import java.util.Scanner;

public class PrimeNumber {

    public static boolean isPrime(int num) {
        boolean isPrime = true;
        for (int i = 2; i <= (int) ((num - 1) / 2); i++) {
            isPrime = (num % i == 0) ? false : true;
            if(!isPrime) break;
        }
        return isPrime;
    }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number");
    int num = scan.nextInt();
    System.out.println("The number " + num + " is " + (isPrime(num) ? "" : "not ") + "a prime number.");
    scan.close();
  }
}