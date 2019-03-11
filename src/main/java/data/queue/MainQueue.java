package data.queue;

import java.util.Random;

/**
 * @Auther: jiahangLee
 * @Date: 2019/3/8 23:30
 * @Description: //TODO
 * @version: V1.0
 */
public class MainQueue {
    private static double testQueue(Queue<Integer> q,int opCount){
        long startTime = System.nanoTime();
        Random random = new Random();
        for(int i=0;i<opCount;i++) {
            q.enqueue(random.nextInt(Integer.MAX_VALUE));
        }
        for(int i=0;i<opCount;i++) {
            q.dequeue();
        }
        long endTime = System.nanoTime();
        return (endTime-startTime)/1000000000.0;
    }
    public static void main(String[] args) {
//        ArrayQueue<Integer> arrayQueue = new ArrayQueue<Integer>();
//        for (int i = 0; i < 5; i++) {
//            arrayQueue.enqueue(i);
//            if (i % 3 == 2)
//                arrayQueue.dequeue();
//            System.out.println(arrayQueue);
//        }
//        LoopQueue<Integer> arrayQueue = new LoopQueue<Integer>();
//        for (int i = 0; i < 10; i++) {
//            arrayQueue.enqueue(i);
//            if (i % 3 == 2)
//                arrayQueue.dequeue();
//            System.out.println(arrayQueue);
//        }
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<Integer>();
        double time1 = testQueue(arrayQueue,100000);
        System.out.println(time1);
        LoopQueue<Integer> loopQueue = new LoopQueue<Integer>();
        double time2 = testQueue(loopQueue,100000);
        System.out.println(time2);
    }
}
