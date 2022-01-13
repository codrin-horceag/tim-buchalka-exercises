package Udemy;

public class EqualityPrinter {
    public static void main(String[] args) {
//        printEqual(1, 2, -1);
        System.out.println(isCatPlaying(false, 46));
    }

    public static void printEqual(int one, int two, int three){
        if((one < 0) || (two < 0) || (three < 0)){
            System.out.println("Invalid value!");
        } else if ((one == two) && (one == three) && (two == three)){
            System.out.println("All numbers are equal");
        } else if ((one != two) && (one != three) && (two != three)){
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
    public static boolean isCatPlaying(boolean summer, int temperature){
        if(summer == true){
            if (temperature < 25 || temperature > 45){
                return false;
            } else {
                return true;
            }
        } else if (temperature < 25 || temperature > 35){
            return false;
        } else {
            return true;
        }
    }
}
