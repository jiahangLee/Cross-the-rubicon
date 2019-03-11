package data.array;

import java.util.Arrays;

/**
 * @Auther: jiahangLee
 * @Date: 2019/3/8 15:45
 * @Description: //TODO
 * @version: V1.0
 */
public class Array<E> {
    private E[] data;
    private int size;

    public Array(int capacity) {
        data = (E[]) new Object[capacity];
        size = 0;
    }
    public Array() {
        this(10);
    }
    public int getSize() {
        return size;
    }
    public int getCapacity() {
        return data.length;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public void addLast(E e) {
//        if(size == data.length)
//            throw new IllegalArgumentException("数组满了");
//        data[size] = e;
//        size++;
        insert(size,e);
    }
    public void addFirst(E e) {
        insert(0,e);
    }
    public void insert(int index,E e) {
        if(size == data.length)
            resize(2*size);
        if(index < 0 || index >size)
            throw new IllegalArgumentException("插入位置不正确");
        for(int i = size-1;i >= index;i--) {
            data[i+1] = data[i];
        }
        data[index] = e;
        size++;
    }
    public E get(int index) {
        if(index<0 || index>=size)
            throw new IllegalArgumentException("查询位置不正确");
        return data[index];
    }
    public E getLast() {
        return get(size-1);
    }
    public E getFirst() {
        return get(0);
    }
    public void set(int index,E e) {
        if(index<0 || index>size)
            throw new IllegalArgumentException("修改位置不正确");
        data[index] = e;
    }
    public boolean contains(E e) {
        for(E x:data){
            if(x.equals(e))
                return true;
        }
        return false;
    }
    public int find(E e) {
        for(int i=0;i<size;i++) {
            if(data[i].equals(e))
                return i;
        }
        return -1;
    }
    public E remove(int index) {
        if(index<0 || index >= size) {
            throw new IllegalArgumentException("删除位置不正确");
        }
        E ret = data[index];
        for(int i = index;i < size-1;i++) {
            data[i] = data[i+1];
        }
        size--;
        data[size] = null;
        if(size == data.length/4 && data.length/2 != 0)
            resize(data.length/2);
        return ret;
    }
    public E removeFirst() {
        return remove(0);
    }
    public E removeLast() {
        return remove(size-1);
    }
    public void removeElement(E e) {
        int index = find(e);
        if(index != -1)
            remove(index);
    }
    private void resize(int newCapacity) {
        E[] newData = (E[])new Object[newCapacity];
        for(int i=0;i<size;i++) {
            newData[i] = data[i];
        }
        data = newData;
    }
    @Override
    public String toString() {
        return "Array{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
}
