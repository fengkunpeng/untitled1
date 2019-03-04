public class Test10 {
    //java中的参数用于给方法传递值
    int foo(int i,double d) {
        //参数格式:类型 变量名
        //多个参数用逗号分开,这些参数叫做形式参数 (行参)
        //形式参数可以被认为是在方法中的变量
        System.out.println("foo:"+i+d);

        return 1; //带返回值的方法必须写return
    }//foo是一个有返回值的带参数方法

    void goo() {
        System.out.println("foo");
        int i = 1;

    }//goo是一个无返回值的无参数方法.参数放在方法后的小括号里
    void aoo_(String name, int age) {
        System.out.println(name + age);
    }//aoo是一个无返回值的带参数方法
    void aoo_(int a) {
        System.out.println(a);
    }
     int coo() {
        int i = 3;
        return 5;
     }//coo是一个有返回值的无参数方法

    public static void main(String[] args) {
        Test10 t = new Test10();
        //带返回值的方法可以被当做一个常量使用
        int i = t.foo(1,1);//方法有参数的话,在调用时必须给这些参数值 (实际参数)
        t.foo(2,2);
        System.out.println(t.foo(3,3));
//        //不带返回值的方法只能用于调用,即
//        t.goo(1,3);//报错原因:不带参数的方法只能调用,不能赋值
        System.out.println(t.coo());
//        System.out.println(t.goo());//无返回值的方法无论是否带参数都不能放在System里边
//       System.out.println(t.aoo_("tom",456));
        t.aoo_("tom",456);
        t.aoo_(2);
    }

}
