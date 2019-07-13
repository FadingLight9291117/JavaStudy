package 工具类;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Conllections示例程序
 */
public class CollectionsTest {

    public static void main(String[] args) {
        List a = new ArrayList<Integer>();
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            a.add(r.nextInt());
        }
        a.add(0);
        // 原列表
        System.out.println(a);
        // 排序
        Collections.sort(a);
        System.out.println(a);
        // 二分查找，要先排序
        System.out.println(Collections.binarySearch(a, 0));
        // 反序
        Collections.reverse(a);
        System.out.println(a);
        // 批量赋值
        Collections.fill(a, 10);
        System.out.println(a);

    }
}