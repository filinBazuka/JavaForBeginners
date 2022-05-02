package hw8;

import utils.Utils;

public class HW8 {

    public static void main(String[] args) {

        Integer a = 12;
        Double b = 21.12;
        String c = "Привет!";

        System.out.println(Utils.line);
        System.out.println("\tHW8\t\t\t\t|" + "\tHW8_1\t\t\t\t\t|\t" + "areEquals?\t|");
        System.out.println(Utils.line);
        System.out.println("Integer a = " + a + "\t\t|\tInteger a_1 = " + HW8_1.a_1 + "\t\t|\t" + (a.equals(HW8_1.a_1)) + "\t\t|"); // "equals" - сравнение ЗНАЧЕНИЙ "(HW8_1.a_1)" - обращение
        // к переменной другого класса "HW8_1"
        System.out.println(Utils.line);
        System.out.println("Double b = " + b + "\t|\tDouble b_1 = " + HW8_1.b_1 + "\t\t|\t" + (b.equals(HW8_1.b_1)) + "\t\t|");
        System.out.println(Utils.line);
        System.out.println("String b = " + c + "\t|\tString b_1 = " + HW8_1.c_1 + "\t|\t" + (c.equals(HW8_1.c_1)) + "\t\t|");
        System.out.println(Utils.line);

        // 7) Написать метод, который принимает на вход 5 целых чисел,  и возвращает массив из этих же чисел
        int m1 = 1;
        int m2 = 2;
        int m3 = 3;
        int m4 = 4;
        int m5 = 5;

        System.out.print("7) ");
        for (int i = 0; i < 5; i++) {
            System.out.print(Utils.arry5(m1, m2, m3, m4, m5)[i] + " ");
        }

        // 8 Написать метод, который принимает на вход 5 чисел типа double,  и возвращает массив из этих же чисел
        double d1 = 1.1, d2 = 2.2, d3 = 3.3, d4 = 4.4, d5 = 5.5;
        System.out.println();
        System.out.print("8) ");
        for (int i = 0; i < 5; i++) {
            System.out.print(Utils.arry5(d1, d2, d3, d4, d5)[i] + " ");
        }

        // 9 Написать метод, который принимает на вход 5 слов, и возвращает массив из этих слов
        String s1 = "Скажи", s2 = "- ка,", s3 = "дядя,", s4 = "ведь", s5 = "недаром...";
        System.out.println();
        System.out.print("9) ");
        for (int i = 0; i < 5; i++) {
            System.out.print(Utils.arry5(s1, s2, s3, s4, s5)[i] + " ");
        }

        // 10 Написать метод, который принимает на вход массив целых чисел,  и возвращает массив
        // тех же чисел, умноженных на 2.5
        int[] massC = {-1, 2, 3, 4, 5, 6, 7};
        System.out.println();
        System.out.print("10) ");
        for (int i = 0; i < massC.length; i++) {
            System.out.print(Utils.arry2_5(massC)[i] + "  ");
        }

        // 11 Написать метод, который принимает на вход массив целых положительных чисел,
        // и возвращает количество четных чисел в этом массиве
        int[] massP = {2, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println();
        System.out.print("11) ");
        System.out.print(Utils.kolChet(massP));

        // 12 Написать метод, который принимает на вход массив целых положительных чисел,
        // и возвращает массив нечетных чисел
        System.out.println();
        System.out.print("12) ");
        for (int i = 0; i < Utils.arryNeChet(massP).length; i++) {
            System.out.print(Utils.arryNeChet(massP)[i] + "  ");
        }

        // 13 Написать метод, который принимает на вход масив целых чисел,
        // и возвращает массив значений true или false, если числа больше 10
        System.out.println();
        System.out.print("13) ");
        int[] massBool = {12, 1, 20, 3, 40, 50, 6, 7, 80, 9};
        for (int i = 0; i < Utils.massBolshe10(massBool).length; i++) {
            System.out.print(Utils.massBolshe10(massBool)[i] + "  ");
        }

        // 14 Написать метод, который принимает на вход массив слов,
        // и возвращает строку, состоящую из этих слов
        System.out.println();
        System.out.print("14) ");
        String[] massSlov = {"Маша", "Мыла", "Раму"};
        System.out.print(Utils.massSlov(massSlov));

        // 15 Написать метод, который принимает массив целых чисел
        // и считает сумму чисел во второй половине массива
        System.out.println();
        System.out.print("15) ");
        int[] massCel = {-1, 2, 3, 4, 5, 6, 7, -8};
        System.out.print(Utils.sum2Polovina(massCel));

        // 16 Написать метод, который принимает на вход целое положительные число в пределах
        // от 1 до 10 исключительно, и возвращает таблицу умножения на это число в виде массива
        //Например, метод(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}
        System.out.println();
        System.out.print("16) ");
        int chislo = 9;
        if (chislo >= 1 && chislo < 10) {
            for (int i = 0; i <= 10; i++) {
                System.out.print(Utils.tablicaUmnojenia(chislo)[i] + "  ");
            }
        } else {
            System.out.print("Число не входит в указанный диапозон");
        }

        // 17 Написать метод, который принимает массив целых чисел и возвращает массив четных чисел,
        // если четных чисел больше, или массив нечетных чисел, если нечетных чисел больше.
        System.out.println();
        System.out.print("17) ");
        int[] massChetNe = {-1, 2, 3, 4, 0, 6};
        for (int i = 0; i < Utils.massChetNechet(massChetNe).length; i++) {
            System.out.print(Utils.massChetNechet(massChetNe)[i] + "  ");
        }

        // 18 Написать метод, который принимает на вход длину массива и
        // генерирует массив случаейных положительных чисел от 0 до 100 исключительно.
        System.out.println();
        System.out.print("18) ");
        int dlinna = 10;
        int[] massDlia20 = Utils.baraban(dlinna);
        for (int i = 0; i < dlinna; i++) {
            //System.out.format("%.1f", Utils.baraban(dlinna)[i]);
            //System.out.print(Utils.baraban(dlinna)[i] + "  ");
            System.out.print(massDlia20[i] + "  ");
        }
        // 19 Написать метод, который принимает на вход длину массива l и количество знаков d
        // (однозначные, двузначные, трехзначные и тд числа), и генерирует массив
        // случайных целых положительных чисел длины l, в котором все числа имеют количество знаков d
        System.out.println();
        System.out.print("19) ");
        int l = 10;
        int d = 3;
        for (int i = 0; i < l; i++) {
            System.out.print(Utils.massLD(l, d)[i] + "  ");
        }

        // 20 Написать метод, который принимает на вход массив целых положительных чисел,
        // и возвращает массив только двузначных чисел. ПРоверить работу метода на массиве из задания 18.
        System.out.println();
        System.out.print("20) ");
        int vr = (Utils.dvuznak(massDlia20)).length;
        int[] rv = Utils.dvuznak(massDlia20);
        for (int i = 0; i < vr; i++) {
            System.out.print(rv[i] + "  ");
        }

        // 21 Написать метод, который принимает на вход массив целых положительных двузначных чисел,
        // и возвращает массив разниц между десятками и единицами
        System.out.println();
        System.out.print("21) ");
        int[] raznica = {12, 41, -67, 19, 92};
        for (int i = 0; i < raznica.length; i++) {
            System.out.print(Utils.raznica(raznica)[i] + "  ");
        }

        // 22 Написать метод, который принимает массив из 11 целых положительных чисел от 0 до 9,
        // и возвращает массив, который содержит номер телефона, состоящий из этих чисел,
        // и название страны, которой номер принадлежит.
        // Например: method({1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7}) -> {“1(800)123-45-67”, “USA”}
        System.out.println();
        System.out.print("22) ");
        int[] telefon = {8, 0, 0, 0, 4, 3, 7, 9, 7, 4, 8};
        for (int i = 0; i < Utils.nomerTelefona(telefon).length; i++) {
            System.out.print(Utils.nomerTelefona(telefon)[i]);
        }

        // 23 Написать метод, который принимает массив целых положительных чисел больше 0,
        // и возвращает массив уникальных чисел.
        System.out.println();
        System.out.print("23) ");
        int[] unikalM = {10, 5, 2, 4, 5, 10, 1, 5, 10};
        for (int i = 0; i < Utils.unikal(unikalM).length; i++) {
            System.out.print(Utils.unikal(unikalM)[i] + "  ");
        }

        // 24 Написать метод, который принимает на вход массив целых положительных чисел,
        // и возвращает количество уникальных и неуникальных элементов в этом массиве
        System.out.println();
        System.out.print("24) ");
        System.out.print(Utils.kolichUnikalokINet(unikalM) + "  ");

        // 25 Написать метод, который принимает на вход массив целых положительных чисел,
        // и 2 целых положительных числа (значения индексов). Метод возвращает массив,
        // который содержит только числа из первого массива в промежутке между индексами.
        // Например: method({1, 2, 3, 4, 5}, 1, 3) -> {2, 3, 4}
        System.out.println();
        System.out.print("25) ");
        int[] massSrez = {7, 26, 39, 40, 53, 24, 35};
        int min = 1;
        int max = 5;
        for (int i = 0; i < Utils.massIndex(massSrez, min, max).length; i++) {
            System.out.print(Utils.massIndex(massSrez, min, max)[i] + "  ");
        }

        // 26 Написать метод, который принимает на вход 2 массива int[]
        // и возвращает объединенный массив уникальных неповторяющихся элементов
        System.out.println();
        System.out.print("26) ");
        int[] mass1 = {10, 5, 2, 4, 5, 7, 10, 13};
        int[] mass2 = {10, 5, 1, 4, 5, 8, 10};
        for (int i = 0; i < Utils.uniNePovtor(mass1, mass2).length; i++) {
            System.out.print(Utils.uniNePovtor(mass1, mass2)[i] + "  ");
        }
    }
}
