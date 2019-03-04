public class Test9 {
    public static void main(String[] args) {
        Employee tom = new Employee("tom",1000,100);
        Employee.pi = 100;
        System.out.println( Employee.pi);

        Employee jerry = new Employee("tom",2000,200);
        System.out.println( Employee.pi);
        Employee.pi = 200;

        System.out.println( Employee.pi);


    }
}
