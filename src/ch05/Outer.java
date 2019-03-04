package ch05;

class Outer {
    public void f () {}
    private int i = 1;

    public class Inner{//静态内部类
        public void g() {
            //内部类访问外部类的内容,用外部类名.this
            Outer.this.f();
            Outer.this.i++;
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.new Inner();
        //创建内部类的对象
    }
}
//内部类生成class文件后,文件名称是外部类$内部类