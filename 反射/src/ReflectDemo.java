import java.util.Random;

public class ReflectDemo {
    public static void main(String[] args) {
        try {
            Class<?> c1 = Class.forName("java.util.Random");
            Object o = c1.newInstance();
            Class c2 = o.getClass();
            String str = c2.getName();
            System.out.println(str);
            Random random = new Random();
            int b = o.nextInt();
            System.out.println(b);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
