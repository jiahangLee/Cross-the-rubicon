package new201908.p3;

/**
 * @Auther: jiahangLee
 * @Date: 2019/8/20 19:01
 * @Description: //front=tail;tail+1
 * @version: V1.0
 */
public class LoopQueue<E> implements Queue<E> {

    private E[] data;
    private int front,tail;
    private int size;
    // 这里容量+1
    public LoopQueue(int capacity){
        data = (E[]) new Object[capacity+1];
        front = 0;
        tail = 0;
        size = 0;
    }
    public LoopQueue(){
        this(10);
    }
    public int getCapacity(){
        return data.length-1;
    }
    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return front == tail;
    }

    @Override
    public void enqueue(E e) {

        if((tail+1)%data.length == front)
            resize(getCapacity()*2);

        data[tail] = e;
        tail = (tail+1)%data.length;
        size++;
    }

    private void resize(int i) {
        E[] newData = (E[])new Object[i+1];
        for(int j=0;j<size;j++)
            newData[j] = data[(j+front)%data.length];
        data = newData;
        front = 0;
        tail = size;
    }

    @Override
    public E dequeue() {
        if(isEmpty())
            throw new IllegalArgumentException("dequeue failed");
        E ret = data[front];
        data[front] = null;
        front = (front+1)%data.length;
        size--;
        if(size == getCapacity()/4 && getCapacity()/2!=0)
            resize(getCapacity()/2);
        return ret;
    }

    @Override
    public E getFront() {
        if(isEmpty())
            throw new IllegalArgumentException("getFront failed");

        return data[front];
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("queue: size= %d , capacity = %d\n",size,getCapacity()));
        res.append("front [");
        for(int i=front;i%data.length!=tail;i++){
            res.append(data[i]);
            if((i+1)%data.length!=tail)
                res.append(',');
        }
        res.append("] tail");
        return res.toString();
    }
}
