package data.link;

/**
 * @Auther: jiahangLee
 * @Date: 2019/3/11 17:00
 * @Description: //TODO
 * @version: V1.0
 */
public class StackMain {
    public static void main(String[] args) {
        LinkedListStack<Integer> stack = new LinkedListStack<Integer>();
        for(int i = 0;i < 5;i++) {
            stack.push(i);
            System.out.println(stack);
        }
        stack.pop();
        System.out.println(stack);
    }
}
