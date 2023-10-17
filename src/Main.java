public class Main {
    public static void main(String[] args) {

        //Задача 1

        System.out.println("Задача 1:");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();

        //Задача 2
/**
 * Использовал переменную clientOS из первой задачи
 */
        System.out.println("Задача 2:");
        var clientDeviceYear = 2015;
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();

        //Задача 3

        System.out.println("Задача 3:");
        var year = 2021;
        if (year > 1584 && year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println("Год " + year + " високосный");
        }
        else {
            System.out.println("Год " + year + " не високосный");
        }
        System.out.println();

        //Задача 4

        System.out.println("Задача 4:");
        int deliveryDistance = 101;
        int deliveryDays = 0;
        if (deliveryDistance < 20) {
            deliveryDays = 1;
        } else if (deliveryDistance >=20 && deliveryDistance < 60) {
            deliveryDays = 2;
        } else if (deliveryDistance >=60 && deliveryDistance < 100) {
            deliveryDays = 3;
        }
        if (deliveryDays == 0) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
        System.out.println();

        //Задача 5

        System.out.println("Задача 5:");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println("Winter");
                break;
            case 3, 4, 5:
                System.out.println("Spring");
                break;
            case 6, 7, 8:
                System.out.println("Summer");
                break;
            case 9, 10, 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Month number is incorrect");
        }
    }
}