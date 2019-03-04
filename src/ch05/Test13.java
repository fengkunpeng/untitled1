package ch05;

class MyException extends Throwable {
    public MyException(String xxx){
        super("余额不足");
    }
}


public class Test13 {
//    int f() {
//        try {
//            return 0;
//
//        }finally {
//            return 1;//方法f最终返回的值是1,不是0
//        }
//    }
//


    void f()
        throws IndexOutOfBoundsException, Error, Throwable{
        //RuntimeException及其子类没有必要被声明或捕获
    }

    public static void main(String[] args) throws MyException {
        try {
            if (args.length > 0)
                throw new MyException("xxx");
            //try中一旦发生异常,就会立刻停止之后的语句,转而执行catch字句
            System.out.println("hello");
            return;
            //System.exit(1);
        }catch (Exception e) {
            e.printStackTrace();
        }catch(Throwable e){
            System.out.println("catch...");
        }finally{
            System.out.println("finally");
            }
        }


    }

