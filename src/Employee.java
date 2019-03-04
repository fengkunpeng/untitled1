import java.time.LocalDate;

public class Employee {
    private String name = "jerry";//数据成员,成员变量,域,属性,字段,变量
    private double salary = 1.1;
    private double salary1 = salary;
    public static double pi;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary1() {
        return salary1;
    }

    public void setSalary1(double salary1) {
        this.salary1 = salary1;
    }

    {
        name = "tom";
        salary = 2.2;
        System.out.println("non-static");
    }
    {
        name = "zzz";
        salary = 999;
    }


    static {//static优先于所有非static执行
        System.out.println("static1");
    }

    static {//static块之间依次执行
        System.out.println("static2");
    }

    public  Employee(){//
        name = "ben";
        salary = 3.3;
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(double salary) {
        this.salary = salary;
    }


    public Employee(String name, double salary, double salary1) {
        this.name = name;
        this.salary = salary;
        this.salary1 = salary1;
        //this后面的一定是类中的属性或方法
        //方法中的参数或变量会遮蔽类中的变量
        //如果要使用类中的内容，需要加上this.
    }

    @Override
    public String toString() {
        return  "[" + name + "," + salary + "]";
    }
    int fun(int i) {
        return 0;
    }
    void Employee() {//写的不好的方法,首字母应该小写
        //这不是构造器,构造器没有返回值
    }


        public static void main(String[] args) {
            Employee employee = new Employee();
            Employee tom = new Employee();
            Employee jerry = new Employee("jerry", 1000, 200);
            System.out.println(employee.name);
            System.out.println(tom);
            tom.Employee();
            tom.fun(10);
            //直接打印一个对象时，默认是调用toString方法
            //系统默认的toString是打印"类名@哈希码"
        }
}
