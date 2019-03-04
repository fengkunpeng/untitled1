package ch05;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.IntToLongFunction;

public class Test12 {
    void f(final int i, double d) {


        d = d +1;
        double j = 1.0;
        Comparator c = (x, y) -> {
            System.out.println(j);
            return 0;
        };
    }
    public static void main(String[] args) {
        Integer[] nums = {1,4,7,2,3,6,8};
        Arrays.sort(nums,Integer::compare);
        System.out.println(Arrays.toString(nums));

        IntToLongFunction f = (a) -> {
            return a + 1L;
        };

        BinaryOperator<Integer> b = (o1, o2) -> {
            return o1+o2;
        };

        BiPredicate<Integer, Double> b1 = (t, u) -> t>u;
        //lamdba简化
        //参数只有一个时可以省略小括号
        //方法体只有一句话时可以省略大括号
    }
}
