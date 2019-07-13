package Set;

import java.util.HashSet;

/**
 * 这个类是HashSet示例
 *
 * @author 车亮召
 */
public class HashSetTest {

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(0);
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(1);// 3重复
        hs.add(null);
        System.out.println("size:" + hs.size());
        System.out.println(hs);
        if (!hs.contains(6)) {
            hs.add(6);
        }
        HashSet<Integer> hs2 = new HashSet<Integer>();
        hs2.addAll(hs);
        System.out.println(hs2);
        hs2.clear();// 清空
        hs2.add(2);
        hs2.add(3);
        hs2.add(0);
        hs2.add(-1);
        hs2.retainAll(hs);// 求交集
        System.out.println(hs2);
    }

    public static void traverByFor(HashSet<Integer> hs) {
        for (Integer var : hs) {
            System.out.println(var);
        }
    }
}