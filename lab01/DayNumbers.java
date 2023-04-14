package lab01;
import java.util.Scanner;
public class DayNumbers{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int days = daysNumber(scan);
        System.out.println(days);
        scan.close();
    }    
    public static boolean leapYear(int year){
    
        boolean leap = false;
        
        if (year % 4 == 0){
            leap = true;
            if (year % 100 == 0){
                leap = false;
                if (year % 400 ==0){
                    leap = true;
                }
            
            }
        }
        return leap;
    }
    public static int daysNumber(Scanner scan) {
        
        String month = scan.nextLine();
        int days = 0;
        if (month.equals("January") || month.equals("Jan.") || month.equals("Jan") || month.equals("1")) {
            days = 31;
        } else if (month.equals("February") || month.equals("Feb.") || month.equals("Feb") || month.equals("2")) {
            if (leapYear(scan.nextInt())) {
                days = 29;
            } else {
                days = 28;
            }
        } else if (month.equals("March") || month.equals("Mar.") || month.equals("Mar") || month.equals("3")) {
            days = 31;
        } else if (month.equals("April") || month.equals("Apr.") || month.equals("Apr") || month.equals("4")) {
            days = 30;
        } else if (month.equals("May") || month.equals("5")) {
            days = 31;
        } else if (month.equals("June") || month.equals("Jun") || month.equals("6")) {
            days = 30;
        } else if (month.equals("July") || month.equals("Jul") || month.equals("7")) {
            days = 31;
        } else if (month.equals("August") || month.equals("Aug.") || month.equals("Aug") || month.equals("8")) {
            days = 31;
        } else if (month.equals("September") || month.equals("Sept.") || month.equals("Sep") || month.equals("9")) {
            days = 30;
        } else if (month.equals("October") || month.equals("Oct.") || month.equals("Oct") || month.equals("10")) {
            days = 31;
        } else if (month.equals("November") || month.equals("Nov.") || month.equals("Nov") || month.equals("11")) {
            days = 30;
        } else if (month.equals("December") || month.equals("Dec.") || month.equals("Dec") || month.equals("12")) {
            days = 31;
        }
        return days;
    }
}