public class DigitBreaker {
    public static void main(String[] args) {
        int number = 123456;  // Hardcoded input

        // Convert number to string and print each character (digit)
        String numStr = Integer.toString(number);

        for (int i = 0; i < numStr.length(); i++) {
            System.out.print(numStr.charAt(i) + " ");
        }
    }
}

