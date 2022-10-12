public class Main {
    public static void main(String[] args) {

        //Task1
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Аndroid по ссылке");
        }

        //Task2
        //Ниже  использовал вложенный оператор ветвления,не смог придумать,как обойтись без него, может через логического оператора..
        byte clientOS1 = 0;
        short clientDeviceYear = 2015;
        if (clientOS1 == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientOS1 == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Аndroid по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        //Task3

        int year = 2021;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " является високосным.");

        } else {
            System.out.println(year + " год не является високосным");
        }

        //Task4
        byte deliveryDistance = 95, day = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + day);
        } else if ((deliveryDistance >= 20) && (deliveryDistance < 60)) {
            System.out.println("Потребуется дней: " + (day + 1));
        } else if ((deliveryDistance >= 60) && (deliveryDistance < 100)) {
            System.out.println("Потребуется дней: " + (day + 2));
        } else {
            System.out.println("Нет доставки");
        }
        }

        //Task5
        byte monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Не существует");
        }
    }
}
