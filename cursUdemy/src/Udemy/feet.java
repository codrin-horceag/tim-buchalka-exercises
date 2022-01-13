package Udemy;

import java.util.Scanner;

public class feet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert values to be converted: ");
        double feet = scan.nextDouble();
        double inches = scan.nextDouble();

//        System.out.println(calcFeetAndInchesToCentimeters(feet, inches));

        System.out.println(calcFeetAndInchesToCentimeters(250));
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if((feet <= 0) || ((inches <= 0) && (inches >= 12))){
            System.out.println("Invalid parameters");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){

        if(inches <= 0) {
            System.out.println("Invalid parameter");
            return -1;
        }

        double feet = (int) inches / 12;
        double remInches = (int) inches % 12;

        System.out.println(feet + " feet, " + remInches + " inches");

        return calcFeetAndInchesToCentimeters(feet, remInches);
    }
}
