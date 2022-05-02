package lessons.school;

public class Teacher {

    public static void main(String[] args) {

        String fistName1 = "Мария Ивановна";
        String lastName1 = "Смирнова";
        int age1 = 35;
        String subject1 = "Русский язык и Литература";

        String line = "____________________________";

        String fistName2 = "Иван Петрович";
        String lastName2 = "Серебряков";
        int age2 = 55;
        String subject2 = "Учитель математики";

        System.out.println(line);
        System.out.println(fistName1);
        System.out.println(lastName1);
        System.out.println("Возраст : " + age1);
        //System.out.println(age1);
        System.out.println(subject1);
        System.out.println(line);

        System.out.println(line);
        System.out.println(fistName2);
        System.out.println(lastName2);
        System.out.print("Возраст : ");
        System.out.println(age2);
        System.out.println(subject2);
        System.out.println(line);
    }
}
