/**
 * StringLength
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