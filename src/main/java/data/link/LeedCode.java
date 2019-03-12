package data.link;

/**
 * @Auther: jiahangLee
 * @Date: 2019/3/13 00:19
 * @Description: //TODO
 * @version: V1.0
 */
public class LeedCode {
        public ListNode removeElements(ListNode head, int val) {
            while(head != null && head.val == val) {
                ListNode listNode = head;
                head = head.next;
                listNode.next = null;
            }
            if(head == null)
                return null;
            ListNode prev = head;
            while(prev.next != null) {
                if(prev.next.val == val) {
                    ListNode listNode = prev.next;
                    prev.next = listNode.next;
                    listNode.next = null;
                }else {
                    prev = prev.next;
                }
            }
            return head;
        }

}
