import java.util.Scanner;

public class CountPrimeBetween {
    int num1,num2;

    CountPrimeBetween(int num1,int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int countPrime() {
        int totalPrime = 0;
        for(int i=this.num1;i<=this.num2;i++) {
            boolean isPrime = PrimeNumber.isPrime(i);
            totalPrime += isPrime ? 1 : 0;
            System.out.println(i);
        }
        return totalPrime;
    }
    public static void main(String[] args) {
        int num1,num2;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        num1 = scan.nextInt();
        do {
            System.out.println("Enter a number greater than "+num1);
            num2 = scan.nextInt();
        } while(num2<=num1);
        CountPrimeBetween range = new CountPrimeBetween(num1, num2);
        System.out.println("There are "+range.countPrime()+" prime numbers between "+num1+" and "+num2);
        scan.close();
    }
}
