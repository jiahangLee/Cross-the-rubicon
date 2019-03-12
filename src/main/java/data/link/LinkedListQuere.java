package data.link;

import data.queue.Queue;

/**
 * @Auther: jiahangLee
 * @Date: 2019/3/12 23:46
 * @Description: //TODO
 * @version: V1.0
 */
public class LinkedListQuere<E> implements Queue<E> {
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
    private Node head,tail;
    private int size;
    public LinkedListQuere() {
        head = null;
        tail = null;
        size = 0;
    }
    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(E e) {
        if(tail == null) {
            tail = new Node(e);
            head = tail;
        }else {
            tail.next = new Node(e);
            tail = tail.next;
        }
        size++;
    }

    public E dequeue() {
        if(isEmpty()) {
            throw new IllegalArgumentException("链表队列为空");
        }
        Node ret = head;
        head = head.next;
        ret.next = null;
        if(head == null)
            tail = null;
        size--;
        return ret.e;
    }

    public E getFront() {
        if(isEmpty())
            throw new IllegalArgumentException("链表队列为空");
        return head.e;
    }

    @Override
    public String toString() {
//        return "LinkedListQuere{" +
//                "head=" + head +
//                ", tail=" + tail +
//                ", size=" + size +
//                '}';
        StringBuffer res = new StringBuffer();
        res.append("QUEUE:front");

        Node cur = head;
        while (cur != null) {
            res.append(cur.e+"->");
            cur = cur.next;
        }
        res.append("null");
        return res.toString();
    }
}
