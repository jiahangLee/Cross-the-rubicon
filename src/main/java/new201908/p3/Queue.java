package new201908.p3;

/**
 * @Auther: jiahangLee
 * @Date: 2019/8/20 18:14
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
