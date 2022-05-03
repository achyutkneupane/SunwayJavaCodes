package week7.Question6;

import java.io.File;
import java.io.FileReader;

/**
 * ReadFromFile
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 * @question
 * Write a java program to read the contents of file “file1.txt” and print them.
 * 
 * @description
 * This class `ReadFromFile` is used to read from a file. The class contains a
 * main method which is used to read from a file. FileReader is used to read
 * from a file. The program reads the file character by character and prints
 * the contents of the console.
 * 
 */
public class ReadFromFile {

    public static void main(String[] args) {
        try {
            File file = new File("week7/Question5/file1.txt");
            FileReader fr = new FileReader(file);
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
            fr.close();
        } catch (Exception e) {
            System.out.println("Error while reading from file");
        }
    }
}