package ca.bytetube.day15_collection;

import java.util.HashSet;
import java.util.Objects;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {// Student student2
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        Student student1 = new Student("dal",30);
        Student student2 = new Student("dal",30);
        System.out.println(student1);//61bbe9ba
        System.out.println(student2);//610455d6
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        HashSet<Student> set = new HashSet<>();
        set.add(student1);
        set.add(student2);
        System.out.println(set.size());

    }


}
