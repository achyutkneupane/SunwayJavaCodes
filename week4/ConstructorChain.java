public class ConstructorChain {
    int someVariable;
    ConstructorChain(int someVariable) {
        this();
        this.someVariable = someVariable;
        System.out.println("Called from single parameter constructor");
    }
    ConstructorChain() {
        System.out.println("Called from default constructor");
    }
    public static void main(String[] args) {
        ConstructorChain obj = new ConstructorChain(10);
        System.out.println("The value of someVariable is: " + obj.someVariable);
    }
}
