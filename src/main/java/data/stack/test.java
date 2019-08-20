package data.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: jiahangLee
 * @Date: 2019/7/23 16:30
 * @Description: //TODO
 * @version: V1.0
 */
 class stack {
    private static List<Integer> list= new ArrayList<>();
    private static List<Integer> list2= new ArrayList<>();

    public static void push(int a){
        //list不为空，出现了更小值
        if(!list2.isEmpty() && list2.get(list2.size()-1)<a) {
            list.add(a);
            list2.add(list2.get(list2.size()-1));
        }else {
            list.add(a);
            list2.add(a);
        }
    }
    public int pop(){
        return list.remove(list.size()-1);
    }
    public static int top(){
        return list.get(list.size()-1);
    }
    public static int getMin(){
        return list2.get(list2.size()-1);
    }
    public static void myPrint(){
        System.out.println(list.toString());
    }
}
public class test{

     public static void main(String[] args){

         stack.push(1);
         stack.push(11);
         stack.push(9);
         stack.push(89);
         stack.push(0);
         stack.push(12);

         stack.myPrint();
         System.out.println(stack.getMin());
         System.out.println(stack.top());
     }
}