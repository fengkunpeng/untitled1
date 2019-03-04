import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) {



        int[] num1 = {1, 2, 3, 4,};

        int[] num2 = Arrays.copyOf(num1, 4);
        int[] num3 = Arrays.copyOf(num1, 10);
        int[] num4 = Arrays.copyOf(num1, 2);


        System.out.println(Arrays.toString(num2));
        System.out.println(Arrays.toString(num3));
        System.out.println(Arrays.toString(num4));
    }
}
