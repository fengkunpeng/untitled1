public class Test12 {


    void foo(Employee employee) {
        //employee.setSalary(2000);
        employee = new Employee("Jerry",9000,8000);
    }

    public static void main(String[] args) {
        Test12 t = new Test12();
        Employee tom
                = new Employee("Tom",1000,2000);
        t.foo(tom);
        System.out.println(tom);
    }
}
