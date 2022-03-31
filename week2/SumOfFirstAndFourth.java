import java.util.Scanner;

public class SumOfFirstAndFourth {
    /**
     * SumOfFirstAndFourth
     * 
     * @author Achyut Neupane <to@achyut.com.np>
     * 
     * Q. Write a program to input a five digit number from
     * the user and calculate the sum of the first and the
     * second last digit of a 5 digit.
     * 
     * This code has the class `SumOfFirstAndFourth` which
     * has a constructor where a five digit number is
     * initialized. It has a method `sumOfFirstAndFourth`
     * which returns the sum of the first and the second
     * last digit of the five digit number.
     * 
     * 
     */
    int number;
    SumOfFirstAndFourth() {
        this.number = 11111;
    }
    SumOfFirstAndFourth(int number) {
        this.number = number;
    }

    // returns the sum of the first and the second last digit of the five digit number
    public long sumOfFirstAndFourth() {
        // get the first digit by dividing the number by 10
        int firstDigit = (this.number/10000);
        // get the second last digit by getting the modulus of the number by 100 and then dividing the modulus by 10 and converting it to long
        int fourthDigit =  ((this.number%100) / 10);
        return (firstDigit + fourthDigit);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int scannedNumber;
        // asks the user to enter a five digit number until the user enters a five digit number
        do {
            System.out.println("Enter a five digit number: ");
            scannedNumber = scan.nextInt();
        } while(scannedNumber < 10000 || scannedNumber > 99999);
        SumOfFirstAndFourth number = new SumOfFirstAndFourth(scannedNumber);
        System.out.println("Sum of first and fourth digits of "+
                           number.number+" is: "+
                           number.sumOfFirstAndFourth());
        scan.close();
    }
}
