public class Main {

    public static void main(String[] args) {

        System.out.println("Task 3");
        int year = 2021;

        if (year % 4 == 0 ) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println("Task 2");
        int clientOS = 1;
        int clientDeviceYear = 2015;

        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Task 4");
        int deliveryDistance = 95;

        if (deliveryDistance > 100 ) {
            System.out.println("Доставки на расстояние свыше 100 км нет");
        } else if (deliveryDistance > 60) {
            System.out.println("Для доставки потребуется дней :" + 3);
        } else if (deliveryDistance > 20) {
            System.out.println("Для доставки потребуется дней :" + 2);
        } else {
            System.out.println("Для доставки потребуется дней :" + 1);
        }

    }
}