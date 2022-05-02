package homework;

public class HW5 {
    // 2
    public static String checkWeekDay(int a) {
        String weekDay = "";

        if (a == 1) {
            weekDay = "2) Понедельник.";
        }
        if (a == 2) {
            weekDay = "2) Вторник.";
        }
        if (a == 3) {
            weekDay = "2) Среда.";
        }
        if (a == 4) {
            weekDay = "2) Четверг.";
        }
        if (a == 5) {
            weekDay = "2) Пятница.";
        }
        if (a == 6) {
            weekDay = "2) Суббота.";
        }
        if (a == 7) {
            weekDay = "2) Воскресенье.";
        }
        if (a < 1 || a > 7) {
            weekDay = "2) Вы ввели неверное число.";
        }

        return weekDay;
    }

    // 3
    static public int findMax(int a, int b, int c) {
        int z = 0;
        if (a >= b) {
            if (a >= c) {
                z = a;
            } else {
                z = c;
            }
        }
        if (b >= a) {
            if (b >= c) {
                z = b;
            } else {
                z = c;
            }
        }
        return z;
    }

    // 4
    static public int findMin(int a, int b, int c) {
        int z = 0;
        if (a <= b) {
            if (a <= c) {
                z = a;
            } else {
                z = c;
            }
        }
        if (b <= a) {
            if (b <= c) {
                z = b;
            } else {
                z = c;
            }
        }
        return z;
    }

    // 5
    public static double averageTemperature(double a, double b, double c, double d, double e) {
        return (a + b + c + d + e) / 5;
    }

    // 6
    public static String decimalNumber1(double a) {
        double b = 0;
        b = (a - (int) a) * 100;
        //int c = Math.round(b);

        return (int) a + " руб. " + (int) b + " коп. ";
    }

    // 7
    public static String decimalNumber2(float a) {
        float b = 0;
        b = (a - (int) a) * 1000;
        int c = Math.round(b);

        return (int) a + " кг " + c + " гр ";
    }

    // 8
    public static double purchaseAmount(double a, int b) {

        return a * b;
    }

    // 9
    public static void checkPrint(double a, int b) {
        System.out.println("9) ");
        System.out.println("Хлеб");
        System.out.println("Цена за 1 шт.\t\t" + decimalNumber1(a));
        System.out.println("Количество товара\t" + b);
        System.out.println("____________________________________");
        System.out.println("Сумма к оплате\t\t" + purchaseAmount(a, b));

    }

    // 10
    public static int salaryPerMonth(int a, int b) {

        return a * 20 * b;
    }

    // 11
    public static void statement(String a, int b, int c) {
        System.out.println(a + "\t\t" + decimalNumber1(salaryPerMonth(b, c)));

    }

    // 12
    public static String negativePositiveZero(int x) {
        String a = "";
        if (x < 0) {
            a = "X is negative";
        } else {
            if (x > 0) {
                a = "X is positive";
            } else {
                a = "X is zero";
            }
        }
        return a;
    }

    // 13
    public static int luckyNumber(int a) {
        int sam = 0;
        int sam1 = 0;
        while (a != 0) {
            sam = sam + a % 10;
            a = a / 10;
        }
        if (sam > 9) {
            while (sam != 0) {
                sam1 = sam1 + sam % 10;
                sam = sam / 10;
            }
        } else {
            return sam;
        }
        return sam1;
    }

    // 14
    public static void median(int a, int b, int c) {
        double rez = 0;

        rez = (((double) a + b + c) / 3) - (Math.max(Math.min(a, b), Math.min(Math.max(a, b), c)));

        if (rez > 2) {
            System.out.println("14) Среднее значение " + (((double) a + b + c) / 3) + " отличается от медианы "
                    + (Math.max(Math.min(a, b), Math.min(Math.max(a, b), c))) + " на " + rez);
        } else {
            System.out.println("14) Среднее значение = " + (((double) a + b + c) / 3) + " , медиана = "
                    + (Math.max(Math.min(a, b), Math.min(Math.max(a, b), c))));
        }
    }

    // 15
    public static String roundingFloor(double a) {
        a = Math.floor(a);

        return decimalNumber1(a);
    }

    // 16
    public static double roundingCeil(int a, int b, int c) {
        double rez = 0;

        rez = Math.ceil(Math.sqrt(((a * b + c) * Math.pow(a, b))) / Math.PI);

        return rez;
    }

    // 18
    public static void getRandomNumber() {
        double a = Math.random();
        double step = (Math.random() * 11);
        double rez = Math.round(Math.pow(a, step));

        System.out.println("18) Число " + a + " в степени " + step + " = " + rez);
    }

    //19
    public static int getRandomNumber1() {

        return (int) (Math.random() * 99) + 1;
    }

    public static void main(String[] args) {

        int a = 3;
        int b = 4;
        int c = 20;
        double t1 = 36.5;
        double t2 = 36.7;
        double t3 = 37.5;
        double t4 = 38.3;
        double t5 = 39.1;
        double number1 = 16.99; // Почему когда больше 15 р. , то после "." бред
        float number2 = 123.373F;
        double price = 30.50;
        int thing = 5;
        int numberOfWorkingHoursPerDay = 8;
        int costOfOneHourOfWork1 = 150;
        int costOfOneHourOfWork2 = 320;
        String worker1 = "Смирнова Мария Ивановна ";
        String worker2 = "Серебряков Иван Петрович";
        int x = 0;
        int yearOfBirth = 1977;

        System.out.println(checkWeekDay(a));
        System.out.println("3) " + findMax(a, b, c));
        System.out.println("4) " + findMin(a, b, c));
        System.out.println("5) " + averageTemperature(t1, t2, t3, t4, t5));
        System.out.println("6) " +  decimalNumber1(number1));
        System.out.println("7) " + decimalNumber2(number2));
        System.out.println("8) " + purchaseAmount(price, thing));
        checkPrint(price, thing);
        System.out.println("10) " + salaryPerMonth(numberOfWorkingHoursPerDay, costOfOneHourOfWork1));
        System.out.println("11)");
        statement(worker1, numberOfWorkingHoursPerDay, costOfOneHourOfWork1);
        statement(worker2, numberOfWorkingHoursPerDay, costOfOneHourOfWork2);
        System.out.println("12) " + negativePositiveZero(x));
        System.out.println("13) Счастливое число : " + luckyNumber(yearOfBirth));
        median(a, b, c);
        System.out.println("15) " + roundingFloor(number1));
        System.out.println("16) " + roundingCeil(a, b, c));
        getRandomNumber();
        System.out.println("19) " + getRandomNumber1());
    }
}
