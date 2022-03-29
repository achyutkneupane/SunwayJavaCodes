public class AscendingOrder {

    /**
     * 
     * AscendingOrder
     * 
     * @author Achyut Neupane <to@achyut.com.np>
     * 
     * Q. Declare and initialize three integer variables x, y and z
     * as 15, 2 and 8. Arrange the variables in ascending order.
     * 
     * This code has the class `AscendingOrder` which has a method
     * `inAscendingOrder()` which prints the three variables in
     * ascending order.
     */

    public int[] inAscendingOrder(int num1,int num2, int num3) {
        int[] arr;
        arr = new int[3];
        // Object `mnm` of class `MaximumAndMinimum` is created
        MaximumAndMinimum mnm = new MaximumAndMinimum(num1, num2, num3);
        // first index of the array is set to the maximum number
        arr[0] = mnm.minimumNumber();
        // third index of the array is set to the minimum number
        arr[2] = mnm.maximumNumber();
        // second index of the array is set to the number which is not the maximum or minimum
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
        int x = 1500;
        int y = 20;
        int z = 8;
        AscendingOrder ao = new AscendingOrder();
        int[] inOrder = ao.inAscendingOrder(x,y,z);
        System.out.println("The numbers in ascending order are: "+inOrder[0]+", "+inOrder[1]+", "+inOrder[2]);
    }
}
