package Udemy;

public class Main {

    public static void main(String[] args) {
//    long convertedMiles = toMilesPerHour(3);
//        System.out.println(convertedMiles);

    }


    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0)
            return -1;
        else if (kilometersPerHour == 0) {
            return 0;
        } else {
            return (long) (kilometersPerHour * 1.60934);
        }


    }
}
