package java8.lambda;

import java.text.DecimalFormat;
import java.util.function.Function;

public class Demo {
    public static void main(String[] args) {
        Test4 test4 = new Test4(999999);
        Function<Integer, String> iu = i -> new DecimalFormat("#,####").format(i);
        test4.printMoney(iu.andThen(s -> s + "人民币"));
    }
}
