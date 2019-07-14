/**
 * 俩个线程Demo，两线程交替运行，没有规律
 *
 * @author 车亮召
 */
public class ThreadDemo {
    public static void main(String[] args) throws Exception {
        new TestThread1().start();
        while (true) {
            System.out.println("main thread is runing");
            Thread.sleep(1000);
        }
    }
}

class TestThread1 extends Thread {
    public void run() {
        while (true) {
            System.out.println("TestThread is runing ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
