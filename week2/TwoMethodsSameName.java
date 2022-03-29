public class TwoMethodsSameName {

    /**
     * @author Achyut Neupane <to@achyut.com.np>
     * 
     * Q. Create a class to print an integer and a character with two
     * methods having the same name but different sequence of the integer
     * and the character parameters.For example, if the parameters of the
     * first method are of the form (int n, char c), then that of the second
     * method will be of the form (char c, int n).
     * 
     * 
     * This code has the class `TwoMethodsSameName` which has two methods
     * under same name `tmsnMethod()` which prints the integer and the
     * character in the order of the parameters.
     * 
     */

    public void tmsnMethod(int n,char c) {
        System.out.println("Called with integer "+n+" first and then character "+c);
    }
    public void tmsnMethod(char c,int n) {
        System.out.println("Called with character "+c+" first and then integer "+n);
    }
    public static void main(String[] args) {
        TwoMethodsSameName tmsn = new TwoMethodsSameName();
        tmsn.tmsnMethod('A', 4);
        tmsn.tmsnMethod(7, 'X');
    }
}
