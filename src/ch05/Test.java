package ch05;
class A{}
public class Test {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = a1;

        System.out.println(a1.equals(a2));
        System.out.println(a1 == a2);
        //==比较的是两个对象地址是否相同,与对象中的内容无关


        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1.equals(s2));//true
        //String的equals对Object的equals做了覆盖
        //覆盖后的规则是比较两个字符串的内容是否相同
        System.out.println(s1 == s2);//false
        //new出来的对象彼此都不相等

        String s3 = "hello";
        String s4 = "hello";
        System.out.println(s3.equals(s4));//true
        System.out.println(s3 ==s4);//true

    }

//    public static void main(String[] args) {
//        Employee employee = new Employee();
//        employee.i = 1;
//        //protected包含了包访问权限 (默认)
//    }
}
//public > protected > 默认 (包访问) > private