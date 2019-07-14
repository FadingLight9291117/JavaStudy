/**
 * Thread方式创建线程：1.可以通过继承Thread类来创建线程；
 * 2.通过start()方法来启动线程的run方法
 *
 * @author 车亮召
 */
public class Thread1 extends Thread {
    public void run() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        new Thread1().start();
    }
}
