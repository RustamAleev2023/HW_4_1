import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();

    }

    //Task1
    //Fibonacci numbers
    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для вывода последовательности Фибоначчи");
        int n = scanner.nextInt();


        int[] f = new int[n];

        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i < n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }

        for (int i = 0; i < f.length; i++) {
            System.out.println(f[i]);
        }

    }
}