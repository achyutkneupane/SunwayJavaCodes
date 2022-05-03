package week7.Question7;

import java.io.File;

/**
 * DeleteFile
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 * @question
 * Write a java program to delete the file “file1.txt”.
 * 
 * @description
 * This class `DeleteFile` is used to delete a file. The class contains a main
 * method which deletes the file. File class is used to locate the file and
 * delete it.
 */
public class DeleteFile {
    public static void main(String[] args) {
        try {
            File file = new File("week7/Question5/file1.txt");
            file.delete();
        } catch(Exception e) {
            System.out.println("Error while deleting file");
        }
    }
}