import java.lang.reflect.Method;

public class MethodTest {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("java.lang.Math");
            Method m = c.getMethod("random");
            System.out.println(m.invoke(null));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
