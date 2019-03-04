package ch05;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test5 {
    public static void main(String[] args) {
        Class cl = User.class;
        Method[] Mehtods = cl.getMethods();
        //System.out.println(Arrays.toString(fields));
        //拿到当前类和父类中public的方法
        for (int i = 0; i < Mehtods.length; i++)
            System.out.println(Mehtods[i]);

        System.out.println("-------------------");

        Mehtods = cl.getDeclaredMethods();
        //拿到当前类中的public和private的方法
        for(Method Mehtod: Mehtods)
            System.out.println(Mehtod);
    }
}
