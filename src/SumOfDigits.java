public class SumOfDigits {
    public static void main(String[] args) {
        int num = 143;
        int sum = 0;
        for(int i = num; num !=0; num=num/10){
            sum = sum + num % 10;
        }
        System.out.println("sum of digts "+ sum);
    }
}
