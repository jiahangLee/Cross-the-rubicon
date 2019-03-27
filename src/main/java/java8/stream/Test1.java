package java8.stream;

import java.util.stream.IntStream;

/**
 * @Auther: jiahangLee
 * @Date: 2019/3/27 17:00
 * @Description: //TODO
 * @version: V1.0
 */
public class Test1 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int sums = IntStream.of(nums).map(i->i*2).sum();
        System.out.println(sums);
    }
}
