public class RandomMain {
    private int valueX=10;
    public void randomNumber() {
        System.out.println(Math.random());
    }
    public void printHello() {
        System.out.println("Hello");
    }
    public int returnDouble() {
        // this.valueX = 5;
        getValueX();
        return 5;
    }
    private int getValueX() {
        return this.valueX;
    }
}
