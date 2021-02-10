package ca.bytetube.day12;

public abstract class Employee {
    String name;
    double salary;
    String id;

    public Employee(String name, double salary, String id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public abstract void work();


    public void func(){

    }

    public static void main(String[] args) {
//        Employee employee = new Employee() ;
    }
}
