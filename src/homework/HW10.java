package homework;

import java.util.Locale;

public class HW10 {

    public class Metod {

        // 1

        public static String stroka1(String a) {
            if (a.isEmpty() == false) {  // метод "isEmpty()" проверяет (пустая/НЕ пустая) строка (false - НЕ пустая)
                if (a.trim().length() < a.length()) {
                    a = a.trim(); // метод "trim()" обрезает пробелы в начале и в конце строки

                    return a = "Лишние пробелы удалены";
                } else {

                    return a = "Пробелов не было";
                }
            }

            return a = "Строка пустая";
        }

        // 2

        public static String removeAlla2(String a) {
            if (a.isEmpty() == false) {
                if (a.trim().length() < a.length()) {
                    a = a.trim();
                    a = a.replace("a", ""); // метод "replace()" заменяет символы ("а" на "")

                    return a;
                } else {
                    a = a.replace("a", "");

                    return a;
                }
            }

            return a = "Строка пустая";
        }

        // 3

        public static String removeAllZeros3(String a) {
            if (a.isEmpty() == false) {  // метод "isEmpty()" проверяет (пустая/НЕ пустая) строка (false - НЕ пустая)
                a = a.replace("0", ""); // метод "replace()" заменяет символы ("0" на "")
                a = a.replace(" ", "");

                return a;
            }

            return a = "Строка пустая";
        }

        // 4

        public static String removeAllSpaces4(String a) {
            if (a.isEmpty() == false) {  // метод "isEmpty()" проверяет (пустая/НЕ пустая) строка (false - НЕ пустая)
                a = a.replace(" ", ""); // метод "replace()" заменяет символы (" " на "")

                return a;
            }

            return a = "Строка пустая";
        }

        // 5

        public static int howManyLetterAContainsTheString5(String a) {
            String b = a;
            a = a.toLowerCase();
            b = a.toLowerCase(); // Методом "toLowerCase()" делаем все буквы маленькими. "toUpperCase()" - большими
            b = a.replace("a", "");
            int count = a.length() - b.length();

            return count;
        }

        // 6

        public static boolean whetherTheTextContainsAtLeastOneJavaWord6(String a) {

            return a.contains("Java");
        }

        // 7

        public static String quotationMarksAndDotUsingTheConcatMethod7(String a) {
            a = a.trim();              // метод "trim()" обрезает пробелы в начале и в конце строки
            String b = "\"";
            String c = "\".";
            a = b.concat(a).concat(c); // Метод "b.concat(a)" присоединяет к строке "b" строка "а"
            // "b.concat(a).concat(c)" - к строке "b" присоединяем строку "а"
            // и потом строку "с"

            return a;
        }

        // 8

        public static String correctSpelling8(String a) {
            String b = a.trim().toLowerCase(); // "trim()" - отсекаем пробелы в начале и конце
                                               // "toLowerCase()" - делаем все буквы маленькими
            String capital = b.substring(0, 1); // "substring(0, 1)" - отделяем первую букву
            String word = b.substring(1);       // "substring(1)" - отделяем ВСЁ кроми первой буквы
            capital = capital.toUpperCase();
            a = capital.concat(word);           // Присоединяем к первой букве всё остальное слово

            return a;
        }
    }

    public static void main(String[] args) {

        // 1

        System.out.println("1) ");
        System.out.println(Metod.stroka1("    QA4Everyone   "));
        System.out.println(Metod.stroka1("QA4Everyone"));
        System.out.println(Metod.stroka1(""));

        // 2

        System.out.println("2) ");
        System.out.println(Metod.removeAlla2("    QA4Everyone   "));
        System.out.println(Metod.removeAlla2("panda   "));

        // 3

        System.out.println("3) ");
        System.out.println(Metod.removeAllZeros3("   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 "));
        System.out.println(Metod.removeAllZeros3(" 0000000111"));

        // 4

        System.out.println("4) ");
        System.out.println(Metod.removeAllSpaces4("    QA   4  Everyone   "));
        System.out.println(Metod.removeAllSpaces4("p a     n d a   "));

        // 5

        System.out.println("5) ");
        System.out.println(Metod.howManyLetterAContainsTheString5("Abracadabra"));
        System.out.println(Metod.howManyLetterAContainsTheString5("Homenum Revelio"));

        // 6

        System.out.println("6) ");
        System.out.println(Metod.whetherTheTextContainsAtLeastOneJavaWord6("As of March 2022, Java 18 is " +
                "the latest version, while Java 17, 11 and 8 are the current long-term support (LTS) versions. " +
                "Oracle released the last zero-cost public update for the legacy version Java 8 LTS in January " +
                "2019 for commercial use, although it will otherwise still support Java 8 with public updates " +
                "for personal use indefinitely. Other vendors have begun to offer zero-cost builds of OpenJDK " +
                "8 and 11 that are still receiving security and other upgrades."));
        System.out.println(Metod.whetherTheTextContainsAtLeastOneJavaWord6("As a decrepit father takes delight\n" +
                "To see his active child do deeds of youth,\n" +
                "So I, made lame by fortune’s dearest spite,\n" +
                "Take all my comfort of thy worth and truth.\n" +
                "For whether beauty, birth, or wealth, or wit,\n" +
                "Or any of these all, or all, or more,\n" +
                "Entitled in thy parts do crownèd sit,\n" +
                "I make my love engrafted to this store.\n" +
                "So then I am not lame, poor, nor despised,\n" +
                "Whilst that this shadow doth such substance give\n" +
                "That I in thy abundance am sufficed,\n" +
                "And by a part of all thy glory live.\n" +
                "Look what is best, that best I wish in thee.\n" +
                "This wish I have; then ten times happy me."));

        // 7

        System.out.println("7) ");
        System.out.println(Metod.quotationMarksAndDotUsingTheConcatMethod7("One"));
        System.out.println(Metod.quotationMarksAndDotUsingTheConcatMethod7("    TWO  "));

        // 8

        System.out.println("8) ");
        System.out.println(Metod.correctSpelling8("ташкент"));
        System.out.println(Metod.correctSpelling8("ЧикаГО"));

        // 9

    }
}