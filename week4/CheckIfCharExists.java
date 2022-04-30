<<<<<<< HEAD
=======
/**
 * CheckIfCharExists
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 * @question
 * Write a program to check if the letter 'e'
 * is present in the word 'Umbrella'.
 * 
 * @description
 * This class 'CheckIfCharExists' is used to check
 * if the letter 'e' is present in the word 'Umbrella'.
 * It has a main method in which the boolean value is
 * taken and checked if it is true or false. This method
 * checks the letter availability in the word by using
 * the loop and creating a new string with the characters
 * of the word.
 * 
 */
>>>>>>> week4
public class CheckIfCharExists {
    public static void main(String[] args) {
        String str = "Umbrella";
        char charToCheck = 'e';
        int i = 0;
        boolean found = false;
        String newString = "";
        while(!newString.equals(str)) {
            char ch = str.charAt(i);
            if(ch == charToCheck) {
                found = true;
                break;
            }
            newString += ch;
            i++;
        }
        if(found) {
            System.out.println("Character '"+charToCheck+"' exists in the string");
        } else {
            System.out.println("Character '"+charToCheck+"' does not exist in the string");
        }
    }
}
