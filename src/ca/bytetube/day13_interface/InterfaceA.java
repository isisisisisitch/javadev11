package ca.bytetube.day13_interface;



public interface InterfaceA {

    public static final int NUM = 10;

    public abstract void showA();

    public abstract void show();

    public default void methodA(){
        System.out.println("default methodA in A");
    }

    public default void method(){

        System.out.println("default method in InterfaceA");
    }

}
