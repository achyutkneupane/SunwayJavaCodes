/**
 * StringLength
<<<<<<< HEAD
=======
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 * @question
 * Write a program to find the length of the
 * string "refrigerator"
 * 
 * @description
 * This class 'StringLength' is used to find the length
 * of the given string. It has a main method in which
 * the length of the string 'refrigerator' is printed.
 * It creates a new empty string and then adds the
 * characters to the string using loop until the original
 * string is same as the new string.
 * 
>>>>>>> week4
 */
public class StringLength {
    public static void main(String[] args) {
        String str = "refrigerator";
        int i = 0;
        String newString = "";
        while(!newString.equals(str)) {
            newString += str.charAt(i);
            i++;
        }
        System.out.println("Length of the string is: "+i);

    }
}