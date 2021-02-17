package ca.bytetube.day13_interface;

public class Cat extends Animal{
    int feet = 2;
    @Override
    public void eat() {
        System.out.println("eat fish");
    }

    public void catchMouse(){
        System.out.println("cat can catch mouse");
    }
}
