package ch05;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test7 {
    public static void main(String[] args) {
        Object array = Array.newInstance(int.class,10);
        int []newArray = (int[])array;
        System.out.println(Arrays.toString(newArray));
    }
}
