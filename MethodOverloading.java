public class MethodOverloading {
    // For Circle
    public static double area(float radius) {
        return Math.PI*Math.pow(radius, 2);
    }

    // For Rectangle
    public static double area(double length,double breadth) {
        return length*breadth;
    }

    // For Square
    public static double area(double side) {
        return Math.pow(side,2);
    }

    public static void main(String[] args) {
        // For rectangle
        double length = 5;
        double breadth = 3;
        double rectArea = MethodOverloading.area(length,breadth);
        System.out.println("Area of rectangle with length " + length + " and breadth " + breadth + " is: " + rectArea);

        // For square
        double side = 5;
        double sqArea = MethodOverloading.area(side);
        System.out.println("Area of square with side length " + side + " is: " + sqArea);

        // For circle
        float radius = 3;
        double circArea = MethodOverloading.area(radius);
        System.out.println("Area of circle with radius " + radius + " is: " + circArea);
    }
    

}
