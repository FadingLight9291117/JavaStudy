package Map;

import java.util.HashMap;

/**
 * HashMapTest
 */
public class HashMapTest {

    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, null);
        hm.put(null, "asv");
        hm.put(2, "123");
        System.out.println(hm);
    }
}