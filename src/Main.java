import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }
    public static void task3 () {
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "e");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя пользователя!");
        String name = scanner.next();
        System.out.println("Hello, " + name);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите t!");
        int t = scanner.nextInt();
        System.out.println("Температура воздуха сегодня: " + t + " градусов.");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день!");
        int day = scanner.nextInt();
        System.out.println("Введите месяц!");
        int month = scanner.nextInt();
        System.out.println("Введите год!");
        int year = scanner.nextInt();
        System.out.println(day + ":" + month + ":" + year + ".");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя пользователя!");
        String user = scanner.nextLine();
        System.out.println("Введите имя помощника!");
        String assistant = scanner.nextLine();
        System.out.println("Введите количество сообщений!");
        int message = scanner.nextInt();
        System.out.println("Привет, " + user + "! Это твой помощник " + assistant + ".");
        System.out.println("У тебя " + message + " новых писем.");
    }

}