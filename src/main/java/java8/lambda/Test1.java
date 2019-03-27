package java8.lambda;

import java.util.stream.IntStream;

/**
 * @Auther: jiahangLee
 * @Date: 2019/3/27 14:18
 * @Description: //TODO
 * @version: V1.0
 */
public class Test1 {

    public static void main(String[] args) {
        int[] nums = {1,2,5,67};

        int min = Integer.MAX_VALUE;
        for(int i:nums) {
            if(i < min)
                min = i;
        }
        System.out.println(min);

        int min2 = IntStream.of(nums).parallel().min().getAsInt();
        System.out.println(min2);
    }
}
