package ca.bytetube.day13_interface;

public class ClassC extends ClassA implements InterfaceA {

    @Override
    public void showA() {
        System.out.println("AAAAAAAA");
    }

    @Override
    public void show() {
        System.out.println("CCCCCCCC");
    }





    public static void main(String[] args) {
        ClassC c = new ClassC();
        c.method();
    }
}
