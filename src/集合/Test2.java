package 集合;

import java.io.*;
import java.util.Properties;

public class Test2 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("name","tom");
        properties.setProperty("age","10");

        System.out.println(properties.getProperty("name"));

        OutputStream out = new FileOutputStream("my.properties");
        properties.store(out,"This is a comment");


        //假設事先已經存在一個文件,如db.properties
        Properties db = new Properties();
        db.load(new FileInputStream("db.properties"));
        //db.forEach((K, V) -> System.out.println(K + "=" + V));
        //输出同上,换种方式输出
        for(Object key : db.keySet()) {
            System.out.println(key + "=" + db.getProperty((String)key));
        }
    }
}
