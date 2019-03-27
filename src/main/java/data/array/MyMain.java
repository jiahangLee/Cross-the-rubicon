package data.array;

import data.array.Array;

/**
 * @Auther: jiahangLee
 * @Date: 2019/3/8 16:26
 * @Description: //TODO
 * @version: V1.0
 */
public class MyMain {

    public static void main(String[] args) {
//        Array<Integer> arr = new Array<Integer>(20);
//        for(int i=0;i < 10;i++) {
//            arr.addLast(i);
//        }
//        System.out.println(arr);
//        arr.insert(1,100);
//        System.out.println(arr);
//        arr.addFirst(99);
//        System.out.println(arr);
//        System.out.println(arr.get(3));
//        arr.set(3,19);
//        System.out.println(arr.get(3));

//        arr.remove(1);
//        System.out.println(arr);
//        arr.removeElement(4);
//        System.out.println(arr);
//        arr.removeFirst();
//        System.out.println(arr);

        Array<Integer> arr = new Array<>(10);
        for(int i=0;i < 10;i++) {
            arr.addLast(i);
        }
//        arr.addLast(new Student("bob",100));
//        arr.addLast(new Student("alice",99));
        System.out.println(arr);
        arr.addLast(99);
        System.out.println(arr);
    }
}
