package test.socket;

import java.io.*;
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
                while(true) {
                    Socket s1 = ss.accept();
                    new Thread(new HandleServerResponseMessage(s1)).start();
                    PrintWriter pw = new PrintWriter(s1.getOutputStream(), true);
                    pw.println("Socket已连接");
                }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}