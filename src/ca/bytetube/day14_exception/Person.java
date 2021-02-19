package ca.bytetube.day14_exception;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws NoAgeException {
        this.name = name;
        if (age < 0 || age > 200) {
            throw new NoAgeException("your age is illegal");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
