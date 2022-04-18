public class ThisAndThis {
    int someVariable;
    ThisAndThis(int someVariable) {
        // this() method calls the default constructor
        this();
        // assigning value of someVariable parameter to someVariable attribute
        this.someVariable = someVariable;
        System.out.println("Called from single parameter constructor");
    }
    ThisAndThis() {
        System.out.println("Called from default constructor");
    }
    public static void main(String[] args) {
        ThisAndThis obj = new ThisAndThis(10);
        System.out.println("The value of someVariable is: " + obj.someVariable);
    }
}
