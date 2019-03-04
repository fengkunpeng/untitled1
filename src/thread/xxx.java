package thread;

import java.util.*;

public class xxx {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        List<Integer> syncList
                = Collections.synchronizedList(list);

        Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> syncMap =
                Collections.synchronizedMap(map);
    }
}
