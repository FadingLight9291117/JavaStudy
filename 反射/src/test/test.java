package test;

public class test {
    public static int i;
    static {
        int i = 10;
        test.i = i;
        System.out.println(i);
    }
}
