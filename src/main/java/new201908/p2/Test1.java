package new201908.p2;

/**
 * @Auther: jiahangLee
 * @Date: 2019/8/20 17:53
 * @Description: //TODO
 * @version: V1.0
 */
public class Test1 {

    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();
        for(int i=0;i<10;i++) {
            stack.push(i);
            System.out.println(stack);
        }
        stack.pop();
        System.out.println(stack);
    }
}
