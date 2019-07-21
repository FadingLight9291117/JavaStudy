package List;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Vector使用，用Enumeration遍历
 *
 * @author 车亮召
 */
public class VectorTest {

    public static void main(String[] args) {
        Vector<Integer> a = new Vector<Integer>(100000);
        for (int i = 0; i < a.size(); i++) {
            a.add(i);
        }
        traverEnumeration(a);
    }

    public static void traverEnumeration(Vector<Integer> v) {
        System.out.println("=====Enumeration遍历======");
        long beginTime = System.nanoTime();
        for (Enumeration<Integer> enu = v.elements(); enu.hasMoreElements(); ) {
            enu.nextElement();
        }
        long endTime = System.nanoTime();
        long duringTime = endTime - beginTime;
        System.out.println(duringTime + "纳秒");
    }
}