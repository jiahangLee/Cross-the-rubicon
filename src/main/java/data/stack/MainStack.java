package data.stack;

import data.stack.ArrayStack;

/**
 * @Auther: jiahangLee
 * @Date: 2019/3/8 22:40
 * @Description: //TODO
 * @version: V1.0
 */
public class MainStack {

    public static void main(String[] args) {
        ArrayStack<Integer> stact = new ArrayStack<Integer>();
        for(int i = 0;i<5;i++){
            stact.push(i);
        }
        System.out.println(stact);
        stact.pop();
        System.out.println(stact);

    }
}
