package homework;

import java.util.Arrays;
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
            a = b.concat(a).concat(c); // Метод "b.concat(a)" присоединяет к строке "b" строку "а"
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

        // 9

        public static String returningAStringBetweenParameters9(String word, String letter) {
            int first = word.indexOf(letter); // Методом "indexOf(letter)" находим индекс где первый раз встречаем "letter"
            int last = word.lastIndexOf(letter); // Методом "lastIndexOf(letter)" находим индекс где последний раз встречаем "letter"
            word = word.substring(first, last + 1); // "substring(first, last)" - записываем ВСЁ что находится между первым и последним индексом

            return word;
        }

        // 10

        public static boolean firstAndLastLettersAreTheSame10(String a) {
            a = a.trim(); // Обрезаем пробелы в начале и в конце слова, на тот случай если слово придёт с пробелами
            a = a.toLowerCase(); // Делаем все буквы маленькими
            String first = a.substring(0, 1); // Записываем первую букву
            String last = a.substring(a.length() - 1); // Записывем последнюю букву
            if (first.equals(last)) { // Сравниваем первую букву с последней

                return true;
            }

            return false;
        }

        // 11

        public static String[] arrayOfWords11(String a) {
            String[] words = a.split(" "); // Разделяем строку по пробелам "a.split(" ")" и записываем
            // в массив слова из строки "а"
            return words;
        }

        // 12

        public static String[] fullNameArray12(String a) {
            String[] fullNameS = a.split(" ");
            String name = "Имя: ";
            String patronymic = "Отчество: ";
            String surname = "Фамилия: ";
            String[] fullName = {name.concat(fullNameS[0]), patronymic.concat(fullNameS[1]),
                    surname.concat(fullNameS[2])};

            return fullName;
        }

        // 13

        public static int sumOfAllLetters13(String a) {
            int sum = 0;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) > 64 && a.charAt(i) < 91) {
                    sum += a.charAt(i);
                }
                if (a.charAt(i) > 96 && a.charAt(i) < 123) {
                    sum += a.charAt(i);
                }
            }

            return sum;
        }

        // 14

        public static boolean whoWillMeetFirstInTheAlphabet14(String a, String b) {
            a = a.toLowerCase();
            b = b.toLowerCase();
            if (a.charAt(0) < b.charAt(0)) {

                return true;
            }

            return false;
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

        System.out.println("9) ");
        System.out.println(Metod.returningAStringBetweenParameters9("Abracadabra", "b"));
        System.out.println(Metod.returningAStringBetweenParameters9("Whippersnapper", "p"));


        // 10

        System.out.println("10) ");
        System.out.println(Metod.firstAndLastLettersAreTheSame10("Abracadabra"));
        System.out.println(Metod.firstAndLastLettersAreTheSame10("Whippersnapper"));

        // 11

        System.out.println("11) ");
        System.out.println(Arrays.toString(Metod.arrayOfWords11("QA for Everyone"))); // "Arrays.toString()" - выводим массив
        System.out.println(Arrays.toString(Metod.arrayOfWords11("Александр Сергеевич Пушкин")));

        // 12

        System.out.println("12) ");
        System.out.println(Arrays.toString(Metod.fullNameArray12("Александр Сергеевич Пушкин")));

        // 13

        System.out.println("13) ");
        System.out.println(Metod.sumOfAllLetters13("abc"));
        System.out.println(Metod.sumOfAllLetters13("ABC"));
        System.out.println(Metod.sumOfAllLetters13("123"));

        // 14

        System.out.println("14) ");
        System.out.println(Metod.whoWillMeetFirstInTheAlphabet14("a", "m"));
        System.out.println(Metod.whoWillMeetFirstInTheAlphabet14("m", "l"));

    }
}