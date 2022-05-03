package week7.Question8;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * MatrixToFile
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 * @question
 * Write a java program to take integer number from the users and
 * create a 3*3 matrix. Write the matrix as well as the sum of all
 * the elements of the matrix on to the file “matrix.txt”.
 * 
 * @description
 * This class `MatrixToFile` is used to write to a file. The class
 * has a method `getMatrix()` which is used to get the matrix from
 * the user and sum state the matrix and return the matrix array.
 * The main method is used to write the matrix to the file after
 * getting the matrix from the user from method `getMatrix()`.
 * 
 */
public class MatrixToFile {
    int sum;
    public int[][] getMatrix() {
        int[][] matrix = new int[3][3];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scan.nextInt();
                this.sum += matrix[i][j];
            }
        }
        scan.close();
        return matrix;
    }
    public static void main(String[] args) {
        MatrixToFile sample = new MatrixToFile();
        int[][] matrix = sample.getMatrix();
        try {
            File file = new File("week7/Question8/matrix.txt");
            FileWriter fw = new FileWriter(file);
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    fw.write(matrix[i][j] + " ");
                }
                fw.write("\n");
            }
            fw.write("Sum of all elements: " + sample.sum+"\n");
            fw.close();
        } catch (Exception e) {
            System.out.println("Error while writing to file");
        }

    }
}