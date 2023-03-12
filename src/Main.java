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
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + salary;
            i = i + 1;
            System.out.println("Месяц " + i + " Сумма накоплений равна " + total);
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        int start = 1;
        while (start <= 10) {
            System.out.print(start);
            start = start + 1;
        }
        System.out.println();
        for (int i = 10; i >= 0; i--) {
            System.out.print(i);

        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12000000;
        int born = 17;
        int death = 8;
        int difference = born - death;
        int year = 0;
        while (year < 10) {
            population = population + difference;
            year = year + 1;
            System.out.println("Год " + year + " численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int count = 15000;
        int total = 0;
        int month = 1;
        while (total < 12_000_000) {
            total = total + (total / 100 * 7);
            total = total + count;
            month = month + 1;
            System.out.println("Месяц " + month + " Сумма накоплений равна " + total);
        }

    }

    public static void task5() {
        System.out.println("Задача 6");
        int sum = 15000;
        int month = 0;
        while (month <= 9 * 12) {
            sum = sum + (sum / 100 * 7);
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " Итого " + sum);
            }

        }
    }

    public static void task6() {
        System.out.println("Задача 5");
        int count = 15000;
        int total = 0;
        int month = 1;
        while (total < 12_000_000) {
            total = total + (total / 100 * 7);
            total = total + count;
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " Сумма накоплений равна " + total);
            }

        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int firstFriday = 5;
        for (int i = firstFriday; i <= 31; i = i + 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
            }

        }
    public static void task8() {
        System.out.println("Задача 8");
        int year = 0;
        for (int i = year; i <= 2100; i = i + 79) {
            System.out.println(i);
        }

    }
}






