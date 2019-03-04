package thread;

import javax.print.DocFlavor;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAdder;

public class Test {
    public static void main(String[] args)throws InterruptedException {
        ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
        //concurrentHashMap.put("Tom",new LongAdder());

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Runnable r = ()-> concurrentHashMap.merge("Tom",1, Integer::sum);
        //{
//            //concurrentHashMap.put("Tom",concurrentHashMap.get("Tom") + 1);
//            concurrentHashMap.putIfAbsent("Tom",new LongAdder()).increment();
//        };
        for (int i = 0; i < 10000; i++) {
            executorService.execute(r);

        }
        Thread.sleep(3000);
        executorService.shutdown();

        System.out.println(concurrentHashMap.get("Tom"));
    }


}
