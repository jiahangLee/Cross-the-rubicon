package java8.lambda;

/**
 * @Auther: jiahangLee
 * @Date: 2019/3/27 14:35
 * @Description: //TODO
 * @version: V1.0
 */
@FunctionalInterface
interface Interface1{
    int doubleNum(int i);
}
public class Test3 {

    public static void main(String[] args) {
        Interface1 i1 = i -> i * 2;
        System.out.println(i1.doubleNum(12));
    }
}
