package test.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by jiahang Lee on 2018/5/28.
 */
public class Example2 {

    public static void main(String[] args){

        try {
            URL url  = new URL("http://39.106.212.43:9999/banner1.png");

            InputStream is = url.openStream();

            OutputStream os = new FileOutputStream("C:\\Users\\Lenov\\Desktop\\example.jpg");

            int i = 0;
            while(i != -1){
                i = is.read();
                os.write(i);
                System.out.println(i);
            }

            is.close();
            os.close();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


//        InputStream = new i
    }
}
