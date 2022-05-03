package week7.Question9;

import java.io.File;
import java.util.Scanner;

/**
 * MultiplyByFive
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 * @question
 * Read the file matrix.txt and multiply each element of the matrix with 5. Print the output.
 * 
 * @description
 * This class `MultiplyByFive` is used to multiply each element of the matrix with 5.
 * The class contains a main method which reads the matrix from the file and prints
 * the output. Scanner is used to read the matrix from the file.
 */
public class MultiplyByFive {
    public static void main(String[] args) {
        try {
            File file = new File("week7/Question8/matrix.txt");
            Scanner fr = new Scanner(file);
            int[][] matrix = new int[3][3];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = fr.nextInt();
                    System.out.print(matrix[i][j] * 5 + " ");
                }
                System.out.println();
            }
            
            while(fr.hasNext()) {
                if(fr.hasNextInt()) {
                    System.out.print(fr.nextInt() * 5+" ");
                } else {
                    System.out.print(fr.next()+" ");
                }
            }
            System.out.println();
            fr.close();
        } catch (Exception e) {
            System.out.println("Error while reading from file");
        }
    }
}