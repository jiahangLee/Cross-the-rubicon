package test.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by jiahang Lee on 2018/6/1.
 */
public class ServerTest {
    public static void main(String[] args) {

            ServerSocket ss = null;

        try {
            ss = new ServerSocket(8888);
            while (true) {
                Socket s1 = ss.accept();
                new Thread(new HandleServerResponseMessage(s1));
                PrintWriter pw = new PrintWriter(new OutputStreamWriter(s1.getOutputStream()));
                pw.write("已接收");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}