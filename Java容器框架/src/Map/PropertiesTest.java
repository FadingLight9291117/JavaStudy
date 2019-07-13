package Map;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Map.Entry;

/**
 * Properties示例程序
 * 
 * @author 车亮召
 */
public class PropertiesTest {

    public static void main(String[] args) throws Exception {
        String filePath = "file.Properties";
        // writeProperties(filePath, "1", "test", "This is a test");
        GetAllProperties(filePath);
    }

    public static void writeProperties(String filePath, String key, String value, String comments) throws Exception {
        File file = new File(filePath);
        if (!file.exists()) {
            file.createNewFile();
        }
        Properties pps = new Properties();
        InputStream in = new FileInputStream(file);
        // 从输入流中读取属性列表（键和元素树）
        // 强制要求属性键和值为String类型
        pps.load(in);
        OutputStream out = new FileOutputStream(file);

        pps.setProperty(key, value);
        // 以适合使用load方法加载到Properties表中的格式
        // 将此properties表中的属性列表（键和元素对）写入输出流
        pps.store(out, comments);
        out.close();
    }

    public static void GetAllProperties(String filePath) throws Exception {
        Properties pps = new Properties();
        InputStream in = new BufferedInputStream(new FileInputStream(filePath));
        pps.load(in);// 加载所有kv对

        Enumeration en = pps.propertyNames();

        while (en.hasMoreElements()) {
            String strKey = (String) en.nextElement();
            String strValue = pps.getProperty(strKey);
            // System.out.println("key:"+strKey+" value:"+strValue);
        }
    }
}