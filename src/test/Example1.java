package test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by jiahang Lee on 2018/5/23.
 */
public class Example1 {
    public static void main(String[] args){
        try {
            //声明魔法值
            URL url = new URL("http://39.106.212.43:9999/banner1.png");
            //打开连接
            URLConnection conn = url.openConnection();

//            conn.setRequestProperty("User-Agent", "Mozilla/4.0(compatible;MSIE 5.0;Windows NT;DigExt)");
            //打开输入流
            InputStream is = conn.getInputStream();

            //打开输出流
            OutputStream os = new FileOutputStream("C:\\Users\\Lenov\\Desktop\\aaa9.jpg");

//////////////////////////////////////////////////////////////////////////////////////////////////////
//            int i=0;
//            while(i != -1){
//                i = is.read();
//                os.write(i);
//                System.out.println(i);
//            }
/////////////////////////////////////////////////////////////////////////////////////////////////////
            byte[] buffer = new byte[2048];
            int length = 0;
            while((length = is.read(buffer,0,buffer.length)) != -1){
                os.write(buffer,0,length);
                System.out.println("--"+buffer.length);
                System.out.println("++"+length);
            }

            is.close();
            os.close();
/////////////////////////////////////////////////////////////////////////////////////////////////////
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
