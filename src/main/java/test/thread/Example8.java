package test.thread;

/**
 * Created by jiahang Lee on 2018/5/31.
 */
public class Example8 implements Runnable {
    public void run() {
        for(int i=0; i<1000; i++) {
                System.out.println("副线程"+Thread.currentThread().getPriority()+"---"+i);
        }
    }
    public static void main(String[] args){

        Thread t = new Thread(new Example8());

        t.start();
        for(int j=0; j<1000; j++){
            Thread t2 = Thread.currentThread();
            t2.setPriority(2);
            System.out.println("主线程"+t2.getPriority()+"---"+j);
        }
    }
}
