//package ch05;
//
//public class Test8 {
//    interface Bus {
//        public abstract void foo();
//        //接口中方法的修饰符都是public abstract,即便不写也是
//
//        public static final int a = 1;
//        //接口中的属性都是public static final,不写也是
//
//        //以下两个语法点在Java8中
//        public static void goo(){}   //static方法可以有实现
//        public default void hoo(){}  //default方法可以有实现
//class Computer implements Usb, Bus{
//
//
//    @Override
//    public void foo() {
//
//    }
//
//}
//        class Test10 {
//            public static void main(String[] args) {
//                //Bus b = new Bus(); 接口不能产生对象
//                //接口和抽象类在犹豫不决的情况下,优先用接口
//                //接口是一个规范或功能上的实现
//                //抽象类侧重父子关系,在其功能上进行抽象
//                //接口中不能有普通方法,也不能有变量
//                Bus.goo();
//                Computer computer = new Computer();
//                computer.hoo();
//            }
//        }static void goo(){
//            System.out.println("goo......");
//        }
//    }
//}
