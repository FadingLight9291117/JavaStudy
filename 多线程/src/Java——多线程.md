## Java多线程创建

- java.lang.Thread
    - 线程继承Threa类，实行run方法
- java.lang.Runnable接口
    - 线程实现Runnable接口，实现run实现
    
## 多线程启动

- start方法，会自动以新进程调用run方法
    - 底层用JNI来实现。JNI，Java Native Interface,它提供了若干个API，可以使得java程序调用C/C++程序
- 直接调用run方法，将变成串行执行
- 同一个线程，多次start会报错，只执行第一次start方法
- 多个线程启动，其启动的先后顺序是随机的
- 线程无须关闭，只要其run方法执行结束，自动关闭
- main函数（线程）可能早于新线程结束，整个程序并不中止
- 整个程序终止时等所有线程都中止（包括main函数线程）
