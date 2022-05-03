package week7.Question1;
/**
 * 
 * SumOfElements
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 * @question
 * Write a java program to find the sum of all the elements of
 * a 2D array of size 3*3.
 * 
 * @description
 * The class `SumOfElements` has a main method which generates
 * a 2D array of size 3*3 and prints the sum of all the elements
 * of the array.
 * 
 */


public class SumOfElements {
    /**
     * main
     * 
     * @param args
     */
    public static void main(String[] args) {
        int[][] array2D = new int[3][3];
        int sum = 0;
        System.out.println("Elements of randomly generated 2D Array:");
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                array2D[i][j] = (int) (Math.random() * 10);
                System.out.print(array2D[i][j] + " ");
                sum += array2D[i][j];
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Sum of elements in the array is: " + sum);
    }
}
