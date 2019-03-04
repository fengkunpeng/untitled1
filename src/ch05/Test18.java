package ch05;

//class Node<T, E> {
//    private T date;
//    public E num;
//    private String name;

//    public static <A> A f() {
//        A a = null;
//        return a;
//
//    }
//
//}
class ArrayAlg {
    public static <T> T getMiddle(T... a){
        return a[a.length / 2];
    }

    public static <T extends Comparable> T min(T[]a) {
        if (a == null || a.length == 0) return null;
        T smallest = a[0];
        for (int i = 0; i < a.length; i++) {
            if (smallest.compareTo(a[i]) > 0) smallest = a[i];
            return smallest;

        }

        return smallest;
    }

public static class Test18 {
    public static void main(String[] args) {
        int i
                =ArrayAlg.<Integer>getMiddle(1,3,5,3,5,7);
        System.out.println(i);
        String s
                 =ArrayAlg.<String>getMiddle("aa","bb","cc");

        ArrayAlg.<String>min(new String[]{"aa","b"});
        class User implements Comparable<User>{

            @Override
            public int compareTo(User o) {
                return 0;
            }
        }
        ArrayAlg.<User>min(new User[]{});
        System.out.println(s);
    }
}
//        Node.<String>f();
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//
//        int i = list.get(0);
//
//        Node<Integer,Double> node = new Node<>();
//        Node<String, String> node1 = new Node<>();
//    }
}
