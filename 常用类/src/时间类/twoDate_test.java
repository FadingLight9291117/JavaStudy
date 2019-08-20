package 时间类;

import java.util.Date;
import java.util.Calendar;

/**
 * util.date和sql.date的区别
 */
public class twoDate_test {

    public static void main(String[] args) {
        java.util.Date Date1 = java.util.Calendar.getInstance().getTime();
        java.sql.Date Date2 = new java.sql.Date(Date1.getTime());
        System.out.println(Date1);
        System.out.println(Date2);
    }
}