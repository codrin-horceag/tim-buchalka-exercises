package Udemy;

public class area {

    public static void main(String[] args) {
        System.out.println(area(50));
    }

    public static double area(double radius){
        if (radius < 0)
            return -1;

        return Math.PI * radius * radius;
    }

    public static double area (double x, double y){
        if(x < 0 || y < 0) {
            return -1;
        }

        return x * y;
    }

}
