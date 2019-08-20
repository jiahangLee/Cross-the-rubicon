package new201908.p2;

/**
 * @Auther: jiahangLee
 * @Date: 2019/8/20 17:35
 * @Description: //TODO
 * @version: V1.0
 */
public interface Stack<E>{

    int getSize();
    boolean isEmpty();
    void push(E e);
    E pop();
    E peek();
}
