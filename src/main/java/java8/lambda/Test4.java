package java8.lambda;

import java.text.DecimalFormat;
import java.util.function.Function;

/**
 * @Auther: jiahangLee
 * @Date: 2019/3/27 14:47
 * @Description: //TODO
 * @version: V1.0
 */
//@FunctionalInterface
//interface ImoneyFormat{
//    String format(int i);
//}
class Test4 {
    private final int money;

    public Test4(int money) {
        this.money = money;
    }

    public void printMoney(Function<Integer,String> imoneyFormat) {
        System.out.println("我的存款：" + imoneyFormat.apply(this.money));
    }


}
