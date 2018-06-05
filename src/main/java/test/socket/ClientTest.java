package test.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by jiahang Lee on 2018/6/1.
 */
public class ClientTest {


    public static void main(String[] args){
        try {
            Socket client = new Socket("127.0.0.1",8888);
            new Thread(new HandleServerResponseMessage(client)).start();
            System.out.println("~接收消息已经交给其他线程处理");
            PrintWriter pw = new PrintWriter(client.getOutputStream(),true);
            StringBuffer msg = new StringBuffer();
            String s = "";

//                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                s = br.readLine();
//                    System.out.println(s);
//                    msg.append(s);
//                    br.close();
            Scanner scanner =new Scanner(System.in);//键盘输入
            while(scanner.hasNextLine()){
                pw.println(scanner.nextLine());//将从键盘输入的数据发送出去
                System.out.println("已发送消息");
            }




        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}

