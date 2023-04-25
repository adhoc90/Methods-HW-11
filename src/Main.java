import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        determineLeapYear(2021);
        determineLeapYear(2220);
        defineAppVersion(1, 2023);
        defineAppVersion(0, 2011);
        showCardDeliveryDays(100);
        showCardDeliveryDays(1000);
    }

    public static void determineLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - год високосный");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    private static void defineAppVersion(int mobileOS, int mobileYear) {
        String mobileOsName = null;
        int currentYear = LocalDate.now().getYear();

        switch (mobileOS) {
            case 1:
                mobileOsName = "Android";
                break;
            case 0:
                mobileOsName = "iOS";
                break;
            default:
                System.out.println("ОС не определена");
        }
        if (mobileYear != currentYear) {
            System.out.println("Для OS - " + mobileOsName + " Установите облегчённую версию");
        } else {
            System.out.println("Для OS - " + mobileOsName + " Установите обычную версию");
        }
    }

    private static void showCardDeliveryDays(int distance) {
        int deliveryDays = deliveryDaysCalculation(distance);
        if (deliveryDays > 0) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }

    private static int deliveryDaysCalculation(int distance) {
        int deliveryDays;

        if (distance <= 20) {
            deliveryDays = 1;
        } else if (distance <= 60) {
            deliveryDays = 2;
        } else if (distance <= 100) {
            deliveryDays = 3;
        } else {
            deliveryDays = -1;
        }
        return deliveryDays;
    }
}
