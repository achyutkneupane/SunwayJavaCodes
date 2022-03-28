import java.util.Scanner;

/**
 * MaximumAndMinimum
 */
public class MaximumAndMinimum {
    int num1,num2,num3;

    MaximumAndMinimum(int num1,int num2,int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public int maximumNumber() {
        // if num1 is greater than num2
        if(this.num1 >= this.num2) {
            if(this.num1 >= this.num3)
                // if num1 is greater than num2 and num3, return num1
                return this.num1;
            else
                // if num1 is greater than num2, but num3 is greater than num1, return num3
                return this.num3;
        }
        // if num2 is greater than num1
        else {
            if(this.num2 >= this.num3)
                // if num2 is greater than num1 and num3, return num2
                return this.num2;
            else
                // if num2 is greater than num1, but num3 is greater than num2, return num3
                return this.num3;
        }
    }

    public int minimumNumber() {
        // if num1 is less than num2
        if(this.num1 < this.num2) {
            if(this.num1 < this.num3)
                // if num1 is less than num2 and num3, return num1
                return this.num1;
            else
                // if num1 is less than num2, but num3 is lesser than num1, return num3
                return this.num3;
        }
        // if num2 is greater than num1
        else {
            if(this.num2 < this.num3)
                // if num2 is less than num1 and num3, return num2
                return this.num2;
            else
                // if num2 is less than num1, but num3 is lesser than num2, return num3
                return this.num3;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        MaximumAndMinimum mnm = new MaximumAndMinimum(num1,num2,num3);
        System.out.println("The maximum number among three is: " + mnm.maximumNumber());
        System.out.println("The minimum number among three is: " + mnm.minimumNumber());
        scan.close();
    }

}