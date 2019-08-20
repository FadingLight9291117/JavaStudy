/**
 * String == 比较的是对象指针，equals方法比较的是字符串内容
 */
public class String_test {

    public static void main(String[] args) {
        String s1 = new String("abc");
        var s2 = "abc";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}