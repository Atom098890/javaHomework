package math;

public class MathOperations {
    public static void main(String [] args){
        System.out.println("Result of add: " + add(7, 5));
        System.out.println("Result of substract: " + substract(7, 5));
        System.out.println("Result of multiply: " + multiply(7, 5));
        System.out.println("Result of divide: " + divide(7, 5));

        System.out.println("Result of findMax: " + findMax(15, 5));
        System.out.println("Result of difference: " + difference(13, 8));

        System.out.println("Result of squareArea: " + squareArea(8));
        System.out.println("Result of squarePerimeter: " + squarePerimeter(8));

        System.out.println("Result of convertSecondsToMinutes: " + convertSecondsToMinutes(120));
        System.out.println("Result of averageSpeed: " + averageSpeed(12.0, 60.0));

        System.out.println("Result of findHypotenuse: " + findHypotenuse(12.0, 6.0));
        System.out.println("Result of circleCircumference: " + circleCircumference(8.0));

        System.out.println("Result of calculatePercentage: " + calculatePercentage(10, 5));
        System.out.println("Result of celsiusToFahrenheit: " + celsiusToFahrenheit(12.0));
        System.out.println("Result of fahrenheitToCelsius: " + fahrenheitToCelsius(102.0));
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static int substract(int a, int b){
        return a - b;
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static double divide(int a, int b){
        return (double) a / b;
    }

    public static int findMax(int a, int b){
        return Math.max(a, b);
    }

    public static int difference(int a, int b){
        return Math.abs(a - b);
    }

    public static int squareArea(int side){
        return side * side;
    }

    public static int squarePerimeter(int side){
        return 4 * side;
    }

    public static double convertSecondsToMinutes(int seconds) {
        return seconds / 60.0;
    }

    public static double averageSpeed(double distance, double time) {
        return distance / time;
    }

    public static double findHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculatePercentage(double total, double part) {
        return (part / total) * 100.0;
    }

    public static double celsiusToFahrenheit(double c) {
        return c * 9.0 / 5.0 + 32.0;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32.0) * 5.0 / 9.0;
    }
}
