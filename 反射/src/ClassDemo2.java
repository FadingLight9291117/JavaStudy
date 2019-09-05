import test.test;

public class ClassDemo2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("test.test");
        //等价于 new test();
        int i = test.i;
        System.out.println(i);
    }
}
