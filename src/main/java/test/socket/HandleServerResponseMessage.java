package test.socket;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;


/**
 * Created by jiahang Lee on 2018/6/1.
 */
public class HandleServerResponseMessage implements Runnable{
    private Socket socket;

    public HandleServerResponseMessage(Socket socket){
        this.socket = socket;
    }

    public void run(){

        try {
            Scanner scanner = new Scanner(socket.getInputStream());
            String str = null;
            while(true){
                while(scanner.hasNext()){
                str=scanner.nextLine();
                System.out.println("接收到的消息："+str);
            }}


        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();
    }
}
