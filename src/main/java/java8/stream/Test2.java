package java8.stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Auther: jiahangLee
 * @Date: 2019/3/27 17:17
 * @Description: //TODO
 * @version: V1.0
 */
public class Test2 {
    public static void main(String[] args) {

        String str = "my name is haoren";
        Stream.of(str.split(" ")).map(String::length)
                .forEach(System.out::println);

//        Stream.of(str.split(" ")).flatMap(s->s.chars().boxed()).forEach(s-> System.out.println((char)s.intValue()));
//
//        Stream.of(str.split(" ")).peek(System.out::println).forEach(System.out::println);

        // 终止操作
//        str.chars().parallel().forEach(s-> System.out.println((char)s));
//        str.chars().parallel().forEachOrdered(s-> System.out.println((char)s));

        List<String> list = Stream.of(str.split(" ")).collect(Collectors.toList());
        System.out.println(list);

        Optional<String> reduce = Stream.of(str.split(" ")).reduce((s1, s2) -> s1 + "|" + s2);
        System.out.println(reduce.orElse(""));

        Optional<Integer> reduce2 = Stream.of(str.split(" ")).map(String::length).reduce((s1, s2) -> s1 + s2);
        System.out.println(reduce2.orElse(0));

        Optional<String> max = Stream.of(str.split(" ")).max((s1, s2) -> s1.length() - s2.length());
        System.out.println(max.get());
    }
}
