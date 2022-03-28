public class TwoMethodsSameName {
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
