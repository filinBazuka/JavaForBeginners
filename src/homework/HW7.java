package homework;

public class HW7 {

    // 18 Написать метод, который принимает на вход массив int, и возвращает среднее значение.
    // Проверить работу метода тестом, если параметр - массив catsAges
    public static double sred(int[] catsAges) {
        double sum = 0;
        for (int i = 0; i < catsAges.length; i++) {
            sum += catsAges[i];
        }

        return sum / catsAges.length;
    }

    // 21 Создать метод, который принимает на вход массив int,  и возвращает минимальное значение,
    // максимальное значение и среднее значение всех чисел массива. Проверить работу метода на
    // массиве из задания 20.
    public static int min(int[] minZnak) {
        int min = minZnak[0];
        for (int i = 0; i < 10; i++) {
            if (min > minZnak[i]) {
                min = minZnak[i];
            }
        }

        return min;
    }

    public static int max(int[] maxZnak) {
        int max = maxZnak[0];
        for (int i = 0; i < 10; i++) {
            if (max < maxZnak[i]) {
                max = maxZnak[i];
            }
        }

        return max;
    }

    public static double sred1(int[] sredZnach) {
        double sum = 0;
        for (int i = 0; i < sredZnach.length; i++) {
            sum += sredZnach[i];
        }

        return sum / sredZnach.length;
    }

    public static void main(String[] args) {

        // 1
        String[] catsNames = {"Мурзик", "Бетмен", "Мурка", "Васька", "Ржавый", "Дымка", "Патрик", "Зорро"};

        // 2
        catsNames[1] = "Черныш";
        catsNames[4] = "Рыжик";

        // 3
        String[] catsColors = {"Серый", "Чёрный", "Серый", "Коричневый", "Красный", "Серый", "Красный", "Серый"};

        // 4
        int[] catsAges = {2, 3, 4, 1, 5, 6, 9, 10};

        // 5
        String[] isCatRed = new String[8];
        for (int i = 0; i < 8; i++) {
            if (catsColors[i] == "Красный") {
                isCatRed[i] = "Красный";
            } else {
                isCatRed[i] = "Null";
            }
        }

        // 6
        System.out.println("6) ");
        System.out.println(catsNames[6] + "  " + catsColors[6]);
        for (int i = 0; i < 8; i++) {
            if (i == 0) {
            } else if (i % 2 == 0) {
                System.out.print(catsNames[i] + "  ");
            }
        }
        System.out.println();
        for (int i = 0; i < 8; i++) {
            if (i == 0) {
            } else if (i % 4 == 0) {
                System.out.print(catsNames[i] + "  ");
            }
        }
        System.out.println();
        for (int i = 0; i < 8; i++) {
            if (i == 0) {
            } else if (i % 2 != 0) {
                System.out.print(catsColors[i] + "  ");
            }
        }
        System.out.println();
        for (int i = 0; i < 8; i++) {
            if (i == 0) {
            } else if (i % 3 == 0) {
                System.out.print(catsColors[i] + "  ");
            }
        }

        // 7 Распечатать “Накорми кота!” для всех серых котов
        System.out.println();
        System.out.print("7) ");
        for (int i = 0; i < 8; i++) {
            if (catsColors[i] == "Серый") {
                System.out.print("Накорми кота! ");
            }
        }

        // 8 Распечатать “Отнеси кота на прививку!”, если возраст кота меньше 2 лет
        System.out.println();
        System.out.print("8) ");
        for (int i = 0; i < 8; i++) {
            if (catsAges[i] < 2) {
                System.out.print("Отнеси кота на прививку! ");
            }
        }

        // 9 Для кота в последней коробке распечатать имя, цвет, возраст
        System.out.println();
        System.out.print("9) ");
        System.out.print(catsNames[catsNames.length - 1] + "  " + catsColors[catsColors.length - 1]
                + "   " + catsAges[catsAges.length - 1]);

        // 10 Распечатать имена всех котов, чей возраст больше 2 лет
        System.out.println();
        System.out.print("10) ");
        for (int i = 0; i < 8; i++) {
            if (catsAges[i] > 2) {
                System.out.print(catsNames[i] + "   ");
            }
        }

        // 11 Распечатать “Накорми кота!” если имя кота “Рыжик” и значение isCatRed == true
        System.out.println();
        System.out.print("11) ");
        for (int i = 0; i < 8; i++) {
            if (catsNames[i] == "Рыжик" && isCatRed[i] == "Красный") {
                System.out.print("Накорми кота! ");
            }
        }

        // 12 Распечатать средний возраст котов из массива catsAges
        System.out.println();
        System.out.print("12) ");
        int sum = 0;
        for (int i = 0; i < 8; i++) {
            sum += catsAges[i];
        }
        System.out.print(sum * 1.0 / catsAges.length);

        // 13 Распечатать возраст самого молодого кота
        System.out.println();
        System.out.print("13) ");
        int youngCat = catsAges[0];
        for (int i = 0; i < 8; i++) {
            if (youngCat > catsAges[i]) {
                youngCat = catsAges[i];
            }
        }
        System.out.print(youngCat);

        // 14 Распечатать возраст самого старого кота
        System.out.println();
        System.out.print("14) ");
        int oldCat = catsAges[0];
        for (int i = 0; i < 8; i++) {
            if (oldCat < catsAges[i]) {
                oldCat = catsAges[i];
            }
        }
        System.out.print(oldCat);

        // 15 Распечатать количество серых котов
        System.out.println();
        System.out.print("15) ");
        int count = 0;
        for (int i = 0; i < 8; i++) {
            if (catsColors[i] == "Серый") {
                count++;
            }
        }
        System.out.print(count);

        // 16 Распечатать имя кота, если кот находится в коробке с четным индексом и
        // его возраст не больше 3 лет
        System.out.println();
        System.out.print("16) ");
        for (int i = 0; i < 8; i++) {
            if (catsColors[i] == "Чёрный" && catsAges[i] <= 3) {
                System.out.print(catsNames[i] + "   ");
            }
        }

        // 17 Создать массив четных положительных чисел, значения которых не больше 10.
        // (заполняем значения с помощью цикла for)
        System.out.println();
        System.out.print("17) ");

        count = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        int[] chet = new int[count];
        count = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                chet[count] = i;
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.print(chet[i] + "   ");
        }

