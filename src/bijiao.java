import java.util.Arrays;
import java.util.Comparator;
class User implements Comparable<User> {
        public int id;
        public String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        @Override
        public int compareTo(User o) {
            return (this.id > o.id) ? 1 : (this.id == o.id) ? 0 : -1;
        }
    }
        class ByName implements Comparator<User>{
            @Override
            public int compare(User o1,User o2){
                char n1=o1.name.charAt(0);
                char n2=o2.name.charAt(0);
                return (n1>n2)? 1 : (n1==n2)? 0 : -1;
            }
        }
 class Test1 {
     public static void main(String[] args) {
         User[] users = {new User(1, "zz"), new User(2, "bbb")};
         Arrays.sort(users);

         Arrays.stream(users).forEach(System.out::println);
         System.out.println("============================");
         Arrays.sort(users, new ByName());
         Arrays.stream(users).forEach(System.out::println);
     }
 }




