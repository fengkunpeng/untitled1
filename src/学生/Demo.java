package 学生;

public class Demo {
    public static void main(String[] args) {
        Student student1 = new Student("tom", 12, 71359);
        Student student2 = new Student("jerry", 15, 767867);
        Student student3 = new Student("lilei", 2, 54687);

        System.out.println(student2.fangfa());
        System.out.println(student2);
        System.out.println("name:"+student1.getName()+",age:"+student1.getAge()+",number:"+student1.getNumber());
    }

}
