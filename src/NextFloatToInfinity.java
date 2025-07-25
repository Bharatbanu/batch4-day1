public class NextFloatToInfinity {
    public static void main(String[] args) {
        double number = 123.45;

        // Next float towards positive infinity
        double nextUp = Math.nextUp(number);

        // Next float towards negative infinity
        double nextDown = Math.nextDown(number);

        System.out.println("Original number: " + number);
        System.out.println("Next up (towards +∞): " + nextUp);
        System.out.println("Next down (towards -∞): " + nextDown);
    }
}

