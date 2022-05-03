package week7.Question5;

import java.io.File;
import java.io.FileWriter;

/**
 * WriteToFile
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 * @question
 * Write a java program to create a file named “file1.txt” and
 * write “I am learning file handling in java.” five times
 * using while loop.
 * 
 * @description
 * This class `WriteToFile` is used to write to a file. The
 * class contains a main method which is used to write to a file.
 * FileWriter is used to write to a file. The file is created
 * if it does not exist and loop is used to write the given
 * string to the file 5 times.
 */
public class WriteToFile {
    public static void main(String[] args) {
        File file = new File("week7/Question5/file1.txt");
        String content = "I am learning file handling in java.";
        try {
            FileWriter fw = new FileWriter(file);
            for(int i=0;i<5;i++) {
                fw.write(content+"\n");
            }
            fw.close();
        } catch (Exception e) {
            System.out.println("Error while writing to file");
        }
    }
}