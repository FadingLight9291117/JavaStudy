import java.text.MessageFormat;

/**
 * 字符串格式化类 例如将"Hello {1}"格式化为Hello World
 */
public class MessageFormat_test {

    public static void main(String[] args) {
        String message = "{0}{1}{2}";
        Object[] array = new Object[] { 'a', 2, 'C' };
        String value = MessageFormat.format(message, array);
        System.out.println(value);

        message = "{0,number,#.##} is a good number";
        array = new Object[] { 3.1415926 };
        value = MessageFormat.format(message, array);
        System.out.println(value);

    }
}