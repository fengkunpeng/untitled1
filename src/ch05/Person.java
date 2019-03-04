package ch05;

import java.util.Objects;

public class Person{
    private int i;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return i == person.i &&
                i == person.i &&
                j == person.j &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(i, name, i, j);
    }

    //public private 默认不写
//    protected int i = 1;
    //protected指在子类中可以访问父类的受保护成员和方法
    int j = 1;
//    public Person(){}
//
//    public abstract void foo();
//    //1 一个类中如果有抽象方法时,这个类就必须是抽象类
//    //2 抽象方法没有方法体,即没有{}
//    //3 抽象方法必须在子类中被覆盖(重写),如果不覆盖,那么
//    //子类必须也被标记为抽象的
//
//    //4 父类的方法是普通方法,子类可以对其覆盖,甚至可以将其覆盖为抽象的
//    void goo{
//
//    }
//    //抽象类能有构造器.
//    public static void main(String[] args) {
//        Person Person = new Person() {}
//    }




}
