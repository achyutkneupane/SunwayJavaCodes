public class RandomAnother {
    public static void main(String[] args) {
        RandomMain objectName = new RandomMain();
        objectName.randomNumber();
        objectName.printHello();
        int d = objectName.returnDouble();
        int newNumber = d-2;
        System.out.println("Double:"+newNumber);
    }
}
