class StaticMethodClass {
    static String staticVariable = "This is static String";
    public static void staticMethod() {
      System.out.println("Before: ");
      System.out.println(StaticMethodClass.staticVariable);
      
      StaticMethodClass.staticVariable = "After changing";
      
      System.out.println("After: ");
      System.out.println(StaticMethodClass.staticVariable);
    }
    public static void main(String[] args) {
      StaticMethodClass.staticMethod();
    }
}