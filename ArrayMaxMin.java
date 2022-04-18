import java.util.Scanner;

public class ArrayMaxMin {
    public static void main(String[] args) {
        int inputArray[] = new int[10];
        int i=0;
        Scanner scan = new Scanner(System.in);
        while(i<10) {
            System.out.println("Enter number "+(i+1)+": ");
            int number = scan.nextInt();
            inputArray[i++] = number;
        }
        scan.close();
        System.out.println("The elements of array are: ");
        int max = inputArray[0];
        int min = inputArray[0];
        for(int elem: inputArray) {
            System.out.print(elem+" ");
            if(elem>max) {
                max = elem;
            }
            if(elem<min) {
                min = elem;
            }
        }
        System.out.println();
        System.out.println("The maximum element is: "+max);
        System.out.println("The minimum element is: "+min);
    }
}
