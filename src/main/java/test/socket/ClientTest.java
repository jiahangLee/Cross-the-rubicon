package test.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by jiahang Lee on 2018/6/1.
 */
public class ClientTest {


    public static void main(String[] args){
        try {
            Socket client = new Socket("127.0.0.1",8888);
            new Thread(new HandleServerResponseMessage(client)).start();
            System.out.println("~接收消息已经交给其他线程处理");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(client.getOutputStream());
            StringBuffer msg = new StringBuffer();
            String s = "";
            while((s = br.readLine()) != null){
                msg.append(s);
            }
            pw.write(String.valueOf(msg));
            System.out.println("已发送消息");
            br.close();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
