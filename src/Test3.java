public class Test3 {
    public static void main(String[] args) {
        var m = 0;
        while (m++ <10) {
            if (m == 5) continue;
            System.out.println(m);
        }
        System.out.println("the end");


        a:
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                for (int k = 0; k < 3; k++){
                    if (k == 2) break a;
                    System.out.println("hello");
        }
    }
}