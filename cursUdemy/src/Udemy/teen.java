package Udemy;

public class teen {
    public static boolean hasTeen(int one, int two, int three){
       if (one >= 13 && one <= 19){
           return true;
       } else if (two >= 13 && two <= 19){
           return true;
       } else if (three >= 13 && three <= 19){
           return true;
       } else {
           return false;
       }

    }
}
