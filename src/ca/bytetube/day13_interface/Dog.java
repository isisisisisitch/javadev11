package ca.bytetube.day13_interface;

public class Dog extends Animal{
    int feet = 6;
    @Override
    public void eat() {
        System.out.println("eat bones");
    }


    public void watchHouse(){
        System.out.println("dog can watch house");
    }
}
