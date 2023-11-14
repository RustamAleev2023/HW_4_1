import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();

//        int i = 153;
//            //разбиваем число на разряды
//            int[] digits = new int[String.valueOf(i).length()];
//            int n = i;
//            for (int j = 0; j < digits.length; j++) {
//                digits[j] = n % 10;
//                n = n / 10;
//                System.out.println(digits[j]);
//            }
//            int[] result = new int[digits.length];
//        System.out.println(result.length);
//            for (int j = 0; j < result.length; j++) {
//
//                result[j] = (int) Math.pow(digits[j],1/digits.length);
//                System.out.println(result[j]);
//            }


    }

    //Task1
    //Fibonacci numbers
    public static void task1() {

        int maxLimit = 10_000_000;
        int a = 0;
        int b = 1;
        int c;

        while (a <= maxLimit){
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }

    //Task2
    public static void task2() {
        int n = 1_000_000;

        for (int i = 2; i <= n; i++) {
            boolean isPrimeNumber = true;
            double squareRoot = Math.sqrt(i) + 2;
            int j = 2;
            while (j <= squareRoot && isPrimeNumber) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                }
                j++;
            }
            if (isPrimeNumber) {
                System.out.println(i);
            }

        }
    }

    //Task3
    public static void task3() {
        int min = 10;
        int max = 1_000_000;


        for (int i = min; i <= max; i++) {
            //разбиваем число на разряды
            int[] digits = new int[String.valueOf(i).length()];
            int n = i;
            for (int j = 0; j < digits.length; j++) {
                digits[j] = n % 10;
                n = n / 10;
            }
            int[] result = new int[digits.length];
            for (int j = 0; j < result.length; j++) {
                result[j] = (int) Math.pow(digits[j], (1 / digits.length));
            }
        }


    }
}