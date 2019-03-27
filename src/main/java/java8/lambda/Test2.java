package java8.lambda;

/**
 * @Auther: jiahangLee
 * @Date: 2019/3/27 14:28
 * @Description: //TODO
 * @version: V1.0
 */
public class Test2 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("ok");
            }
        }).start();

        new Thread(() -> System.out.println("ok")).start();
    }
}
