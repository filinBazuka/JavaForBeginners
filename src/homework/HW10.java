package homework;

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

        public static String RemoveAlla2(String a) {
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

        public static String RemoveAllZeros3(String a) {
            if (a.isEmpty() == false) {  // метод "isEmpty()" проверяет (пустая/НЕ пустая) строка (false - НЕ пустая)
                a = a.replace("0", ""); // метод "replace()" заменяет символы ("а" на "")
                a = a.replace(" ", "");

                return a;
            }

            return a = "Строка пустая";
        }

        // 4

        public static String RemoveAllSpaces4(String a) {
            if (a.isEmpty() == false) {  // метод "isEmpty()" проверяет (пустая/НЕ пустая) строка (false - НЕ пустая)
                a = a.replace(" ", ""); // метод "replace()" заменяет символы ("а" на "")

                return a;
            }

            return a = "Строка пустая";
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
        System.out.println(Metod.RemoveAlla2("    QA4Everyone   "));
        System.out.println(Metod.RemoveAlla2("panda   "));

        // 3

        System.out.println("3) ");
        System.out.println(Metod.RemoveAllZeros3("   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 "));
        System.out.println(Metod.RemoveAllZeros3(" 0000000111"));

        // 4

        System.out.println("4) ");
        System.out.println(Metod.RemoveAllSpaces4("    QA   4  Everyone   "));
        System.out.println(Metod.RemoveAllSpaces4("p a     n d a   "));
    }
}