import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {

        int i = 0;
        while (i < 4) {
            System.out.println("hello, java");
            ++i;
        }
        int j = 1;
        while (j <= 4) {
            System.out.println("hello, java");
            ++j;
        }
        i = 0;
        while (i++ < 10)
            System.out.printf("%-3d", i);
        System.out.println("\nhello, java");

        i = 0;
        var sum = 0;
        while (i++ < 100 )
            sum += i;
        System.out.printf("sum is: %d.", sum);
    }
}
