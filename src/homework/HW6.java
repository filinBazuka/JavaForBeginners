package homework;

import java.util.Locale;

public class HW6 {
    // 1 Распечатать последовательность чисел от 0 до 9 включительно.

    public static void chisla0_9() {
        System.out.print("1) ");

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
    }

    // 2 Распечатать последовательность чисел от 10 исключительно до 0 включительно.

    public static void chisla9_0() {
        System.out.print("2) ");
        for (int i = 9; i > -1; i--) {
            System.out.print(i + " ");
        }
    }

    // 3 Распечатать последовательность чисел от 50 до 55 включительно с шагом 2.

    public static void chisla50_55() {
        System.out.print("3) ");
        for (int i = 50; i < 55; i += 2) {
            System.out.print(i + " ");
        }
    }

    // 4 Распечатать последовательность чисел, кратных 7, в промежутке (327, 300)

    public static void chisla327_300() {
        System.out.print("4) ");
        for (int i = 327; i > 300; i--) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // 5 Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1

    public static void chisla12_13() {
        System.out.print("5) ");
        for (double i = 12; i < 13; i += 0.1) {
            System.out.format(Locale.US, "%.1f  ", i);
            //System.out.print("  ");
            //System.out.print(Math.round(i * 10) / 10D + " ");
        }
    }

    // 6 Распечатать последовательность четных чисел от 215 до 237 включительно

    public static void chislaChet215_237() {
        System.out.print("6) ");
        for (int i = 215; i < 237; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // 7 Распечатать последовательность чисел, кратных 7, в промежутке от 7 исключительно до 14 исключительно.

    public static void chislaCrat7() {
        System.out.print("7) ");
        int count = 0;
        for (int i = 8; i < 14; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            } else {

                count++;
            }
        }
        if (count <= 6) {
            System.out.print("В промежутке от 7 искл. до 14 искл. нет цифр ктратных 7-ми.");
        }
    }

    // 8 Распечатать последовательность которая начинается с минимального значения типа данных short
    // и заканчивается максимальным значением short. Числа в последовательности должны быть кратны 15001.

    public static void shCrat15001() {
        System.out.print("8) ");
        for (int i = -32768; i < 32767; i++) {
            if (i % 15001 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // 9 Распечатать последовательность чисел в промежутке от -10 до 34 включительно. Числа, кратные 11,
    // должны быть распечатаны синим цветом. Числа, кратные 12, должны быть распечатаны красным цветом.
    // А ноль необходимо распечатать словом ZERO.

    public static void cveta() {
        System.out.print("9) ");
        for (int i = -10; i < 35; i++) {
            if (i == 0) {
                System.out.print("ZERO" + " ");
                continue;
            }
            if (i % 11 == 0) {
                System.out.print("\u001B[34m" + i + " " + "\u001B[0m");
                continue;
            }
            if (i % 12 == 0) {
                System.out.print("\u001B[31m" + i + " " + "\u001B[0m");
                continue;
            }
            System.out.print(i + " ");
        }
    }

    // 10 Написать метод, который принимает на вход параметры start,  end, step,
    // и печатает последовательность десятичных  чисел, начиная с числа start, с шагом step.
    // Точка выхода из цикла - число end.

    public static void startEndStep(double start, double end, double step) {
        System.out.print("10) ");
        for (double i = start; i < end; i += step) {
            System.out.format("%.1f", i);
            System.out.print("  ");
        }
    }

    // 11 Написать метод, который принимает параметр l и печатает последовательность четных чисел от нуля.
    // Длина последовательности = l.

    public static void parametrL(int l) {
        System.out.print("11) ");
        for (int i = 2; i <= l; i += 2) {
            System.out.print(i + "  ");
        }
    }

    // 12 Напишите метод, который принимает целое число n, и выводит все степени числа 2 от 1
    // до n включительно

    public static void stepen(int n) {
        System.out.print("12) ");
        for (int i = 1; i <= n; i++) {
            System.out.print((int) Math.pow(2, i) + "  ");
        }
    }

    // 13 Вывести последовательность 012345678900112233445566778899000…
    // до числа 9999 включительно.

    public static void posled9999() {
        System.out.print("13) ");
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            System.out.print(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            System.out.print(i);
            System.out.print(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            System.out.print(i);
            System.out.print(i);
            System.out.print(i);
        }
    }

    // 14 Распечатайте последовательность чисел:
    // 0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5

    public static void otrecanie() {
        System.out.print("14) ");
        for (int i = 0; i < 6; i++) {
            if (i == 0) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i + ", ");
                System.out.print(-i + ", ");
            }
        }
    }

    // 15 Распечатать последовательность чисел:
    // 0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25

    public static void crat3_5() {
        System.out.print("15) ");
        for (int i = 0; i < 26; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // 16 Написать метод, который принимает параметры n, m, l,
    // и печатает последовательность нечетных чисел начиная с числа n,
    // с шагом m, длина последовательности l.

    public static void nechet(int n, int m, int l) {
        System.out.print("16) ");
        for (int i = n; i < l; i += m) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    // 17 Сгенерируйте и распечатайте последовательность по формуле:
    // n + 1 = n + 2

    public static void mass() {
        System.out.print("17) ");
        int[] mass = new int[10];
        int a = 0;
        for (int i = 0; i < 10; i++) {
            mass[a] = i + 2;
            System.out.print(mass[a] + "  ");
            a++;
        }
    }

    // 18 Написать метод, который принимает параметры l, n, и печатает последовательность чисел,
    // начиная с числа n, по формуле для n + 1 члена последовательности:
    // n + 1 = 2n . Длина последовательности l.

    // 19 Сгенерируйте последовательность целых положительных  двузначных чисел,
    // в которых разница между первой цифрой (десятки) и второй цифрой (единицы) не превышает 3.

    public static void dvuznach() {
        System.out.print("19) ");
        int des = 0;
        int ed = 0;
        for (int i = 10; i < 100; i++) {
            des = i / 10;
            ed = i % 10;
            if (des - ed <= 3 && ed - des <= 3) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        // 1
        chisla0_9();
        System.out.println();
        // 2
        chisla9_0();
        System.out.println();
        // 3
        chisla50_55();
        System.out.println();
        // 4
        chisla327_300();
        System.out.println();
        // 5
        chisla12_13();
        System.out.println();
        // 6
        chislaChet215_237();
        System.out.println();
        // 7
        chislaCrat7();
        System.out.println();
        // 8
        shCrat15001();
        System.out.println();
        // 9
        cveta();
        System.out.println();
        // 10
        double start = 10;
        double end = 50;
        double step = 2.4;
        startEndStep(start, end, step);
        System.out.println();
        // 11
        int l = 20;
        parametrL(l);
        System.out.println();
        // 12
        int n = 5;
        stepen(n);
        System.out.println();
        // 13
        posled9999();
        System.out.println();
        // 14
        otrecanie();
        System.out.println();
        // 15
        crat3_5();
        System.out.println();
        // 16
        int nachalo = 0;
        int shag = 1;
        int dlinna = 20;
        nechet(nachalo, shag, dlinna);
        System.out.println();
        // 17
        mass();
        System.out.println();
        // 19
        dvuznach();
        System.out.println();

    }
}
