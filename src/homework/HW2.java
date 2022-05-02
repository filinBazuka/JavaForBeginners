package homework;

public class HW2 {

    public static void main(String[] args) {

        int k = 4;
        int l = 7;
        int m = 12;

        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.print(k);
        System.out.print(l);
        System.out.println(m);
        System.out.println(k + ", " + l + ", " + m);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("m = " + m);
        System.out.println("Sum of k and l = " + (k + l));
        System.out.println("k * m = " + (k * m));
        System.out.println("Разность переменных l и m = " + (l - m));
        System.out.println("Результат деления k на l = " + (k / l)
                + ", а остаток от деления  = " + (k % l));
        System.out.println("Результат деления k на m = " + (k / m)
                + ", а остаток от деления  = " + (k % m));
        System.out.println("Результат деления l на m = " + (l / m)
                + ", а остаток от деления  = " + (l % m));
        System.out.println("Результат деления m на k = " + (m / k)
                + ", а остаток от деления  = " + (m % k));
        System.out.println("Результат деления l на k = " + (l / k)
                + ", а остаток от деления  = " + (l % k));
        System.out.println("Результат деления m на l = " + (m / l)
                + ", а остаток от деления  = " + (m % l));

        int apple = 40;
        int student = 6;

        System.out.println("Если " + apple + " яблок поделить на " + student
                + " учеников, то каждый ученик получит по " + (apple / student)
                + " яблок(a), и " + (apple % student)
                + " яблок(а) останется учителю.");

        apple = 100;
        student = 21;

        System.out.println("Если " + apple + " яблок поделить на " + student
                + " учеников, то каждый ученик получит по " + (apple / student)
                + " яблок(a), и " + (apple % student)
                + " яблок(а) останется учителю.");

        int sumKLM = k + l + m;
        int sumLKM = l + k + m;

        System.out.println("Сумма чисел k, l, m = " + sumKLM);
        System.out.println("Сумма чисел k, l, m++ и sumKLM-- = "
                + (k + l + m++ + sumKLM--) + ", а разность m++ и sumLKM = "
                + (m - sumLKM));

        int chet1 = 48;
        int chet2 = 8;

        System.out.println("Число " + chet1 + " кратно " + chet2 + " т.к. остаток = "
                + (chet1 % chet2));
        System.out.println("Число " + chet1 + " чётное, т.к. при делении на 2 остаток = "
                + (chet1 % 2));
        System.out.println("Число " + chet2 + " чётное, т.к. при делении на 2 остаток = "
                + (chet2 % 2));

        int nechet1 = 47;
        int nechet2 = 49;

        System.out.println("Число " + nechet1 + " нечётное, т.к. при делении на 2 есть остаток = "
                + (nechet1 % 2));
        System.out.println("Число " + nechet2 + " нечётное, т.к. при делении на 2 есть остаток = "
                + (nechet2 % 2));

        k = 4;
        l = 7;
        m = 12;
        double x = 2;
        double y = 3;
        double a = k;
        double b = l;
        double c = m;
        double d = y - x;
        double result21, result22, result23;

        result21 = (x + 3) * (x + 3);
        result22 = ((3 + 4 * x) / 5) - (10 * (y - 5) * (a + b + c) / x) + (9 * (4 / x + (9 + x) / y));
        result23 = (((5 * x + 7 * y) / (8 * x + 10 * y)) / ((3 * x - y) / (x + y))) /
                (a + b + c / d + (a + b) / (c + d) + a * b);

        String line = "_________________________________";
        String vert = "|";

        System.out.println(line);
        System.out.println(vert + " " + "21" + "\t" + vert + " " + result21 + "\t\t\t\t\t" + vert);
        System.out.println(line);
        System.out.println(vert + " " + "22" + "\t" + vert + " " + result22 + "\t\t\t\t\t" + vert);
        System.out.println(line);
        System.out.println(vert + " " + "23" + "\t" + vert + " " + result23 + "\t" + vert);

        System.out.println(line);


    }
}
