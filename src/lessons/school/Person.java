package lessons.school;

public class Person {

    public static void main(String[] args) {

        int yob = 1977;

        System.out.println();
        System.out.print("Если человек родился в ");
        System.out.print(yob);
        System.out.print(" году, то его возраст - разница между 2020 и ");
        System.out.print(yob);
        System.out.print(" состовляет ");
        System.out.print(2020 - yob);
        System.out.println(" года/лет.");
    }
}
