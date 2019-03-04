import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Locale;

class A{}
public class Iphone {
    public static void main(String[] args) {
//        A a1 = new A();
//        A a2 = new A();
//        A a3 = new A();
//        Iphone iphnoe = new Iphone();
//        System.out.println(new Date());
//    int i = 1;
//    System.out.println(i);
//
//    Date birthday = new Date();
//    System.out.println(birthday);
//
//    Date deadline = null;
//
//    deadline = birthday;
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getYear());
        System.out.println(now.getMonth());
        System.out.println(now.getMonthValue());
        System.out.println(now.getDayOfMonth());
        LocalDate localDate
                = LocalDate.of(1990,05,27);
        System.out.println(localDate);

        System.out.println(LocalTime.now());
        System.out.println(LocalTime.of(13,13,13));

        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.of(2000,1,1,13,1,1));
        System.out.println(LocalDateTime.of(LocalDate.now(),LocalTime.now()));
    }

}

