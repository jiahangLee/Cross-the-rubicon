package data.queue;

/**
 * @Auther: jiahangLee
 * @Date: 2019/3/8 23:22
 * @Description: //TODO
 * @version: V1.0
 */
public interface Queue<E> {

    int getSize();
    boolean isEmpty();
    void enqueue(E e);
    E dequeue();
    E getFront();
}
