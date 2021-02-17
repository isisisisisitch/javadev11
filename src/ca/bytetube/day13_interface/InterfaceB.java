package ca.bytetube.day13_interface;

public interface InterfaceB {

    public abstract void showB();

    public abstract void show();

    public default void methodB(){
        System.out.println("default methodA in B");
    }

    public default void method(){
        System.out.println("default method in B");
    }
}
