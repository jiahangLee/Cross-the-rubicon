package data.stack;

/**
 * @Auther: jiahangLee
 * @Date: 2019/3/8 22:29
 * @Description: //TODO
 * @version: V1.0
 */
public interface Stack<E> {
    int getSize();
    boolean isEmpty();
    void push(E e);
    E pop();
    E peek();
}
