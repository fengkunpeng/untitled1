package 集合;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> c = new ArrayList<>();
        c.add(1);c.add(9);c.add(7);c.add(3);
        Iterator<Integer> it = c.iterator();
        while(it.hasNext())
            System.out.println(it.next());


        Enumeration<Integer>enumeration = Collections.enumeration(c);
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());//安全多线程枚举集合(过时)
        }
    }
}
