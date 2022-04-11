import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter monthly investment: ");
        double principal = scan.nextDouble();
        System.out.println("Enter years: ");
        int years = scan.nextInt();
        System.out.println("Rate of interest: ");
        int rate = scan.nextInt();
        double amount = 0;
        for(int i=1;i<=years;i++) {
            double newAmount = amount + 12*principal;
            amount = newAmount + newAmount*(rate/100d);
        }
        System.out.println("Amount: "+amount);
        scan.close();
    }
}
