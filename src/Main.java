import java.time.LocalDate;

public class Main {


    public static int nowYears(){
        int currentYear = LocalDate.now().getYear();
       return currentYear;
    }
    public static boolean getClientOS(String name) {
        if (name.equals("iOS")) {
            return true;
        } else  {
            return false;
        }


    }


    public static void printlnLeapYear() {
        int year = 1904;
        for (; year <= 2096; year++) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {

                System.out.println(year + " год является вескосным");
            } else if (year % 4 != 0 && year % 100 == 0 || year % 400 != 0) {
                System.out.println(year + " год является не вескосным");
            }
        }



    }
    public  static int dayDistanceDelivery(int deliveryDistance){
        int day = 0;
        if (deliveryDistance<= 20){
            day = day +1;
        } else if (deliveryDistance>= 20 && deliveryDistance<=60) {
            day = day +2;

        } else if (deliveryDistance>= 60 && deliveryDistance<=100) {
            day = day +3;
        }
        return day;
    }
    public static void main(String[] args) {
        System.out.println("задача 1");
        printlnLeapYear();
        System.out.println("задача 2");
        String osName = "iOS";
        boolean clientOS = getClientOS(osName);
        int yearsMobile = nowYears();
        if (clientOS == true){
            System.out.println( " нужно установить версию для IOS");
        } if (clientOS == false){
            System.out.println( " нужно установить версию для Android");
        } else if (yearsMobile <2022){
            System.out.println( " нужно установить lite версию");
        }
        System.out.println("задача 3");
        int deliveryDistance = 95;
        int day = dayDistanceDelivery(deliveryDistance);
        System.out.println(day + "  дней нужно на доставку");
    }



}



