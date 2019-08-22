/**
 * 这个类测试如何自定义异常类
 * 
 * @author 车亮召
 */
public class Exception_defindedbymyself extends Exception {

    public Exception_defindedbymyself() {
        super();
    }

    public Exception_defindedbymyself(String msg) {
        super(msg);
    }

    public static void main(String[] args) {
        try {
            throw new Exception_defindedbymyself("这是一个自定义异常");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}