package Map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Hashtable示例
 */
public class HashtableTest {

    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        ht.put(1, "123");
        ht.put(1, "123");
        ht.put(2, "abc");
        // ht.put(3,null);
        System.out.println(ht);
        ht.clear();
        for (int i = 0; i < 100000; i++) {
            ht.put(i, "aaa");
        }
        traverByEntry(ht);
        traverByKeySet(ht);
        traverByEnumeration(ht);
    }

    /**
     * 根据Entry迭代器遍历
     *
     * @param ht
     */
    public static void traverByEntry(Hashtable<Integer, String> ht) {
        long startTime = System.nanoTime();
        System.out.println("================Entry迭代器遍历=========");
        Integer key;
        String value;
        Iterator<Entry<Integer, String>> iter = ht.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<Integer, String> entry = iter.next();
            // 获取Key
            key = entry.getKey();
            // 获取value
            value = entry.getValue();
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(duration + "纳秒");
    }

    /**
     * 根据的key的Iterator遍历
     *
     * @param ht
     */
    public static void traverByKeySet(Hashtable<Integer, String> ht) {
        long startTime = System.nanoTime();
        System.out.println("=============KeySet迭代器遍历===========");
        Integer key;
        String value;
        Iterator<Integer> iter = ht.keySet().iterator();
        while (iter.hasNext()) {
            key = iter.next();
            value = ht.get(key);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(duration + "纳秒");
    }

    /**
     * 根据key的Enumeration的迭代器遍历
     *
     * @param ht
     */
    public static void traverByEnumeration(Hashtable<Integer, String> ht) {
        long startTime = System.nanoTime();
        System.out.println("=======KeyEnumeration迭代器遍历==========");
        Integer key;
        String value;
        Enumeration<Integer> keys = ht.keys();
        while (keys.hasMoreElements()) {
            key = keys.nextElement();
            value = ht.get(key);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(duration + "纳秒");
    }
}