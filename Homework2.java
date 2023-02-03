package Homework1;
import java.util.ArrayList;
import java.util.Random;

public class Homework2 {

    // დავალება 1
    public static void OddNumbers() {
        System.out.println("Odd Numbers are: ");
        for (int i = 0; i <= 30; i++){
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    // დავალება 2
    public static void RandomNum() {
        System.out.println("10 Random Numbers are: ");
        for (int i = 0; i < 10; i++) {
            int min = 0;
            int max = 100;
            int randomnum;
            Random random = new Random();
            randomnum = random.nextInt((max - min) + 1) + min;
            System.out.println(randomnum);
        }
    }

    // დავალება 2 Library იმპორტის გარეშე, წილადებიც და მთელი რიცხვებიც
    public static void RandomNum2() {
        System.out.println("10 Random Numbers are: ");
        for (int i = 0; i < 5; i++) {
            int min = 0;
            int max = 100;
            double num1 = Math.random() * (max - min + 1) + min;
            int num2 = (int)(Math.random()*(max-min+1)+min);
            System.out.println(num1);
            System.out.println(num2);
        }
    }

    // დავალება 3
    public static float Average () {
        double[] array = {7,12,34,56,27,123};
        float avg = 0;
        for ( int i = 0; i < array.length;i++){
            avg += array[i];
        }
        return avg / array.length;
    }

    // დავალება 4
    public static void MinNumber() {
        int[] array = {12,24,34,11,2,67,54,10,5,6};
        int min = array[0];
        for (int i = 1; i< array.length; i++){
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("The minimum number in the following list is: " + min);
    }
     // დავალება 4 Array List ის გამოყენებით
    public static void MinNumber2() {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(23);
        nums.add(13);
        nums.add(3);
        int min = nums.get(0);
        for (int i = 1; i< nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        System.out.println("The minimum number in the following list is: " + min);
    }



    public static void main(String[] args){
        OddNumbers();
        System.out.println("-------------------------");
        RandomNum();
        System.out.println("-------------------------");
        RandomNum2();
        System.out.println("-------------------------");
        System.out.println("Average of the following list is "+ Average());
        System.out.println("-------------------------");
        MinNumber();
        System.out.println("-------------------------");
        MinNumber2();

    }
}
