package ch05;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(10);
        list1.add(9);
        list1.forEach(System.out::println);
        list1.remove(0);
        list1.forEach(e -> System.out.printf("%-3d", e));

        System.out.println("\n" + list1.get(0));
    }

//    public static void main(String[] args) {
//        Person p1 = new Person(1,"Tom",);
//        Person p2 = new Person(1,"Jerry");
//
//        System.out.println(p1.toString());
//        打印一个对象和打印一个对象的toString方法是一样的
//        toString就是Object中的方法,会输出"类名@哈希码"
//
//        System.out.println(Integer.toHexString(p1.hashCode()));
//
//        System.out.println(p2);
//        System.out.println(Integer.toHexString(p2.hashCode()));
//    }
//}
}