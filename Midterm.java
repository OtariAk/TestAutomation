package Homework;

public class Midterm {

    public static void firsttask() {
        for (int i = 1; i <=10; i++ ){
            System.out.println("HelloWorld");
        }

    }
    public static void secondtask(int a, int b) {
        if (a==b){
            System.out.println("A Equals to B");}
        else {
            System.out.println("A Is not Equals to B");
        }

    }

    public static void thirdtask(){
        String[] cityArray = {"New York", "San Francisco", "Dallas", "Los Angeles", "Seattle"};
        for (int i = 0; i < cityArray.length; i++) {
            System.out.println(cityArray[i]);
        }
    }

    public static int fourthtask(int firstprice, int percentage){
        return firstprice - (firstprice / 100)*percentage;

    }



    public static void fifthtask(){
        int[] myArray = {0, 7, 7, 2, 7, 3, 5};
        int maxcount = 0;
        int moda = 0;
        int n = myArray.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (myArray[i] == myArray[j]) {
                    count++;
                }
            }

            if (count > maxcount) {
                maxcount = count;
                moda = myArray[i];
            }
        }
        System.out.println(moda);
    }

    public static void main(String[] args) {
        firsttask();
        System.out.println("-----------------------------------------------");
        secondtask(5,3);
        secondtask(2,2);
        secondtask(14,41);
        System.out.println("-----------------------------------------------");
        thirdtask();
        System.out.println("-----------------------------------------------");
        fifthtask();

    }
}
