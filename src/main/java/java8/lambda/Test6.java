package java8.lambda;

import java.util.function.*;

/**
 * @Auther: jiahangLee
 * @Date: 2019/3/27 15:43
 * @Description: //TODO
 * @version: V1.0
 */
class Dog{
    private String name = "哮天犬";
    private int food = 10;

    public static void bark(Dog dog) {
        System.out.println(dog+"叫了");
    }
    public int eat(int num) {
        System.out.println("吃了"+num);
        this.food -= num;
        return this.food;
    }
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class Test6 {
    public static void main(String[] args) {

        // 静态方法的引用
        Consumer<Dog> consumer = Dog::bark;
        consumer.accept(new Dog());

        Dog.bark(new Dog());

        // 非静态方法
//        Function<Integer,Integer> function = new Dog()::eat;
//        UnaryOperator<Integer> function = new Dog()::eat;
        IntUnaryOperator function = new Dog()::eat;
        System.out.println("还剩下"+function.applyAsInt(3));

        BiFunction<Dog,Integer,Integer> eatF = Dog::eat;
        System.out.println("还剩下："+eatF.apply(new Dog(),2));

        //构造函数应用
        Supplier<Dog> supplier = Dog::new;
        System.out.println("创建了新对象"+supplier.get());
    }
}
