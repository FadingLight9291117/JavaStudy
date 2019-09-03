import java.util.Random;

/**
 * 获得Class类对象的三种方法
 */
public class ClassDemo {
    public static void main(String[] args) {
        Class c1 = int[].class;
        Class c2 = Random.class;

        Random random = new Random();
        Class c3 = random.getClass();

        try {
            String str = "java.util.Random";
            Class c4 = Class.forName(str);

            System.out.println(c1.getName() + '\n' + c2.getName() + '\n' + c3.getName() + '\n' + c4.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
