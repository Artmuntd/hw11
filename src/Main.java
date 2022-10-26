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

    public static void main(String[] args) {

        printlnLeapYear();
        System.out.println("задача 2");
        String osName = "iOS";
        boolean clientOS = getClientOS(osName);
        int yearsMobile = nowYears();
        if (clientOS == true){
            System.out.println(true + " нужно установить версию для IOS");
        } else {
            System.out.println(false + " нужно установить версию для Android");
        }


    }



}



