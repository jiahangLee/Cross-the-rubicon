package data.stack;

import data.array.Array;

/**
 * @Auther: jiahangLee
 * @Date: 2019/3/8 22:31
 * @Description: //TODO
 * @version: V1.0
 */
public class ArrayStack<E> implements Stack<E> {

    Array<E> array;
    public ArrayStack(int capacity) {
        array = new Array<E>(capacity);
    }
    public ArrayStack() {
        array = new Array<E>();
    }
    public int getSize() {
        return array.getSize();
    }

    public boolean isEmpty() {
        return array.isEmpty();
    }

    public void push(E e) {
        array.addLast(e);
    }

    public E pop() {
        return array.removeLast();
    }

    public E peek() {
        return array.getLast();
    }
    public int getCapacity() {
        return array.getCapacity();
    }

    @Override
    public String toString() {
        return "ArrayStack{" +
                "array=" + array +
                '}';
    }
}
