package Udemy;

public class Duration {

    public static void main(String[] args) {
        System.out.println(getDurationString(80,54));
        System.out.println(getDurationString(381));
    }

    public static String getDurationString (long minutes, long seconds){
        if ((minutes <0) || ((seconds <0 ) || (seconds > 59))){
            return "Invalid value";
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "min " + seconds + "s ";

    }

    public static String getDurationString (long seconds){
        if (seconds <=0){
            return "Invalid value";
        }

        long minutes = seconds / 60;
        long remSeconds = seconds % 60;

        return getDurationString(minutes, remSeconds);
    }
}
