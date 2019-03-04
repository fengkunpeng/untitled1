public class Test {
    public static void main(String[] args) {
        Base b = new Child();
        //b.goo(1,3.1);
        //多态不能直接调用子类方法
        ((Child) b).foo(1,3.1);

        Base b1 = new Base();
        b1.foo(1,3.1);

        //为了不让程序在运行时出错
        if (b1 instanceof Child)
            //(变量 instanceof 类名) 用于判断变量的真实类型是否是后面的类名一致
        ((Child) b).foo(1,3.1);
        //编译时没有错误,运行时错误
        //父类对象无法通过强制类型转换为子类对象
    }
}
