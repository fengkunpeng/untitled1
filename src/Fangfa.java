public class Fangfa {
        void fun() {
            System.out.println("1234567890");
            return;
        }
        int goo() {
            System.out.println("1234567890");
            return 1;
        }
        double zoo(int d) {
            return d + 1.0;
        }

    public static void main(String[] args) {
        Fangfa t = new Fangfa();
        t.fun();
        System.out.println(t.goo());
        System.out.println(t.zoo(1));
        }


    }


