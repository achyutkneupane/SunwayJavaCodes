package basics;
import java.util.Scanner;

public class OddOrEvenUserInput {

    public static boolean isOdd(int num) {
        return num%2==1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scan.nextInt();
        System.out.println("The entered number "+num+" is "+(isOdd(num) ? "odd" : "even"));
        scan.close();
    }
}
