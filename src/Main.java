public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
     /*
        task4();
        task5();
        task6();
        task7();
        task8();
       */
    }

    public static void task1 () {
        System.out.println("Задача 1");
       //Объявите переменные типа int, byte, short, long, float, double.
       // Выведите в консоль значение каждой переменной в формате «Значение переменной … с типом … равно …».
        byte a = 2;
            System.out.println("Значение переменной a с типом byte равно " + a);
        short b = 200;
            System.out.println("Значение переменной b с типом short равно " + b);
        int g = 40000;
            System.out.println("Значение переменной g с типом int равно " + g);
        long d = 7777L;
            System.out.println("Значение переменной d с типом long равно " + d);
        float e = 3.5f;
            System.out.println("Значение переменной e с типом float равно " + e);
        double f = 1.7d;
            System.out.println("Значение переменной f с типом double равно " + f);

    }

    public static void task2 () {
        System.out.println("Задача 2");
        //Инициализируйте переменные
        // 27.12
        //987 678 965 549
        //2.786
        //569
        //-159
        //27897
        //67

        byte apples = 67;
            System.out.println("Значение переменной apples с типом byte равно " + apples + " штук");
        short bananas = 569;
            System.out.println("Значение переменной bananas с типом short равно " + bananas + " штук");
        short temperature = -159;
            System.out.println("Значение переменной temperature с типом short равно " + temperature + " градусов");
        int distance = 27897;
            System.out.println("Значение переменной distance с типом int равно " + distance + " км");
        long numbers = 987678965549L;
            System.out.println("Значение переменной numbers с типом long равно " + numbers);
        float decimal = 27.12f;
            System.out.println("Значение переменной decimal с типом float равно " + decimal);
        double value = 2.786d;
            System.out.println("Значение переменной value с типом double равно " + value);
    }

    public static void task3 () {
        System.out.println("Задача 3");
        //Три школьных учителя, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
        //
        //У Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников, у Екатерины Андреевны — 30 учеников.
        //
        //Три учительницы закупили все вместе 480 листов бумаги на все три класса. Посчитайте, сколько достанется листов каждому ученику.
        //
        //Результат задачи выведите в консоль в формате: «На каждого ученика рассчитано … листов бумаги».
        //
        //Для объявления переменных не используйте тип var.
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short totalPages = 480;
        int totalStudents = ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        int pagesForStudent = (totalPages / totalStudents);
        System.out.println("На каждого ученика рассчитано " + pagesForStudent + " листов бумаги");
    }
/*
    public static void task4 () {
        System.out.println("Задача 4");
        ... // Пишем код для задачи 4
    }
    public static void task5 () {
        System.out.println("Задача 5");
        ... // Пишем код для задачи 5
    }

    public static void task6 () {
        System.out.println("Задача 6");
        ... // Пишем код для задачи 6
    }
    public static void task7 () {
        System.out.println("Задача 7");
        ... // Пишем код для задачи 7
    }

    public static void task8 () {
        System.out.println("Задача 8");
        ... // Пишем код для задачи 8
    }
    */
}