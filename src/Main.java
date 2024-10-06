import java.util.Scanner;
import java.io.PrintStream;

public class Main {
    // Объявляем объект класса Scanner для ввода данных
    public static Scanner in = new Scanner(System.in);
    // Объявляем объект клсса PrintStream для вывода данных
    public static PrintStream out = System.out;

    public static void main(String[] args) {
        // Считывание четырех целых чисел a, b, c и d.
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

//        int min_1 = a;
//        int min_2 = b;
//        int min_3 = c;
//        int min_4 = d;

        if (a > b) { swap = a; a = b; b = swap; }
        if (c > d) { swap = c; c = d; d = swap; }
        if (a > c) { swap = a; a = c; c = swap; }
        if (b > d) { swap = b; b = d; d = swap; }
        if (b > c) { swap = b; b = c; c = swap; }

        out.printf("%d %d %d %d", a, b, c, d)
    }
}