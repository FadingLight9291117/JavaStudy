import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo {

    public static void main(String[] args) {
        try {
            String str = "java.util.Random";
            Class c1 = Class.forName(str);

            /*geFields() 获取类的全部字段*/
            Field[] f1 = c1.getFields();
            for (Field item : f1) {
                System.out.println(item.getName());
            }

            /*getMethods() 获取类的所有函数*/
            Method[] m1 = c1.getMethods();
            for (Method item : m1) {
                System.out.println(item.getName());
            }

            /*getConstructor()获取:构造函数*/
            Constructor[] cons = c1.getConstructors();
            for (Constructor item : cons) {
                System.out.println(item.getName());
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
