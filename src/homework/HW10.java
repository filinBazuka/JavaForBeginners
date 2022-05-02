package homework;

public class HW10 {

    public class Metod {

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
    }

    public static void main(String[] args) {

        System.out.println(Metod.stroka1("    QA4Everyone   "));
        System.out.println(Metod.stroka1("QA4Everyone"));
        System.out.println(Metod.stroka1(""));
    }
}