        // 18 Написать метод, который принимает на вход массив int, и возвращает среднее значение.
        // Проверить работу метода тестом, если параметр - массив catsAges
        System.out.println();
        System.out.print("18) ");
        System.out.print(sred(catsAges) + "  ");

        // 19 Создать массив нечетных отрицательных чисел в промежутке от -1000 до -900
        System.out.println();
        System.out.print("19) ");
        count = 0;
        for (int i = -1000; i <= -900; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }
        int[] nechet = new int[count];
        count = 0;
        for (int i = -1000; i <= -900; i++) {
            if (i % 2 != 0) {
                nechet[count] = i;
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.print(nechet[i] + "  ");
        }

        // 20 Создать массив из 10 случайных положительных целых чисел
        System.out.println();
        System.out.print("20) ");
        int[] randomPositiveIntegers = new int[10];
        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * 101);
            if (random != 0) {
                System.out.print((randomPositiveIntegers[i] = random) + "  ");
            } else {
                i--;
            }
        }

        // 21 Создать метод, который принимает на вход массив int,  и возвращает минимальное значение,
        // максимальное значение и среднее значение всех чисел массива. Проверить работу метода на
        // массиве из задания 20.
        System.out.println();
        System.out.print("21) ");
        System.out.print(min(randomPositiveIntegers) + "  ");
        System.out.print(max(randomPositiveIntegers) + "  ");
        System.out.print(sred1(randomPositiveIntegers) + "  ");

        // 22 Создать массив четных чисел и массив нечетных чисел из элементов массива из задания 20.
        System.out.println();
        System.out.print("22) ");
        count = 0;
        for (int i = 0; i < randomPositiveIntegers.length; i++) {
            if (randomPositiveIntegers[i] % 2 == 0) {
                count++;
            }
        }
        int[] chet20 = new int[count];
        count = 0;
        for (int i = 0; i < randomPositiveIntegers.length; i++) {
            if (randomPositiveIntegers[i] % 2 == 0) {
                chet20[count] = randomPositiveIntegers[i];
                count++;
            }
        }
        for (int i = 0; i < chet20.length; i++) {
            System.out.print(chet20[i] + "   ");
        }
        System.out.print("|   ");
        count = 0;
        for (int i = 0; i < randomPositiveIntegers.length; i++) {
            if (randomPositiveIntegers[i] % 2 != 0) {
                count++;
            }
        }
        int[] neChet20 = new int[count];
        count = 0;
        for (int i = 0; i < randomPositiveIntegers.length; i++) {
            if (randomPositiveIntegers[i] % 2 != 0) {
                neChet20[count] = randomPositiveIntegers[i];
                count++;
            }
        }
        for (int i = 0; i < neChet20.length; i++) {
            System.out.print(neChet20[i] + "   ");
        }

        // 23 Создать двумерный массив, который состоит из имен, возрастов, цветов котов:
        // Распечатать все данные котов в коробках с четными индексами, используя двумерный массив.
        System.out.println();
        System.out.println("23) ");
        //String[][] massiv2D = {{"Мурзик", "Черныш", "Мурка", "Васька", "Рыжик", "Дымка", "Патрик", "Зорро"},
        //        {"  2  ", "  3  ", "  4  ", "  1  ", "  5  ", "  6  ", "  9  ", "  10  "},
        //        {"Серый", "Чёрный", "Серый", "Коричневый", "Красный", "Серый", "Красный", "Серый"}};
        //for (int i = 0; i < 8; i++) {
        //    if (i != 0 && i % 2 == 0) {
        //        for (int j = 0; j < 3; j++) {
        //            System.out.print(massiv2D[j][i] + "\t");
        //        }
        //    } else if (i % 2 != 0 && i != 1 && i != 7) {
        //        System.out.println();
        //    }
        //}
        String[][] massiv2D = {{"Мурзик", "  2  ", "Серый"},
                {"Черныщ", "  3  ", "Чёрный"},
                {"Мурка", "  4  ", "Серый"},
                {"Васька", "  1  ", "Коричневый"},
                {"Рыжик", "  5  ", "Красный"},
                {"Дымка", "  6  ", "Серый"},
                {"Патрик", "  9  ", "Красный"},
                {"Зорро", "  10  ", "Серый"}};
        for (int i = 0; i < 8; i++) {
            if (i != 0 && i % 2 == 0) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(massiv2D[i][j] + "\t");
                }
            } else if (i % 2 != 0 && i != 1 && i != 7) {
                System.out.println();
            }
        }

        // 24 Создать двумерный массив целых случайных чисел от 1 до 10 размерности 4*8.
        System.out.println();
        System.out.print("24) ");
        int[][] randomNumbers2D = new int[4][8];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                randomNumbers2D[i][j] = (int) (Math.random() * 10) + 1;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(randomNumbers2D[i][j] + " ");
            }
        }

        // 25  Вывести сумму всех четных чисел массива из задания 24.
        System.out.println();
        System.out.print("25) ");
        int samChet = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                if (randomNumbers2D[i][j] % 2 == 0) {
                    samChet += randomNumbers2D[i][j];
                    System.out.print(randomNumbers2D[i][j] + " ");

                }
            }
        }
        System.out.println();
        System.out.println(samChet);


    }
}
