package test;

public class Test {
    public static int i;
    private int j;
    public Test(int j) {
        this.j = j;
    }
    public int getJ() {
        return this.j;
    }
    static {
        int i = 10;
        Test.i = i;
        System.out.println(i);
    }
}
