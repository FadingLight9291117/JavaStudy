import java.util.Calendar;
import java.util.Date;

/**
 * Calendar_test
 */
public class Calendar_test {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        Date date = cal.getTime();
        System.out.println(date);
    }
}