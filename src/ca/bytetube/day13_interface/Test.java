package ca.bytetube.day13_interface;

public class Test {


    public static void main(String[] args) {
        Animal animal = new Dog();
//        System.out.println(animal.feet);//4
//        animal.eat();//eat bones
        //animal.watchHouse();
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;//ClassCastException
            cat.catchMouse();
        }


    }







    public static void showDog(Dog dog){
        dog.eat();
    }

    public static void showCat(Cat Cat){
        Cat.eat();
    }

    public static void showAnimal(Animal animal){
        animal.eat();
    }
}
