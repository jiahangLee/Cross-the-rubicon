package data.queue;

import java.util.Arrays;

/**
 * @Auther: jiahangLee
 * @Date: 2019/3/8 23:47
 * @Description: //TODO
 * @version: V1.0
 */
public class LoopQueue<E> implements Queue<E> {

    private E[] data;
    private int front,tail;
    private int size;

    public LoopQueue(int capacity) {
        this.data = (E[]) new Object[capacity+1];
        this.front = 0;
        this.tail = 0;
        this.size = 0;
    }
    public LoopQueue() {
        this(10);
    }
    public int getCapacity() {
        return data.length-1;
    }
    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return front == tail;
    }

    public void enqueue(E e) {
        if((tail + 1)%data.length == front)
            resize(getCapacity()*2);
        data[tail] = e;
        tail = (tail+1)%data.length;
        size++;
    }
    public void resize(int newCapacity) {

        E[] newData = (E[])new Object[newCapacity+1];
        for(int i = 0;i<size;i++)
            newData[i] = data[i+front%data.length];
        data = newData;
        front = 0;
        tail = size;
    }
    public E dequeue() {
        if(isEmpty())
            throw new IllegalArgumentException("循环队列为空");
        E ret = data[front];
        data[front] = null;
        front = (front+1)%data.length;
        size--;
        if(size == data.length/4 && getCapacity()/2 != 0)
            resize(getCapacity()/2);
        return ret;
    }

    public E getFront() {
        if(isEmpty())
            throw new IllegalArgumentException("循环队列为空");
        return data[front];
    }
    @Override
    public String toString() {
        return "LoopQueue{" +
                "data=" + Arrays.toString(data) +
                ", front=" + front +
                ", tail=" + tail +
                ", size=" + size +
                ", capacity=" + getCapacity() +
                '}';
    }
}
