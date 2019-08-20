package List;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * ArrayList使用实例，以及三种遍历方法比较
 *
 * @author 车亮召
 */
public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        System.out.println(a.get(3));
        a.remove(3);// 删除第四个元素
        a.add(3, 9);// 将9插入到第4个元素，后面元素往后挪动
        System.out.println(a.get(3));
        System.out.println("======遍历方法======");
        ArrayList<Integer> b = new ArrayList<Integer>(100000);
        for (int i = 0; i < 100000; i++) {
            b.add(i);
        }
        boolean c;
        c = b.contains(2);
        // System.out.println(c);
        // traverByIterator(b);
        // traverByIndex(b);
        // traverByFor(b);
        a.add(null);
        for (Integer var : a) {
            System.out.println(var);
        }
        System.out.println(a);
    }

    public static void traverByIterator(ArrayList<Integer> a) {
        long startTime = System.nanoTime();
        System.out.println("======迭代器遍历=======");
        Iterator<Integer> iter1 = a.iterator();
        while (iter1.hasNext()) {
            Integer i = iter1.next();
            System.out.println(i);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(duration + "纳秒");
    }

    public static void traverByIndex(ArrayList<Integer> a) {
        long startTime = System.nanoTime();
        System.out.println("=====随机索引值遍历======");
        for (int i = 0; i < a.size(); i++) {
            a.get(i);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(duration + "纳秒");
    }

    public static void traverByFor(ArrayList<Integer> a) {
        long startTime = System.nanoTime();
        System.out.println("=====for循环遍历====");
        for (Integer item : a) {
            ;
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(duration + "纳秒");
    }
}