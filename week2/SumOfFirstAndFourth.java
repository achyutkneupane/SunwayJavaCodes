import java.util.Scanner;

public class SumOfFirstAndFourth {
    long number;
    SumOfFirstAndFourth() {
        this.number = 11111;
    }
    SumOfFirstAndFourth(long number) {
        this.number = number;
    }
    public long sumOfFirstAndFourth() {
        long firstDigit = (this.number/10000);
        long fourthDigit =  (long)(((this.number%100) / 10));
        return (firstDigit + fourthDigit);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long scannedNumber;
        do {
            System.out.println("Enter a five digit number: ");
            scannedNumber = scan.nextLong();
        } while(scannedNumber < 10000 || scannedNumber > 99999);
        SumOfFirstAndFourth number = new SumOfFirstAndFourth(scannedNumber);
        System.out.println("Sum of first and fourth digits of "+number.number+" is: "+number.sumOfFirstAndFourth());
        scan.close();
    }
}
