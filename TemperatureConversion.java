public class TemperatureConversion {

    /** 
     * Author: Achyut Neupane <to@achyut.com.np>
     * 
     * This is the TemperatureConversion class
     * which was written for question assigned
     * as class task.
     * This program converts celcius to fahrenheit and vice-versa
    */

    double celcius,fahrenheit;

    TemperatureConversion() {
        this.celcius = 0;
        this.fahrenheit = 0;
    }

    public double celciusToFahrenheit(double celcius) {
        return (celcius * (9 / 5d)) + 32;
    }

    public double fahrenheitToCelcius(double fahrenheit) {
        return ((fahrenheit - 32) * (5d / 9));
    }
    public static void main(String[] args) {
        TemperatureConversion tempConv = new TemperatureConversion();

        double celcToConvert = 37.6;
        double farhAfterConvert = tempConv.celciusToFahrenheit(celcToConvert);
        System.out.println(celcToConvert + " Celcius in Fahrenheit is " + farhAfterConvert);

        double farhToConvert = 101;
        double celcAfterConvert = tempConv.fahrenheitToCelcius(farhToConvert);
        System.out.println(farhToConvert + " Fahrenheit in Celcius is " + celcAfterConvert);
    }
}
