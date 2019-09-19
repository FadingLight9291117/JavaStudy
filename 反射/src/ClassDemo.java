import java.util.Random;

/**
 * 获得Class类对象的三种方法
 */
public class ClassDemo {
    public static void main(String[] args) {
        //第一种方式：通过类型
        Class c1 = int[].class;
        Class c2 = Random.class;

        // 第二种方式：通过对象
        Random random = new Random();
        Class c3 = random.getClass();

        try {
            // 第三种方式：通过字符串指出类路径
            String str = "java.util.Random";
            Class c4 = Class.forName(str);

            System.out.println(c1.getName() + '\n' + c2.getName() + '\n' + c3.getName() + '\n' + c4.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
