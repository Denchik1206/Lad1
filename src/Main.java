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

        // swap - это переменная для хранения временных данных во время замены значений
        int swap;
        // сортировка с использованием сортировочной сети
        if (a > b) {
            swap = a;
            a = b;
            b = swap;
        }
        if (c > d) {
            swap = c;
            c = d;
            d = swap;
        }
        if (a > c) {
            swap = a;
            a = c;
            c = swap;
        }
        if (b > d) {
            swap = b;
            b = d;
            d = swap;
        }
        if (b > c) {
            swap = b;
            b = c;
            c = swap;
        }

        // Проверка, когда два самых маленьких квадрата равны.
        if (a == b) {
            // Расмотрение случаев, когда сумма стороны двух маленьких квадратов равна стороне среднего.
            if (a + b == c) {
                // И если при этом сумма длин сторон маленького и среднего квадратов
                // равны большому, то получится сложить 3 прямоугольника. Иначе получим
                // только 2 прямоугольника.
                if (a + c == d)
                    out.println(3);
                else
                    out.println(2);
            } else if (b == c) {
                // Если равны все четыре квадрата, то можно получить 7 прямоугольников.
                if (c == d)
                    out.println(6);
                // Если равны три квадрата и сумма их сторон равна стороне самого большого квадрата,
                // то можно получить 4 прямоугольника. Иначе только 3.
                else if (3 * a == d)
                    out.println(4);
                else
                    out.println(3);
            // Если равны два маленьких квадрата и два больших, то можно сложить 2 прямоугольника.
            } else if (c == d) {
                out.println(2);
            // Если не выполнилось ни одно условие, то можно получить 1 прямоугольник.
            } else
                out.println(1);
        // Теперь посмотрим на случаи, когда равны два средних квадрата.
        } else if (b == c) {
            // Если сумма сторон двух средних квадратов равна стороне самого большого квадрата,
            // то можно получить 2 прямоугольника.
            if (b + c == d) {
                out.println(2);
            // Если равны три больших квадрат, то можно сложить 3 прямоугольника.
            } else if (c == d) {
                out.println(3);
            // Если ничего не выполнилось, то всего 1 прямоугольник.
            } else
                out.println(1);
        // Если равны два больших квадрата, то можно сложить всего 1 прямоугольник. Случай, когда равны 2 больших
        // и 2 маленьких мы уже рассмотрели.
        } else if (c == d) {
            out.println(1);
        // Если нет равных квадратов, то не получится сложить ни один прямоугольник.
        } else {
            out.println(0);
        }
    }
}