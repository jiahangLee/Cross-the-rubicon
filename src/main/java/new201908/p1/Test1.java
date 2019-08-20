package new201908.p1;

/**
 * @Auther: jiahangLee
 * @Date: 2019/8/19 22:54
 * @Description: //TODO
 * @version: V1.0
 */
public class Test1 {

    public static void main(String[] args) {

        Array<Integer> arr = new Array<>();
        for(int i=0;i<10;i++)
            arr.addLast(i);
        System.out.println(arr);

        arr.add(1,100);
        System.out.println(arr);

        arr.addFirst(-1);
        System.out.println(arr);

        arr.remove(2);
        System.out.println(arr);

        arr.removeElement(4);
        System.out.println(arr);

        arr.removeFirst();
        System.out.println(arr);

        arr.removeLast();
        System.out.println(arr);
    }

}
