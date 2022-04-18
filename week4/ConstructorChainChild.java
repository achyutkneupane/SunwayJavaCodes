public class ConstructorChainChild extends ConstructorChain {
    ConstructorChainChild(int someVariable) {
        super(someVariable);
        System.out.println("Called from single parameter constructor in child class");
    }
    public static void main(String[] args) {
        ConstructorChainChild obj = new ConstructorChainChild(100);
        System.out.println("The value of someVariable is: " + obj.someVariable);
    }
}
