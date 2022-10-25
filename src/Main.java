public class Main {
    public  static int leapYear(){
        int years = 0;
        for( int year  = 1904; year <= 2096; year ++){
            if(year % 4==0 && year % 100 !=0 || year % 400 == 0){
                System.out.println(year + " год является вескосным");
            } else if(year % 4!=0 && year % 100 !=0 || year % 400 != 0  ){
                System.out.println(year + " год является не вескосным");
            }
        }
     return years;
    }
    public static void main(String[] args) {
        System.out.println("зачада 1");
        System.out.println(leapYear());
    }
}