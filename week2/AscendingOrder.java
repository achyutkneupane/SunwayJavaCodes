public class AscendingOrder {
    public int[] inAscendingOrder(int num1,int num2, int num3) {
        int[] arr;
        arr = new int[3];
        MaximumAndMinimum mnm = new MaximumAndMinimum(num1, num2, num3);
        arr[0] = mnm.minimumNumber();
        arr[2] = mnm.maximumNumber();
        if(num1 != arr[0] && num1 != arr[2]) {
            arr[1] = num1;
        } else if(num2 != arr[0] && num2 != arr[2]) {
            arr[1] = num2;
        } else {
            arr[1] = num3;
        }
        return arr;

    }
    public static void main(String[] args) {
        int x = 15;
        int y = 2;
        int z = 8;
        AscendingOrder ao = new AscendingOrder();
        int[] inOrder = ao.inAscendingOrder(x,y,z);
        System.out.println("The numbers in ascending order are: "+inOrder[0]+", "+inOrder[1]+", "+inOrder[2]);
    }
}
