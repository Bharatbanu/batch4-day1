public class CurrentTimeGMT {
        public static void main(String[] args) {
            int offset = 256;  // Hardcoded offset to GMT (can be negative/positive)

            // Get current time in milliseconds
            long totalMilliseconds = System.currentTimeMillis();

            // Convert to seconds
            long totalSeconds = totalMilliseconds / 1000;
            long currentSecond = totalSeconds % 60;

            // Convert to minutes
            long totalMinutes = totalSeconds / 60;
            long currentMinute = totalMinutes % 60;

            // Convert to hours
            long totalHours = totalMinutes / 60;
            long currentHour = (totalHours + offset) % 24;

            // Display time
            System.out.printf("Current time is %02d:%02d:%02d GMT+%d%n", currentHour, currentMinute, currentSecond, offset);
        }
    }




