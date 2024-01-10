import java.time.LocalDate;

public class Main {

    public static void printErorrText() {
        System.out.println("Год не может быть отрицательным!");
    }
    public static void checksTheYearIsLeap(int number) {
        if (number < 0) {
            printErorrText();
            return;
        }

        if (number % 4 == 0) {
            System.out.println(number + " год — високосный год");
        } else {
            System.out.println(number + " год — невисокосный год");
        }
    }

    public static void printRecommendationToInstall(int operationSystem , int clientDeviceYear) {
        if (clientDeviceYear < 0) {
            printErorrText();
            return;
        }
        if (operationSystem != 1 && operationSystem != 0) {
            System.out.println("Неизвестная операционная система!");
            return;
        }

        int currentYear = LocalDate.now().getYear();

        if (operationSystem == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (operationSystem == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (operationSystem == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (operationSystem == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void main(String[] args) {

        System.out.println("Task 1");
        int year = 2021;
        checksTheYearIsLeap(year);

        System.out.println("Task 2");
        int clientOS = 1;
        int clientDeviceYear = 2015;

        printRecommendationToInstall(clientOS, clientDeviceYear);


        System.out.println("Task 3");
        int deliveryDistance = 95;
        int daysDelivery = needDaysToDelivery(deliveryDistance);

        if (daysDelivery < 0) {
            System.out.println("Доставки на расстояние свыше 100 км нет");
        } else {
            System.out.println("Для доставки потребуется дней :" + daysDelivery);
        }

    }

    public static int needDaysToDelivery(int distance) {
        int days = 0;
        if (distance <= 20) {
            days = 1;
        } else if (distance <= 60) {
            days = 2;
        } else if (distance <= 100) {
            days = 3;
        }
        return days;
    }

}
