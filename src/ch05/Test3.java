package ch05;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Test3 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //java是oop,但是很多时候我们只需要给方法传递一些语句,
        //以往的做法是将这些语句封装在一个对象的方法中,然后传递这个对象.
        //但是Java8之后,将这些语句放在了一个叫做Lambda的类型中
        //lambda也可以看作一种类型,所以也可以用来作为参数传递给方法.
        //这样既解决了传递语句的问题,也不用破坏java面向对象的特征
        User[] users = {
                new User(3,"tom",LocalDate.of(1999,1,1)),
                new User(1,"tom",LocalDate.of(2000,1,1)),
                new User(2,"tom",LocalDate.of(1997,1,1)),
                new User(1,"tom",LocalDate.of(1998,1,1)),

        };
        Arrays.sort(users,Comparator.comparing(User::getId).reversed());
        Arrays.stream(users).forEach(System.out::println);

        Arrays.sort(users,Comparator.comparing(User::getId).thenComparing(User::getBirthday));
        Arrays.stream(users).forEach(System.out::println);


        Comparator<User> userSort = (o1, o2) -> {
            if (o1.getId() >o2.getId()) return 1;
            else if (o1.getId() == o2.getId()) return 0;
            else return -1;
        };

        Runnable r = () -> {};

        Supplier s = () -> 0;

        Consumer c = (o) -> {};
        //java中两大类型:
        //1 引用类型: 类类型, 数组类型,lamdba类型
        //2 基本类型: 8个


        //lamdba的语法: ()->{}
        //lambda本质上就是一个方法,()是方法的参数, {}内是方法体
        //由于lamdba本质上是方法,而方法的参数类型已经确定,所以()内的参数不需要类型




        Arrays.sort(users, userSort);
//        User tom = new User(1,"Tom", LocalDate.now());
//        User tomClone = (User) tom.clone();
//
//        System.out.println("Tom:"+tom);
//        System.out.println("TomClone:"+tomClone);
//
//        System.out.println(tom == tomClone);
//
//        System.out.println(
//                tom.getBirthday() == tomClone.getBirthday());

        lamdba l = (num1, num2) -> {
            System.out.println(num1 + num2);
            return 0;
        };
        //lamdba表达式其实就是一个方法,
        //接受这个表达式的必须是一个函数是接口 (仅包含一个抽象方法的接口)
        //所有的函数式接口都可以用来存放lamdba表达式
    }
}
