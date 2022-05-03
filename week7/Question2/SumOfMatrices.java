package week7.Question2;

/**
 * SumOfMatrices
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 * @question
 * Write a java program to find the sum of two matrices.
 * 
 * @description
 * The class `SumOfMatrices` has a main method which initializes
 * two array with pre-defined values, add the elements on same index
 * and store the sum in output array. The output array is printed in
 * the main method.
 * 
 */
public class SumOfMatrices {
    /**
     * main
     * 
     * @param args
     */
    public static void main(String[] args) {
        int[][] array1 = new int[][]{
                                     {4,5,6},
                                     {7,8,9},
                                     {2,3,4}
                                    };
        int[][] array2 = new int[][]{
                                     {10,11,12},
                                     {13,14,15},
                                     {16,17,18}
                                    };
        int[][] output = new int[3][3];
        
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                output[i][j] = array1[i][j] + array2[i][j];
            }
        }

        System.out.println("The sum of two matrices:");
        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output[i].length; j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}