package 时间类;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Instant;
/**
 * Time_test
 */
public class Time_test {

    public static void main(String[] args) {
        // 当前日期
        LocalDate today = LocalDate.now();
        System.out.println(today);
        // 当前时间 时分秒纳秒
        LocalTime nowtime = LocalTime.now();
        System.out.println(nowtime);
        // 当前日期时间
        LocalDateTime dataTime = LocalDateTime.now();
        System.out.println(dataTime);
        // 当前时间戳
        Instant instant = Instant.now();
        System.out.println(instant);

    }
}