package ca.bytetube.day13_interface;

public class Mouse implements USB{

    @Override
    public void open() {
        System.out.println("mouse opens");
    }

    @Override
    public void close() {
        System.out.println("mouse closes");
    }

    public void click(){
        System.out.println("mouse clicks");
    }
}
