class Rectangle {

    /** 
     * Author: Achyut Neupane <to@achyut.com.np>
     * 
     * This is the Rectangle class which is used
     * as an example of constructor overloading
    */

    int length,breadth;

    // Constructor with no parameters
    Rectangle() {
        // Both length and breadth are assigned zero
        this.length = 0;
        this.breadth = 0;
    }

    // Constructor with both parameters assigned accordingly
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Construtor with one parameter
    Rectangle(int length) {
        // Assigns parameter to both length and breadth
        this.length = length;
        this.breadth = length;
    }

    // Method to calculate and write the area of rectangle
    public void calcArea() {
        System.out.println("Area of rectangle is " + this.length * this.breadth);
    }

    public static void main(String[] args) {

        // Object of class Rectangle is created with no argument
        Rectangle rect1 = new Rectangle();
        rect1.calcArea();

        // Object of class Rectangle is created with one argument
        Rectangle rect2 = new Rectangle(10);
        rect2.calcArea();

        // Object of class Rectangle is created with both argument
        Rectangle rect3 = new Rectangle(20,30);
        rect3.calcArea();
    }
}