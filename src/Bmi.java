public class Bmi {
    public static void main(String[] args) {
        float height = 5.8f;
        float weight = 87.6f;
        height = height * 0.3048f;

        System.out.println("bmi is " + (weight/(height* height)));
    }
}
