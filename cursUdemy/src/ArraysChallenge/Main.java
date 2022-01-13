package ArraysChallenge;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(findMin(readElements(readInteger())));
    }

    public static int readInteger(){
        System.out.println("Enter number of elements!");
        int integer = scanner.nextInt();
        return integer;
    }

    public static int[] readElements(int integer){
        int[] elements = new int[integer];
        for(int i = 0; i < integer; i++){
            System.out.println("Add an element to the array!");
            elements[i] = scanner.nextInt();
        }

        return elements;
    }

    public static int findMin(int[] array){
        int min = 0;
        for(int i = 0; i < array.length-1; i++){
            min = array[i];
            if(array[i+1] < min){
                min = array[i+1];
            }
        }
        return min;
    }
}
