package ch05;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

class DateSort implements Comparator<LocalDate> {
    @Override
    public int compare(LocalDate o1, LocalDate o2) {
        if(o1.getDayOfMonth() > o2.getDayOfMonth()) return 1;
        else if (o1.getDayOfMonth() == o2.getDayOfMonth()) return 0;
        return -1;
    }
}
public class Test11 {
    public static void main(String[] args) {

        LocalDate l1 = LocalDate.of(1999,1,2);
        LocalDate l2 = LocalDate.of(2000,2,3);
        LocalDate l3 = LocalDate.of(2003,1,1);
        LocalDate l4 = LocalDate.of(1990,1,1);
        LocalDate[] dates = {l1, l2, l3, l4};
        Arrays.sort(dates,new DateSort());

        Arrays.stream(dates).forEach(System.out::println);




    }
}
