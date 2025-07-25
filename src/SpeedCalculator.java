public class SpeedCalculator {
    public static void main(String[] args) {
        float distanceMeters = 2500f;  // Hardcoded distance
        int hours = 5;
        int minutes = 56;
        int seconds = 23;

        // Total time in seconds
        int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;

        // Speed calculations
        float metersPerSecond = distanceMeters / totalSeconds;
        float kmPerHour = (distanceMeters / 1000.0f) / (totalSeconds / 3600.0f);
        float milesPerHour = (distanceMeters / 1609.0f) / (totalSeconds / 3600.0f);

        // Display results
        System.out.printf("Your speed in meters/second is %.8f%n", metersPerSecond);
        System.out.printf("Your speed in km/h is %.8f%n", kmPerHour);
        System.out.printf("Your speed in miles/h is %.8f%n", milesPerHour);
    }
}
