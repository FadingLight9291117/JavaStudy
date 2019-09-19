import test.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*通过Constructor的newInstance方法获得一个类的实例*/
public class ConstructorDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class c = Class.forName("test.Test");
        Constructor constructor = c.getConstructor(int.class);
        Test test = (Test) constructor.newInstance(11);
        System.out.println("test的j = "+test.getJ());

    }
}
