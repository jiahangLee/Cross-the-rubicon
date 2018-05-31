package test.thread;

/**
 * Created by jiahang Lee on 2018/5/31.
 */
public class Example7 extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
                System.out.println("睡眠1秒");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args){
        new Example7().start();
    }
}
