/**
 * 这个类测试如何自定义异常类
 * 
 * @author 车亮召
 */
public class Exception_defindedbumyself extends Exception {

    public Exception_defindedbumyself() {
        super();
    }

    public Exception_defindedbumyself(String msg) {
        super(msg);
    }

    public static void main(String[] args) {
        try {
            throw new Exception_defindedbumyself("这是一个自定义异常");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}