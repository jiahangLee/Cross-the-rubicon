package data.link;

/**
 * @Auther: jiahangLee
 * @Date: 2019/3/13 00:03
 * @Description: //TODO
 * @version: V1.0
 */
public class QueueMain {
    public static void main(String[] args) {
        LinkedListQuere<Integer> linkedListQuere = new LinkedListQuere<Integer>();
        for(int i = 0;i<10;i++) {
            linkedListQuere.enqueue(i);
            System.out.println(linkedListQuere);
            if(i%3 == 2) {
                linkedListQuere.dequeue();
                System.out.println(linkedListQuere);
            }
        }
    }
}
