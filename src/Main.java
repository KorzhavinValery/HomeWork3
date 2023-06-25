public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
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

    public static void task2() {
        System.out.println("Задача 2");
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

    public static void task3() {
        System.out.println("Задача 3");
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short totalPages = 480;
        int totalStudents = ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        int pagesForStudent = (totalPages / totalStudents);
        System.out.println("На каждого ученика рассчитано " + pagesForStudent + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte capacity2Min = 16;
        int capacity = capacity2Min / 2;
        int capacityHour = capacity * 60;
        int capacity20Min = capacity * 20;
        System.out.println("За 20 минут машина произвела " + capacity20Min + " штук бутылок");
        int capacityDay = capacityHour * 24;
        System.out.println("За 1 день машина произвела " + capacityDay + " штук бутылок");
        int capacity3Days = capacityDay * 3;
        System.out.println("За 3 дня машина произвела " + capacity3Days + " штук бутылок");
        int capacityMonth = capacityDay * 30;
        System.out.println("За 1 месяц машина произвела " + capacityMonth + " штук бутылок");
    }

    public static void task5() {
        System.out.println("Задача 5");
        byte canOfPaint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int numberOfClasses = canOfPaint / (whitePaint + brownPaint);
        int totalWhitePaint = whitePaint * numberOfClasses;
        int totalBrownPaint = brownPaint * numberOfClasses;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + totalWhitePaint + " банок белой краски и "
                + totalBrownPaint + " банок коричневой краски");
    }

    public static void task6() {
        System.out.println("Задача 6");
        byte bananas = 5;
        byte bananasWeight = 80;
        int totalWeightBananas = bananas * bananasWeight;
        System.out.println("вес бананов " + totalWeightBananas + " грамм");
        short milk = 200;
        byte milkWeight100Ml = 105;
        double milkWeight = milkWeight100Ml / 100d;
        double totalWeightMilk = milk * milkWeight;
        System.out.println("вес молока " + totalWeightMilk + " грамм");
        byte iceCream = 2;
        byte iceCreamWeight = 100;
        int totalWeightIceCream = iceCreamWeight * iceCream;
        System.out.println("вес мороженого " + totalWeightIceCream + " грамм");
        byte eggs = 4;
        byte eggWeight = 70;
        int totalWeightEggs = eggWeight * eggs;
        System.out.println("вес яиц " + totalWeightEggs + " грамм");
        double totalWeightProduct = totalWeightEggs + totalWeightBananas + totalWeightMilk + totalWeightIceCream;
        double totalWeightProductKg = totalWeightProduct / 1000d;
        System.out.println("Общий вес такого завтрака составил " + totalWeightProduct + " грамм, или "
                + totalWeightProductKg + " кг!");
    }

    public static void task7() {
        System.out.println("Задача 7");
        byte target = 7;
        short firstWay = 250;
        float firstWeight = firstWay / 1000f;
        System.out.println("В день теряет " + firstWeight + " кг");
        short secondWay = 500;
        float secondWeight = secondWay / 1000f;
        System.out.println("В день теряет " + secondWeight + " кг");
        float totalDaysFirstWay = target / firstWeight;
        System.out.println("Потребуется " + totalDaysFirstWay + " дней, при трате 250 граммов веса в день!");
        float totalDaysSecondWay = target / secondWeight;
        System.out.println("Потребуется " + totalDaysSecondWay + " дней, при трате 500 граммов веса в день!");
    }

    public static void task8() {
        System.out.println("Задача 8");
        int monthSalaryMasha = 67760;
        int yearSalaryMasha = monthSalaryMasha * 12;
        float percentageAllowance = 0.1f;
        float monthSalaryMashaUp = monthSalaryMasha * percentageAllowance;
        float monthSalaryMashaNew = monthSalaryMashaUp + monthSalaryMasha;
        System.out.println("Текущая зарплата Маши " + monthSalaryMasha + " рублей. Годовой доход состовляет "
                + yearSalaryMasha + " рублей в год.");
        float yearSalaryMashaNew = monthSalaryMashaNew * 12;
        float yearSalaryMashaUp = monthSalaryMashaUp * 12;
        System.out.println("После увеличения зарплаты на 10%" +
                " Маша теперь получает  " + monthSalaryMashaNew + " рублей, что больше на " + monthSalaryMashaUp +
                " рублей в месяц. Годовой доход вырос на " + yearSalaryMashaUp +
                " рублей, и теперь составляет " + yearSalaryMashaNew + " рублей за год.");
        int monthSalaryDenis = 83690;
        int yearSalaryDenis = monthSalaryDenis * 12;
        float monthSalaryDenisUp = monthSalaryDenis * percentageAllowance;
        float monthSalaryDenisNew = monthSalaryDenisUp + monthSalaryDenis;
        System.out.println("Текущая зарплата Дениса " + monthSalaryDenis + " рублей. Годовой доход состовляет "
                + yearSalaryDenis + " рублей в год.");
        float yearSalaryDenisNew = monthSalaryDenisNew * 12;
        float yearSalaryDenisUp = monthSalaryDenisUp * 12;
        System.out.println("После увеличения зарплаты на 10%" +
                " Денис теперь получает  " + monthSalaryDenisNew + " рублей, что больше на "
                + monthSalaryDenisUp + " рублей в месяц. Годовой доход вырос на " + yearSalaryDenisUp +
                " рублей, и теперь составляет " + yearSalaryDenisNew + " рублей за год.");
        int monthSalaryKristina = 76230;
        int yearSalaryKristina = monthSalaryKristina * 12;
        float monthSalaryKristinaUp = monthSalaryKristina * percentageAllowance;
        float monthSalaryKristinaNew = monthSalaryKristinaUp + monthSalaryKristina;
        System.out.println("Текущая зарплата Кристины " + monthSalaryKristina + " рублей. Годовой доход состовляет "
                + yearSalaryKristina + " рублей в год.");
        float yearSalaryKristinaNew = monthSalaryKristinaNew * 12;
        float yearSalaryKristinaUp = monthSalaryKristinaUp * 12;
        System.out.println("После увеличения зарплаты на 10%" +
                " Кристина теперь получает  " + monthSalaryKristinaNew + " рублей, что больше на "
                + monthSalaryKristinaUp + " рублей в месяц. Годовой доход вырос на " + yearSalaryKristinaUp +
                " рублей, и теперь составляет " + yearSalaryKristinaNew + " рублей за год.");
    }
}