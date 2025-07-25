public class CalculateBMI {
    public static void main(String[] args) {
        double weightInPounds = 452;  // Hardcoded weight
        double heightInInches = 72;   // Hardcoded height

        // Convert to metric units
        double weightInKg = weightInPounds * 0.45359237;
        double heightInMeters = heightInInches * 0.0254;

        // Calculate BMI
        double bmi = weightInKg / (heightInMeters * heightInMeters);

        // Display result
        System.out.println("Body Mass Index is " + bmi);
    }
}
