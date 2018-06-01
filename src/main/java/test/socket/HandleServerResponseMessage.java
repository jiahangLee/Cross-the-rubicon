package test.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

import static sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl.ThreadStateMap.Byte0.runnable;

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
            InputStream is = socket.getInputStream();
            byte[] buffer = new byte[1024];
            int length = 0;
            StringBuffer s = new StringBuffer();
            while( (length = is.read(buffer,0,buffer.length)) != -1){
                s.append(new String(buffer));
            }
            System.out.println("接收到: "+s);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();
    }
}
