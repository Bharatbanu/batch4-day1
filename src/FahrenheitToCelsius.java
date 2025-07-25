public class FahrenheitToCelsius {

    public static void main(String[] args) {
        double fahrenheit = 212.0;


        // Conversion formula
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Output result
        System.out.printf("%.1f degree Fahrenheit is equal to %.1f in Celsius%n", fahrenheit, celsius);
    }
}
