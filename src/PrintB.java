public class PrintB  implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++){
//            Thread.yield();
//            通知cpu该线程可以让出
             System.out.printf("%-3s", "A");


        }
    }
}

