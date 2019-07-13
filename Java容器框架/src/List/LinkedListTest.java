package List;

import java.util.LinkedList;

/**
 * LinkedList示例
 * 
 * @author 车亮召
 */
public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList<Integer>();
        a.add(0);
        a.add(1);
        a.add(2);
        a.addFirst(-1);
        a.addLast(-1);
        for (Integer var : a) {
            System.out.println(var);
        }
    }
}