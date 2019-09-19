import test.Test;

public class ClassDemo2 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 加载类时会执行静态代码块
        Class.forName("test.Test");
        //等价于 new test();
        int i = Test.i;
        System.out.println(i);
    }
}
