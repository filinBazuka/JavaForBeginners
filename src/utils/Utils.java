package utils;

import hw8.HW8;

public class Utils {

    public static String line = "_________________________________________________________________";

    // 7) Написать метод, который принимает на вход 5 целых чисел,  и возвращает массив из этих же чисел
    public static int[] arry5(int a, int b, int c, int d, int e) {
        int[] arry = {a, b, c, d, e};
        return arry;
    }

    // 8 Написать метод, который принимает на вход 5 чисел типа double,  и возвращает массив из этих же чисел
    public static double[] arry5(double a, double b, double c, double d, double e) {
        double[] arry = {a, b, c, d, e};
        return arry;
    }

    // 9 Написать метод, который принимает на вход 5 слов, и возвращает массив из этих слов
    public static String[] arry5(String a, String b, String c, String d, String e) {
        String[] arry = {a, b, c, d, e};
        return arry;
    }

    // 10 Написать метод, который принимает на вход массив целых чисел,  и возвращает массив
    // тех же чисел, умноженных на 2.5
    public static double[] arry2_5(int[] a) {
        double[] arry = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            arry[i] = a[i] * 2.5;
        }
        return arry;
    }

    // 11 Написать метод, который принимает на вход массив целых положительных чисел,
    // и возвращает количество четных чисел в этом массиве
    public static int kolChet(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 && a[i] != 0) {
                count++;
            }
        }
        return count;
    }

    // 12 Написать метод, который принимает на вход массив целых положительных чисел,
    // и возвращает массив нечетных чисел
    public static int[] arryNeChet(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                count++;
            }
        }
        int[] massNeChet = new int[count];
        count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                massNeChet[count] = a[i];
                count++;
            }
        }
        return massNeChet;
    }

    // 13 Написать метод, который принимает на вход масив целых чисел,
    // и возвращает массив значений true или false, если числа больше 10
    public static boolean[] massBolshe10(int[] a) {
        boolean[] b = new boolean[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 10) {
                b[i] = true;
            } else {
                b[i] = false;
            }
        }
        return b;
    }

    // 14 Написать метод, который принимает на вход массив слов,
    // и возвращает строку, состоящую из этих слов
    public static String massSlov(String[] a) {
        String stroka = "";
        for (int i = 0; i < a.length; i++) {
            stroka += a[i];
        }
        return stroka;
    }

    // 15 Написать метод, который принимает массив целых чисел
    // и считает сумму чисел во второй половине массива
    public static int sum2Polovina(int[] a) {
        int sum = 0;
        if (a.length % 2 == 0) {
            for (int i = a.length / 2; i < a.length; i++) {
                sum += a[i];
            }
        }
        return sum;
    }

    // 16 Написать метод, который принимает на вход целое положительные число в пределах
    // от 1 до 10 исключительно, и возвращает таблицу умножения на это число в виде массива
    //Например, метод(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}
    public static int[] tablicaUmnojenia(int a) {
        int[] umnojenie = new int[11];
        for (int i = 0; i <= 10; i++) {
            umnojenie[i] = a * i;
        }
        return umnojenie;
    }

    // 17 Написать метод, который принимает массив целых чисел и возвращает массив четных чисел,
    // если четных чисел больше, или массив нечетных чисел, если нечетных чисел больше.
    public static int[] massChetNechet(int[] a) {
        int massChet = 0;
        int massNechet = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                if (a[i] % 2 == 0) {
                    massChet++;
                } else {
                    massNechet++;
                }
            }
        }
        int[] vozvrat = {};
        if (massChet != massNechet) {
            if (massChet > massNechet) {
                vozvrat = new int[massChet];
            } else {
                vozvrat = new int[massNechet];
            }
        } else {
            System.out.print("В массиве одинаковое количество чётных и нечётных чисел.");
        }
        if (massChet != massNechet) {
            if (massChet > massNechet) {
                int count = 0;
                for (int i = 0; i < a.length; i++) {
                    if (a[i] % 2 == 0 && a[i] != 0) {
                        vozvrat[count] = a[i];
                        count++;
                    }
                }
            } else {
                int count = 0;
                for (int i = 0; i < a.length; i++) {
                    if (a[i] % 2 != 0 && a[i] != 0) {
                        vozvrat[count] = a[i];
                        count++;
                    }
                }
            }
        }
        return vozvrat;
    }

    // 18 Написать метод, который принимает на вход длину массива и
    // генерирует массив случаейных положительных чисел от 0 до 100 исключительно.
    public static int[] baraban(int a) {
        int[] rnd = new int[a];
        for (int i = 0; i < a; i++) {
            rnd[i] = (int) (Math.random() * 100);
        }
        return rnd;
    }

    // 19 Написать метод, который принимает на вход длину массива l и количество знаков d
    // (однозначные, двузначные, трехзначные и тд числа), и генерирует массив
    // случайных целых положительных чисел длины l, в котором все числа имеют количество знаков d
    public static int[] massLD(int l, int d) {
        double[] mass = new double[l];
        for (int i = 0; i < l; i++) {
            mass[i] = Math.random() * 0.9 + 0.1;
        }
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < d; j++) {
                mass[i] *= 10;
            }
        }
        int[] vozvrat = new int[l];
        for (int i = 0; i < l; i++) {
            vozvrat[i] = (int) mass[i];
        }
        return vozvrat;
    }

    // 20 Написать метод, который принимает на вход массив целых положительных чисел,
    // и возвращает массив только двузначных чисел. ПРоверить работу метода на массиве из задания 18.
    public static int[] dvuznak(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] / 10 >= 1) {
                count++;
            }
        }
        int[] vozvrat = new int[count];
        count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] / 10 >= 1) {
                vozvrat[count] = a[i];
                count++;
            }
        }
        return vozvrat;
    }

    // 21 Написать метод, который принимает на вход массив целых положительных двузначных чисел,
    // и возвращает массив разниц между десятками и единицами
    public static int[] raznica(int[] a) {
        int[] vozvrat = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            vozvrat[i] = a[i] / 10 - a[i] % 10;
            vozvrat[i] = Math.abs(vozvrat[i]);
        }
        return vozvrat;
    }

    // 22 Написать метод, который принимает массив из 11 целых положительных чисел от 0 до 9,
    // и возвращает массив, который содержит номер телефона, состоящий из этих чисел,
    // и название страны, которой номер принадлежит.
    // Например: method({1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7}) -> {“1(800)123-45-67”, “USA”}
    public static String[] nomerTelefona(int[] a) {
        String[] vozvrat = {};

        String[] nomer = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            nomer[i] = String.valueOf(a[i]);
        }
        if (a[0] == 1) {
            vozvrat = new String[]{"\"", nomer[0], "(", nomer[1], nomer[2], nomer[3], ")", nomer[4], nomer[5], nomer[6], "-", nomer[7], nomer[8], "-", nomer[9], nomer[10], "\", ", "\"USA\""};
        }
        if (a[0] == 8) {
            vozvrat = new String[]{"\"", nomer[0], "(", nomer[1], nomer[2], nomer[3], ")", nomer[4], nomer[5], nomer[6], "-", nomer[7], nomer[8], "-", nomer[9], nomer[10], "\", ", "\"RUS\""};
        }
        return vozvrat;
    }

    // 23 Написать метод, который принимает массив целых положительных чисел больше 0,
    // и возвращает массив уникальных чисел.
    public static int[] unikal(int[] a) { // {10, 5, 2, 4, 5, 10, 1, 5, 10}
        int[] unikal = {};
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    a[j] = 0;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                count++;
            }
        }
        unikal = new int[(a.length - count)];
        count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                unikal[count] = a[i];
                count++;
            }
        }
        return unikal;
    }

    // 24 Написать метод, который принимает на вход массив целых положительных чисел,
    // и возвращает количество уникальных и неуникальных элементов в этом массиве
    public static String kolichUnikalokINet(int[] a) {
        String unik = "";
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    a[j] = 0;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                count++;
            }
        }
        unik = "Уникальных : " + (a.length - count) + "\tНеуникальных : " + count;
        return unik;
    }

    // 25 Написать метод, который принимает на вход массив целых положительных чисел,
    // и 2 целых положительных числа (значения индексов). Метод возвращает массив,
    // который содержит только числа из первого массива в промежутке между индексами.
    // Например: method({1, 2, 3, 4, 5}, 1, 3) -> {2, 3, 4}
    public static int[] massIndex(int[] a, int m, int b) {
        int[] massInd = new int[(b + 1) - m];
        int count = 0;
        for (int i = m; i < b + 1; i++) {
            massInd[count] = a[i];
            count++;
        }
        return massInd;
    }

    // 26 Написать метод, который принимает на вход 2 массива int[]
    // и возвращает объединенный массив уникальных неповторяющихся элементов
    public static int[] uniNePovtor(int[] a, int[] b) {
        int[] obed = new int[a.length + b.length];
        for (int i = 0; i < a.length + b.length; i++) {
            if (i < a.length) {
                obed[i] = a[i];
            } else {
                obed[i] = b[i - a.length];
            }
        }
        for (int i = 0; i < a.length + b.length; i++) {
            for (int j = i + 1; j < a.length + b.length; j++) {
                if (obed[i] == obed[j]) {
                    obed[j] = 0;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < a.length + b.length; i++) {
            if (obed[i] == 0) {
                count++;
            }
        }
        int[] obedV = new int[a.length + b.length - count];
        count = 0;
        for (int i = 0; i < a.length + b.length; i++) {
            if (obed[i] != 0) {
                obedV[count] = obed[i];
                count++;
            }
        }
        return obedV;
    }

}