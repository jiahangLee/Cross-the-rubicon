package test;

import org.apache.http.HttpConnection;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by jiahang Lee on 2018/5/30.
 */
public class Example5 {

    public static void main(String[] args) {

        try {
            Character();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        public static void Character() throws IOException {
        URL url = new URL("http://www.jiahanglee.club:8080/al.txt");
        BufferedReader br = null;
        BufferedWriter bw = null;
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"gbk"));
        bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\Lenov\\Desktop\\aaa19.txt")));
            System.out.println("ok");

        String str = null;
        while((str = br.readLine()) != null) {
            bw.write(str);
            System.out.println(str);
        }
        br.close();
        bw.close();
    }
}
