package 工具类;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Comparator用法示例
 */
public class ComparatorTest {

    public static void main(String[] args)throws Exception {
        ArrayList a = new ArrayList<Persion>();
        a.add(new Persion(1));
        a.add(new Persion(0));
        a.add(new Persion(3));
        Collections.sort(a, new PersionComparator());
        System.out.println(a);
    }
}

class Persion {
    private Integer a;

    public Persion(Integer a) {
        this.a = a;
    }

    public Integer getA() {
        return a;
    }

    @Override
    public String toString() {
        return a.toString();
    }
}

class PersionComparator implements Comparator<Persion> {
    @Override
    public int compare(Persion o1, Persion o2) {
        return o1.getA() - o2.getA();
    }
}