package data.link;

/**
 * @Auther: jiahangLee
 * @Date: 2019/3/11 14:20
 * @Description: //TODO
 * @version: V1.0
 */
public class LinkedList<E> {

    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node node) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return "Node{" +
                    "e=" + e +
                    ", next=" + next +
                    '}';
        }
    }

    private Node dummyNode;
    private int size;

    public LinkedList() {
        dummyNode = new Node();
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public Boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(E e) {
//        Node node = new Node();
//        node.next = head;
//        head = node;
        add(0,e);
    }

    public void add(int index, E e) {
        //size指向下一次插入元素位置,就是元素数量
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("插入链表位置不存在");
        }
            Node prev = dummyNode;
            for (int i = 0; i < index; i++) {
                prev = prev.next;
            }
            Node node = new Node(e);
            node.next = prev.next;
            prev.next = node;
//            prev.next = new Node(e,prev.next);
            size++;

    }

    public void addLast(E e) {
        add(size, e);
    }

    public E get(int index) {
        if(index < 0 || index >= size) {
            throw new IllegalArgumentException("获取链表元素的位置不正确");
        }
        Node cur = dummyNode.next;
        for(int i = 0;i < index;i++) {
            cur = cur.next;
        }
        return cur.e;
    }
    public E getFirst(){
        return get(0);
    }
    public E getLast() {
        return get(size-1);
    }
    public void set(int index,E e) {
        if(index < 0 || index >= size) {
            throw new IllegalArgumentException("修改链表位置不正确");
        }
        Node cur = dummyNode.next;
        for(int i = 0;i < index;i++) {
            cur = cur.next;
        }
        cur.e = e;
    }
    public boolean contains(E e) {
        Node cur = dummyNode.next;
        while(cur != null){
            if(cur.e.equals(e))
                return true;
            cur = cur.next;
        }
        return false;
    }

    @Override
    public String toString() {
//        return "LinkedList{" +
//                "dummyNode=" + dummyNode +
//                ", size=" + size +
//                '}';
//    }
        StringBuffer stringBuffer = new StringBuffer();
        Node cur = dummyNode.next;
        while (cur != null) {
            stringBuffer.append(cur.e+"->");
            cur = cur.next;
        }
        stringBuffer.append("null");
        return stringBuffer.toString();
    }
    public E remove(int index) {
        if(index < 0 || index >= size) {
            throw new IllegalArgumentException("删除链表位置不正确");
        }
        Node prev = dummyNode;
        for(int i = 0;i < index;i++) {
            prev = prev.next;
        }
        Node ret = prev.next;
        prev.next = ret.next;
        ret.next = null;
        size --;
        return ret.e;
    }
    public E removeFirst() {
        return remove(0);
    }
    public E removeLast() {
        return remove(size-1);
    }
}
