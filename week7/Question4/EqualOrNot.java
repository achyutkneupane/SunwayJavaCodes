package week7.Question4;

import java.util.Scanner;

/**
 * EqualOrNot
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 * @question
 * Write a Program to accept two matrices and check whether they are equal or Not.
 * Two matrices are said to be equal if both the matrices contain the same entries
 * and both the matrices are of same shape.
 * 
 * @description
 * The class `EqualOrNot` is used to check whether two matrices are equal or not.
 * The class contains a method `getRowsColumns` which is used to get the number
 * of rows and columns of the matrix. There is a main method which is used to
 * call the method `getRowsColumns` and then compare the matrices. It writes
 * the result in the console.
 * 
 */
public class EqualOrNot {

    int row1, col1, row2, col2;

    static Scanner scan = new Scanner(System.in);

    public void getRowsColumns() {
        System.out.println("Enter the number of rows in the first matrix:");
        this.row1 = scan.nextInt();
        System.out.println("Enter the number of columns in the first matrix:");
        this.col1 = scan.nextInt();
        System.out.println("Enter the number of rows in the second matrix:");
        this.row2 = scan.nextInt();
        System.out.println("Enter the number of columns in the second matrix:");
        this.col2 = scan.nextInt();
    }

    /**
     * main
     * 
     * @param args
     */
    public static void main(String[] args) {
        EqualOrNot sample = new EqualOrNot();
        sample.getRowsColumns();
        int[][] array1 = new int[sample.row1][sample.col1];
        int[][] array2 = new int[sample.row2][sample.col2];

        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = scan.nextInt();
            }
        }

        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = scan.nextInt();
            }
        }

        boolean isEqual = true;
        if (array1.length != array2.length || array1[0].length != array2[0].length) {
            isEqual = false;
        } else {
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array1[i].length; j++) {
                    if (array1[i][j] != array2[i][j]) {
                        isEqual = false;
                    }
                }
            }
        }

        if (isEqual) {
            System.out.println("The matrices are equal.");
        } else {
            System.out.println("The matrices are not equal.");
        }
    }
}