package data;

import new201908.p1.Array;

/**
 * @Auther: jiahangLee
 * @Date: 2019/3/8 17:11
 * @Description: //TODO
 * @version: V1.0
 */
public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public static void main(String[] args) {
        Array<Student> arr = new Array<>();
        arr.addLast(new Student("alise",100));
        arr.addLast(new Student("bob",10));
        arr.addLast(new Student("charlie",00));
        System.out.println(arr);
    }
}
