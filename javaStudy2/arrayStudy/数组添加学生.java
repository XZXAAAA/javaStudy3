package arrayStudy;

import java.util.ArrayList;

public class 数组添加学生 {
    public static void main(String[] args) {
        Student student1 = new Student("张三", 18);
        Student student2 = new Student("李四", 19);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        System.out.println("学生姓名\t\t\t\t学生年龄 " );
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println(student.name +"\t\t\t\t" +student.age);
        }


    }


}


class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}