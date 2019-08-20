/**
 * StringBuffer可变对象，加快String加法效率
 */
public class StringBuffer_test {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        sb.append("123");
        System.out.println(sb);
    }
}