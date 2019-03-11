package data.queue;

import data.array.Array;

/**
 * @Auther: jiahangLee
 * @Date: 2019/3/8 23:24
 * @Description: //TODO
 * @version: V1.0
 */
public class ArrayQueue<E> implements Queue<E> {
    private Array<E> array;
    public ArrayQueue(int capacity)  {
        array = new Array<E>(capacity);
    }
    public ArrayQueue() {
        array = new Array<E>();
    }
    public int getSize() {
        return array.getSize();
    }

    public boolean isEmpty() {
        return array.isEmpty();
    }

    public void enqueue(E e) {
        array.addLast(e);
    }

    public E dequeue() {
        return array.removeFirst();
    }

    public E getFront() {
        return array.getFirst();
    }
    public int getCapacity() {
        return array.getCapacity();
    }

    @Override
    public String toString() {
        return "ArrayQueue{" +
                "array=" + array +
                '}';
    }
}
