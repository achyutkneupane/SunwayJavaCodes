import java.util.Scanner;

public class SumAndProduct {
    int num1,num2;
    SumAndProduct() {
        this.num1 = 0;
        this.num2 = 0;
    }
    SumAndProduct(int num1,int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int productOfNumbers() {
        return this.num1*this.num2;
    }

    public int sumOfNumbers() {
        return this.num1+this.num2;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        SumAndProduct sap = new SumAndProduct(num1,num2);
        System.out.println("The product of two numbers are: "+sap.productOfNumbers());
        System.out.println("The sum of two numbers are: "+sap.sumOfNumbers());
        scan.close();
    }
}
