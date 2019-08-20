package new201908.p3;

import new201908.p1.Array;

/**
 * @Auther: jiahangLee
 * @Date: 2019/8/20 18:16
 * @Description: //TODO
 * @version: V1.0
 */
public class ArrayQueue<E> implements Queue<E> {

    private Array<E> array;
    public ArrayQueue(int capacity){
        array = new Array<>(capacity);
    }
    public ArrayQueue(){
        array = new Array<>();
    }
    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public void enqueue(E e) {
        array.addLast(e);
    }

    @Override
    public E dequeue() {
        return array.removeFirst();
    }

    public int getCapacity(){
        return array.getCapacity();
    }
    @Override
    public E getFront() {
        return array.getFirst();
    }
    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Queue:");
        res.append("front [");
        for(int i = 0;i<array.getSize();i++){
            res.append(array.get(i));
            if(i!=array.getSize()-1)
                res.append(',');
        }
        res.append("] tail");
        return res.toString();
    }
}
