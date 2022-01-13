package Udemy;
import java.util.Stack;
public class FirstAndLastDigit {
    public static void main(String[] args) {
//        System.out.println(firstAndLastDigitSum(-5));
//        System.out.println(getEvenDigitSum(123456));
//        System.out.println(hasSharedDigit(12, 23));
//        System.out.println(hasSameLastDigit(12, 32, 43));
//        System.out.println(greatestCommonDivisor(81, 153));
//        printFactors(12);
//        System.out.println();
//        System.out.println(perfectNumberChecker(5));
//        System.out.println(reverse(1234));
          numberToWords(10100);
//        System.out.println(canPack(9,1,5));
    }

    public static int firstAndLastDigitSum(int value){
        if (value < 0)
            return -1;

        int sum;
        int firstDigit = 0;
        int lastDigit;
        if(value < 0)
            return -1;
        else {
            lastDigit = value % 10;
            System.out.println("Last digit is " + lastDigit);
            while (value > 0){
                firstDigit = value % 10;
                value /= 10;
            }
            System.out.println("First digit is " + firstDigit);
        }
        sum = firstDigit + lastDigit;
        return sum;
    }
    public static int getEvenDigitSum(int value){
        if(value < 0)
            return -1;
        int sum = 0;
        while(value > 0){
            int digit = value % 10;
            value /= 10;
            if(digit % 2 == 0){
                sum += digit;
            }
        }
        return sum;
    }
    public static boolean hasSharedDigit(int one, int two){
        if((one < 10 || one > 99) || (two < 10 || two > 99))
            return false;
        int oneFirst = 0;
        int oneLast = one % 10;
        while(one > 0){
            oneFirst = one % 10;
            one /= 10;
        }
        int twoFirst = 0;
        int twoLast = two % 10;
        while(two > 0){
            twoFirst = two % 10;
            two /= 10;
        }

        return (oneFirst == twoFirst) || (oneFirst == twoLast) || (twoFirst == oneLast);
    }
    public static boolean hasSameLastDigit(int one, int two, int three){
        if ((isValid(one) == false) || (isValid(two) == false) || isValid(three) == false) {
            return false;
        }

        int oneLast = one % 10;
        int twoLast = two % 10;
        int threeLast = three % 10;

        if((oneLast == twoLast) || (oneLast == threeLast) || (twoLast == threeLast))
            return true;
        else {
            return false;
        }
    }
    public static boolean isValid(int number){
        if(number >= 10 && number <= 1000){
            return true;
        } else {
            return false;
        }
    }
    public static int greatestCommonDivisor(int one, int two){
        if ((one < 10) || (two < 10))
            return -1;
        int firstDivisor = 0;
        int secondDivisor = 0;
        for (int i = 1; i < one; i++){
            if (one % i == 0){
                firstDivisor = i;
            }
        }
        for (int j = 1; j < two; j++){
            if (two % j == 0){
                secondDivisor = j;
            }
        }
        int greatestCommonDivisor = 0;
        if(one < two){
           greatestCommonDivisor = firstDivisor;
        } else if (two < one){
            greatestCommonDivisor = secondDivisor;
        }
        return greatestCommonDivisor;
    }
    public static void printFactors(int number){
        if(number < 1)
            System.out.println("Invalid value");

        for(int i = 1; i < number; i++){
            if(number % i == 0)
                System.out.print(i + " ");
        }
    }
    public static boolean perfectNumberChecker(int number){
        if(number < 1)
            return false;
        int perfectNumber = 0;
        for(int i = 1; i < number; i++){
            if(number % i == 0){
                perfectNumber += i;
            }
        }
        if(perfectNumber == number)
            return true;
        else return false;
    }
    public static void numberToWords(int number){
        if (number < 1)
            System.out.println("Invalid number");
        Stack<String> s = new Stack<String>();
        while(number != 0){
            int lastDigit = number % 10;

            switch(lastDigit){
                case 0:
                    s.push("Zero");
                    break;
                case 1:
                    s.push("One");
                    break;
                case 2:
                    s.push("Two");
                    break;
                case 3:
                    s.push("Three");
                    break;
                case 4:
                    s.push("Four");
                    break;
                case 5:
                    s.push("Five");
                    break;
                case 6:
                    s.push("Six");
                    break;
                case 7:
                    s.push("Seven");
                    break;
                case 8:
                    s.push("Eight");
                    break;
                case 9:
                    s.push("Nine");
                    break;
            }
            number /= 10;
        }

        while(!s.empty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
    public static int reverse(int number){
        int reverse = 0;
        while (number != 0){
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }
        return reverse;
    }
    public static boolean canPack (int goal, int bigCount, int smallCount){
        int bigWeight = 5;
        int smallWeight = 1;
        int sum;
        for(int i = 0; i <= bigCount; i++){
            for(int j = 0; j <= smallCount; j++){
                sum = i * bigWeight + j * smallWeight;
                if (goal == sum){
                    return true;
                }
            }
        }
        return false;
    }
}
