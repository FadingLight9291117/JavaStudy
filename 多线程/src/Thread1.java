/**
 * Thread方式创建线程：1.可以通过继承Thread类来创建线程；
 * 2.通过start()方法来启动线程的run方法
 *
 * @author 车亮召
 */
public class Thread1 extends Thread {           // 继承Thread，实现run()方法
    public void run() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        new Thread1().start();                  // 通过start()方法启动线程，若使用run()则不会并发执行
        new Thread(new Thread2()).start();      // 启动实现Runnable接口的线程类
    }
}

class Thread2 implements Runnable{              // 实现Runnale接口

    @Override
    public void run() {
        System.out.println("world");
    }
}
