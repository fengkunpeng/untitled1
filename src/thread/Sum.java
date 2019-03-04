package thread;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;

public class Sum {
    //private AtomicInteger i = new AtomicInteger(0);
    private LongAdder i = new LongAdder();
    public void inc(){
        i.add(1);
    }
    public int get(){
        return i.intValue();
    }
}
