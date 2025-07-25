public class FiniteCheck {
    public static void main(String[] args) {
        double value1 = 10.5;
        double value2 = Double.POSITIVE_INFINITY;

        // Check using Double.isFinite() (Java 8+)
        System.out.println("Is " + value1 + " finite? " + Double.isFinite(value1));
        System.out.println("Is " + value2 + " finite? " + Double.isFinite(value2));
    }
}
