package ca.bytetube.day09;

public class Student {
    //member variables /attribute
    private String name;
    private int age;

    public Student() {}

    public Student(String name) {
        this.name = name;
    }

    public Student(int age) {
        this.age = age;
    }

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

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    //member methods
    public void study(){
        System.out.println("coding makes me happy!");
    }

    public void eat(){
        System.out.println("I love burger!");
    }

}
