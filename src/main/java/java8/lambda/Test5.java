package java8.lambda;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.Predicate;

/**
 * @Auther: jiahangLee
 * @Date: 2019/3/27 15:30
 * @Description: //TODO
 * @version: V1.0
 */
public class Test5 {
    public static void main(String[] args) {
        Predicate<Integer> predicate = i -> i > 0;
        System.out.println(predicate.test(-3));

//        IntConsumer
        //方法引用
        Consumer<String> consumer = System.out::println;
        consumer.accept("nishisb" );
    }
}
