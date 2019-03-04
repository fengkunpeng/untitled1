package 集合;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alq {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);list.add(6);list.add(9);
        list.add(7);list.add(3);list.add(1);

        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));

        Collections.reverse(list);//将集合元素转置
        list.forEach(e->System.out.printf("%-3d",e));

        System.out.println();

        Collections.sort(list);//将集合元素排序
        list.forEach(e->System.out.printf("%-3d",e));

        System.out.println();

        Collections.shuffle(list);//将集合元素混洗(打乱)
        list.forEach(e->System.out.printf("%-3d",e));

        Collections.sort(list);
        System.out.println(Collections.binarySearch(list,7));
        //得到结果如果是0和正数,那么这就是要查找元素所在的下标
        //如果是负数,意味着没找到.但是对这个负数求绝对值后-1
        //得到的数就是这个元素应该放入的位置,放入后这个集合依然是有序的

    }
}