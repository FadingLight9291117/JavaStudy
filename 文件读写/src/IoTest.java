import java.io.File;

/**
 * IoTest
 */
public class IoTest {

    public static void main(String[] args) {
        File file = new File("file");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}