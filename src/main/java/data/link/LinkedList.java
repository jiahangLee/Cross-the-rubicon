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

    private Node head;
    private int size;

    public LinkedList() {
        head = null;
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
        head = new Node(e, head);
    }

    public void add(int index, E e) {
        //size指向下一次插入元素位置
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("插入链表位置不存在");
        }
        if (index == 0) {
            addFirst(e);
        } else {
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            Node node = new Node(e);
            node.next = prev.next;
            prev.next = node;
//            prev.next = new Node(e,prev.next);
            size++;
        }
    }

    public void addLast(E e) {
        add(size, e);
    }
}
