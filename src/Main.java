import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//          task6();
          task7();


    }

    //Task1
    //Fibonacci numbers
    public static void task1() {

        int maxLimit = 10_000_000;
        int a = 0;
        int b = 1;
        int c;

        while (a <= maxLimit) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }

    //Task2
    //Prime number
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
    //Armstrong number
    public static void task3() {
        int min = 10;
        int max = 1_000_000;


        for (int i = min; i <= max; i++) {
            int sum = 0;
            //разбиваем число на разряды

            int[] digits = digits(i);

            double pow = digits.length;

            for (int j = 0; j < digits.length; j++) {
                int temp = (int) Math.round(Math.pow(digits[j], pow));
                sum += temp;
            }

            if (sum == i) {
                System.out.println(i);
            }
        }
    }

    public static int[] digits(int i){
        int[] digits = new int[String.valueOf(i).length()];
        int n = i;
        for (int j = 0; j < digits.length; j++) {
            digits[j] = n % 10;
            n = n / 10;
        }

        return digits;
    }

    //Task4
    //Perfect number
    public static void task4(){
        int min = 10;
        int max = 1_000_00;

        for (int num = min; num <= max ; num++) {
            if(isPerfect(num)){
                System.out.println(num);
            }

        }
    }
    public static boolean isPerfect(int num){
        int sum = 0;
        for (int i = 1; i <= num/2; i++) {
            if(num % i == 0){
                sum += i;
            }
        }

        if(sum == num){
           return  true;
        } else {
            return false;
        }
    }

    //Task5
    //Palindrome
    public static void task5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число.\n" +
                "Мы будем проверять - является ли оно палиндромом?\n" +
                "Введенное число должно состоять из четного колличества цифр");

        String string = scanner.next();

        if(string.length() % 2 != 0){
            System.out.println("Вы ввели неверное число");
        } else {
            int mid = string.length()/2;
            String str1 = string.substring(0,mid);
            String str2 = string.substring(mid);

            if(str1.contentEquals(new StringBuilder(str2).reverse())){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    //Task6
    //Counter eight digit's numbers consist of different digits
    public static void task6(){
        int count = 0;

        for (int i = 10000000; i < 100000000; i++) {
            if(numberHasSameDigit(i)){
                if(i % 12345 == 0){
                    System.out.println(i);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static boolean numberHasSameDigit(int number){
        boolean result = true;
        int[] digits = digits(number);
        for (int j = 0; j < digits.length; j++) {
            for (int k = j + 1; k < digits.length; k++) {
                if(digits[j] == digits[k]){
                    result = false;
                }
            }
        }
        return result;
    }

    //Task7
    //int to binary
    public static void task7(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите int ");

        int number = scanner.nextInt();
        int[] binary = new int[32];
        int i = 0;

        while (number != 0){
            binary[i] = number % 2;
            number = number / 2;
            i++;
        }

        System.out.print("Двоичное представление числа : " );
        for (int j = i - 1; j >= 0 ; j--) {
            System.out.print("" + binary[j]);
        }

    }


}