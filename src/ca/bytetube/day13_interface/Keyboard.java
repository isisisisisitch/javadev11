package ca.bytetube.day13_interface;

public class Keyboard implements USB{
    @Override
    public void open() {
        System.out.println("keyboard opens");
    }

    @Override
    public void close() {
        System.out.println("keyboard closes");
    }

    public void type(){
        System.out.println("keyboard types");
    }
}
