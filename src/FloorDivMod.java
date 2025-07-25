public class FloorDivMod {
    public static void main(String[] args) {
        int dividend = -17;
        int divisor = 4;

        // Floor division and floor modulus
        int floorDiv = Math.floorDiv(dividend, divisor);
        int floorMod = Math.floorMod(dividend, divisor);

        System.out.println("Dividend: " + dividend);
        System.out.println("Divisor: " + divisor);
        System.out.println("Floor Division: " + floorDiv);
        System.out.println("Floor Modulus: " + floorMod);
    }
}

