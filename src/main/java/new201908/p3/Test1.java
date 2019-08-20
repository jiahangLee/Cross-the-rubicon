package new201908.p3;

/**
 * @Auther: jiahangLee
 * @Date: 2019/8/20 18:31
 * @Description: //TODO
 * @version: V1.0
 */
public class Test1 {

    public static void main(String[] args) {

        LoopQueue<Integer> queue = new LoopQueue<>();
        for(int i=0;i<12;i++){
            queue.enqueue(i);
            System.out.println(queue);

            if(i%4 == 2){
                queue.dequeue();
                System.out.println(queue+"  "+i);
            }
        }
    }
}
