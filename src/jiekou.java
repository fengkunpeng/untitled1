public class jiekou {
    interface A {
    default void foo(){
        System.out.println("aaa");
    }
    }
    interface B {
        default void foo(){
            System.out.println("bbb");
        }
    }

    class C {
        public void foo(){
            System.out.println("ccc");
        }
    }
    class MyServlet2 implements A, B{
        @Override
        public void foo() {

        }
    }
    class Myservlet1 extends C implements A, B{
    }
}
