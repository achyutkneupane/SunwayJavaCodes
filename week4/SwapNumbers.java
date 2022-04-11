import java.util.Scanner;

public class SwapNumbers {
    int num1,num2;
    SwapNumbers(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public void withTemp() {
        int temp = this.num1;
        this.num1 = this.num2;
        this.num2 = temp;
        System.out.println("Swapped numbers with third variable are: "+this.num1+" "+this.num2);
    }
    public void withoutTemp() {
        this.num1 = this.num1-this.num2;
        this.num2 = this.num1+this.num2;
        this.num1 = this.num2-this.num1;
        System.out.println("Swapped numbers without third variable are: "+this.num1+" "+this.num2);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1 = scan.nextInt();
        System.out.println("Enter number 2:");
        int num2 = scan.nextInt();
        SwapNumbers obj = new SwapNumbers(num1,num2);
        obj.withTemp();
        obj.withoutTemp();
        scan.close();
    }
}
