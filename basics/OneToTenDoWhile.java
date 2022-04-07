package basics;
import java.util.Scanner;

public class OneToTenDoWhile {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Enter a number between 1 to 10 (don't include 1 and 10)");
            num = scan.nextInt();
        } while(num<10 && num>1);
        scan.close();
    }
}
