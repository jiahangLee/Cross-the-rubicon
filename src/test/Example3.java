package test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by jiahang Lee on 2018/5/29.
 */
public class Example3 {

    public static void main(String[] args){

        try {
            URL url = new URL("http://39.106.212.43:9999/banner1.png");

            HttpURLConnection conn = (HttpURLConnection)url.openConnection();

            InputStream is = conn.getInputStream();

            OutputStream os = new FileOutputStream("C:\\Users\\Lenov\\Desktop\\example3.jpg");
            int i = 0;
            while( (i = is.read()) != -1){
                os.write(i);
            }
            is.close();
            os.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
