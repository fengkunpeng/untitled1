package ch05;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

class User implements Cloneable{
        private int id;
        private String name;
        private LocalDate birthday;


     @Override
     protected Object clone() throws CloneNotSupportedException {
         return super.clone();
     }

     public User (int id, String name,LocalDate birthday){
            this.id = id;
            this.name = name;
            this.birthday = birthday;
        }
        public int getId(){
         return id ;
        }
        public LocalDate getBirthday(){
         return birthday;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    class UserOrder implements Comparator<User> {
        @Override
        public int compare(User o1,User o2){
            if (o1.getId() > o2.getId())return 1;
            else if (o1.getId() == o2.getId())return 0;
            else return -1;
        }
    }
    class Test9 {
        public static void main(String[] args) {
            User tom = new User(1,"Tom",LocalDate.now());
            User ben = new User (3,"Ben",LocalDate.now());
            User jerry = new User(2,"jerry",LocalDate.now());

            User[] users = {tom,ben,jerry};
            Arrays.sort(users,new UserOrder());

            Arrays.stream(users).forEach(System.out::println);
        }
    }

