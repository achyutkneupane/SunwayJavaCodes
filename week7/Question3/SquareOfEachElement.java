package week7.Question3;

/**
 * SquareOfEachElement
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 * @question
 * Write a java program to print the squares of each element of a 2D array
 * 
 * @description
 * The class `SquareOfEachElement` has two methods `returnSquare` and a main method.
 * The method `returnSquare` takes an integer and returns the square of the integer.
 * The main method initializes a 2D array of size 2*2 with pre-defined values,
 * calls the method `returnSquare` to square each element of the array and
 * prints the result.
 * 
 */
public class SquareOfEachElement {
    /**
     * returnSquare
     * 
     * @param int
     * @return int
     */
    public static int returnSquare(int num) {
        return num * num;
    }
    public static void main(String[] args) {
        int[][] array2D = new int[][]{
                                      {7,9},
                                      {4,5}
                                     };
        int[][] output = new int[2][2];
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                output[i][j] = returnSquare(array2D[i][j]);
            }
        }
        System.out.println("The square of each element of the array:");
        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output[i].length; j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }
}