public class CompareSignedUnsigned {
    public static void main(String[] args) {
        int a = -10;
        int b = 20;

        // Signed comparison
        System.out.println("Signed comparison:");
        System.out.println("a < b: " + (a < b));
        System.out.println("a > b: " + (a > b));

        // Unsigned comparison
        System.out.println("\nUnsigned comparison:");
        System.out.println("Unsigned a: " + Integer.toUnsignedLong(a));
        System.out.println("Unsigned b: " + Integer.toUnsignedLong(b));
        System.out.println("a < b: " + (Integer.compareUnsigned(a, b) < 0));
        System.out.println("a > b: " + (Integer.compareUnsigned(a, b) > 0));
    }
}

