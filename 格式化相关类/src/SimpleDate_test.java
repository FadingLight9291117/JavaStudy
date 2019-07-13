import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * SimpleDateFormat类的使用 工厂模式 parse格式化字符串为时间对象 format将时间格式化为字符串
 */
public class SimpleDate_test {

    public static void main(String[] args) {

        // 将时间对象格式化为字符串
        Calendar cal = Calendar.getInstance();
        Date now = cal.getTime();
        System.out.println(now);
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println(format.format(now));

        // 从字符串提取出日期
        String strDate = "2008-11-17";
        String pat = "yyyy-MM-dd";
        SimpleDateFormat format2 = new SimpleDateFormat(pat);
        Date d = null;
        try {
            d = format2.parse(strDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(d);

        System.out.println(now);
        java.sql.Date newDate = new java.sql.Date(now.getTime());
        System.out.println(newDate);
        System.out.println(format.format(newDate));
    }
}