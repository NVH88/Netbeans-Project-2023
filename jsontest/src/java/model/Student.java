package model;

public class Student {
    private int student_id, age;
    private String name;

    public Student(int student_id, int age, String name) {
        this.student_id = student_id;
        this.age = age;
        this.name = name;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "student_id=" + student_id + ", age=" + age + ", name=" + name + '}';
    }
}