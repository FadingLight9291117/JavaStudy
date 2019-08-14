import com.sun.tools.javac.Main;

public class Demo {
    interface foo {
        void run();
    }

    static class fbb {
        void run(foo f) {
            f.run();
        }
    }

    public static void main(String[] args) {
        fbb a = new fbb();
        /*lambda表达式，简化传递接口参数，并实现抽象方法*/
        a.run(() -> System.out.println("Hello World1!"));
        /*简化简单线程的创建*/
        new Thread(() -> System.out.println("Hello World2!")).start();
        /*上面的Lambda表达式等同于下方常规写法*/
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World3!");
            }
        }).start();
    }
}
