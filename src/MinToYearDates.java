public class MinToYearDates {
    public static void main(String[] args) {
        int mins = 3456789;
        int hours = (mins/60);
        int days  = (hours/24);
        int year = (days / 365);
        int oneYear = 365;
        days = days% oneYear;
        System.out.print("years is " + year );
        System.out.print("  days is " + days);
    }
}
