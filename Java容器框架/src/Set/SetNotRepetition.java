package Set;

import java.text.MessageFormat;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * 三种集合的互异性实现
 *
 * @author 车亮召
 */

public class SetNotRepetition {
    public static void main(String[] args) {
        HashSet<Cat> hs = new HashSet<Cat>();
        hs.add(new Cat(1));
        hs.add(new Cat(1));
        hs.add(new Cat(2));
        for (Cat var : hs) {
            System.out.println(var);
        }

        TreeSet<tiger> ts = new TreeSet<tiger>();
        ts.add(new tiger(0));
        ts.add(new tiger(0));
        ts.add(new tiger(1));
        System.out.println(ts);
    }
}

/**
 * 一个用于HashSet和LinkedHashSet互异性比较的的类，复写了hascode和equals方法
 * 这三个方法是三位一体的：equals,hashCode,toString
 */
class Cat {
    private int i;

    public Cat(int i) {
        this.i = i;
    }

    public int getSize() {
        return this.i;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("=======equals======");
        return this.i == ((Cat) obj).getSize() ? true : false;
    }

    @Override
    public int hashCode() {
        System.out.println(i + "======hashCode=====");
        return this.i;
    }

    @Override
    public String toString() {
        String str = "第{0}只猫";
        Object[] arg = new Object[]{1};
        String value = MessageFormat.format(str, arg);
        return value;
    }
}

/**
 * 实现了Comparable的comparaTo方法,用于TreeSet中互异性比较
 */
class tiger implements Comparable {
    private int i;

    public tiger(int i) {
        this.i = i;
    }

    public int getSize() {
        return i;
    }

    @Override
    public int compareTo(Object o) {
        System.out.println(i + "====== compareTo======");
        return this.i - ((tiger) o).getSize();
    }
}