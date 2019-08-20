package new201908.p1;

/**
 * @Auther: jiahangLee
 * @Date: 2019/8/19 23:25
 * @Description: //TODO
 * @version: V1.0
 */
public class Array<E> {

    private E[] data;
    private int size;

    public Array(int capacity){
        data = (E[])new Object[capacity];
        size = 0;
    }
    public Array(){
        this(10);
    }

    public int getSize(){
        return size;
    }

    public int getCapacity(){
        return data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void addLast(E e){
        add(size,e);
    }

    public void addFirst(E e){
        add(0,e);
    }
    // 像指定索引插入元素
    public void add(int index,E e){
        if(size == data.length)
            resize(2*data.length);


        if(index < 0 || index > size)
            throw new IllegalArgumentException("add failed");

        for(int i = size - 1;i >= index;i--)
            data[i+1] = data[i];

        data[index] = e;
        size++;
    }

    public E get(int index){
        if(index<0 || index>=size)
            throw new IllegalArgumentException("get failed");
        return data[index];
    }

    public E getLast(){
        return get(size-1);
    }
    public E getFirst(){
        return get(0);
    }
    public void set(int index,E e){
        if(index<0 || index>=size)
            throw new IllegalArgumentException("set failed");
        data[index] = e;
    }

    public boolean contains(E e){
        for(int i=0;i<size;i++){
            if(data[i].equals(e))
                return true;
        }
        return false;
    }

    public int find(E e){
        for(int i=0;i<size;i++){
            if(data[i].equals(e))
                return i;
        }
        return -1;
    }

    public E remove(int index){
        if(index<0 || index>=size)
            throw new IllegalArgumentException("remove failed");
        E ret = data[index];
        for(int i=index;i<size-1;i++)
            data[i]=data[i+1];
        size--;
        data[size] = null;

        if(size == data.length/4 && data.length/2 != 0)
            resize(data.length/2);
        return ret;
    }

    public E removeFirst(){
        return remove(0);
    }

    public E removeLast(){
        return remove(size-1);
    }

    public void removeElement(E e){
        int index = find(e);
        if(index != -1)
            remove(index);
    }

    private void resize(int newCapacity){
        E[] newData = (E[])new Object[newCapacity];
        for(int i=0;i<size;i++)
            newData[i] = data[i];
        data = newData;
    }
    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("array: size= %d , capacity = %d\n",size,data.length));
        res.append('[');
        for(int i=0;i<size;i++){
            res.append(data[i]);
            if(i!=size-1)
                res.append(',');
        }
        res.append(']');
        return res.toString();
    }
}
