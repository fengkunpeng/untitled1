public class Testcanshu {
    double foo(int i, double d) {
        i = i+1;
        d = d+1;
        return i+d;
    }

    public static void main(String[] args) {
        Testcanshu t = new Testcanshu();
        int i = 1;
        double d = 2;
        System.out.println("foo: "+ t.foo(i,d));
        System.out.printf("i=%d, j=%f",i,d);
        //给方法传递参数时,如果参数是基本类型的变量
        //
    }
}
