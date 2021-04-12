package ca.bytetube.day20_review;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        shoMethod(dog);

    }

    public static void shoMethod(Animal animal){
       animal.eat();
    }
}
