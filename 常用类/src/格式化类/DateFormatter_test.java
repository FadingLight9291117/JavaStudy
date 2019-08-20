package 格式化类;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * DateFormatter类的使用
 */
public class DateFormatter_test {

    public static void main(String[] args) {

        // 将字符串转化为时间
        String dateStr = "2016年10月25日";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        LocalDate date = LocalDate.parse(dateStr, formatter);
        System.out.println(date);
        System.out.println("=================");
        // 将日期转化为字符串
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("zz");
        String nowStr = now.format(formatter2);
        System.out.println(nowStr);
    }
}
