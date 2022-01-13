package ReverseArrayChallenge;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    public static void reverse(int[] array){
        int temp;
        int maxIndex = array.length - 1;
        int halfArray = array.length / 2;
        for(int i = 0; i < halfArray; i++){
            temp = array[i];
            array[i] = array[maxIndex];
            array[maxIndex] = temp;
            maxIndex--;
        }
    }
}
