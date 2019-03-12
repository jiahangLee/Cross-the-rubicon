package data.link;

import data.stack.Stack;

/**
 * @Auther: jiahangLee
 * @Date: 2019/3/11 16:56
 * @Description: //TODO
 * @version: V1.0
 */
public class LinkedListStack<E> implements Stack<E> {

    private LinkedList<E> list;
    public LinkedListStack() {
        list  = new LinkedList<E>();
    }
    public int getSize() {
        return list.getSize();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void push(E e) {
        list.addFirst(e);
    }

    public E pop() {
        return list.removeFirst();
    }

    public E peek() {
        return list.getFirst();
    }

    @Override
    public String toString() {
        return "LinkedListStack{" +
                "list=" + list +
                '}';
    }
}
