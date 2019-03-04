package g;

import java.time.LocalDate;
import java.util.ArrayList;
@SuppressWarnings("all")
class Pair<T> {
    private T second;


    //类型限定: 自定义泛型类,自定义泛型方法
    class User<T extends Cloneable> {

    }

    //通配泛型: 通配泛型一定带?
    //通配泛型是一种类型,用在赋值运算符的左侧
    Pair<? extends Number> num1 = new Pair<Integer>();
    //<子类 extends 父类>

    Pair<? super Number> num3 = new Pair<Object>();
    //<父类 super 子类>

    Pair<?> num4 = new Pair<LocalDate>();

    //T和Object的区别?

    public void setSecond(T newValue) {
        Pair<String> a = new Pair();
        Pair<Integer> b = new Pair();
        if(a instanceof Pair) {//error: instanceof Pair<String>
        }

        a = (Pair)b;//error: (Pair<Integer>)b;

        System.out.println(a.getClass() == b.getClass());//true

       // ArrayList a = new ArrayList();
        second = newValue;

    }
}
@SuppressWarnings("all")
class DateInterval extends Pair<LocalDate> {
    @Override
    public void setSecond(LocalDate newValue) {
        super.setSecond(newValue);
    }

}
