package ch05;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

//public class Test4 {
//    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, NoSuchFieldException, InvocationTargetException {
//        Class cl = User.class;
////        Field[] fields = cl.getFields();
////        //System.out.println(Arrays.toString(fields));
////        for (int i = 0; i < fields.length; i++)
////            System.out.println(fields[i]);
////
////        System.out.println("-------------------");
////
////        fields = cl.getDeclaredFields();
////        for(Field field : fields)
////            System.out.println(field);
////        User tom = new User();
////        User jerry = new User();
////
////        Field id = cl.getField("id");
////        id.set(tom,1);
////        id.set(jerry,2);
////
////        Field name = cl.getDeclaredField("name");
////        name.setAccessible(true);
////        name.set(tom,"Tom");
////        name.set(jerry,"jerry");
////
////        System.out.println(tom + "\n"+ jerry);
////
////        User user = new User();
////
////        Method goo
////                =cl.getDeclaredMethod(
////                        "goo",int.class,double.class);
////        goo.setAccessible(true);
////        goo.invoke(user,1,3.14);
////
////        Method foo = cl.getMethod("foo");
////        foo.invoke(user);
////    }
////}
