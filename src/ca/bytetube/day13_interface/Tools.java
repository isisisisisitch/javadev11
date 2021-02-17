package ca.bytetube.day13_interface;
//interface --->rules
public interface Tools {
    public abstract void func1();


    public static void func2(){
        System.out.println("this is static method");
    }

    public default void func3(){
        System.out.println("this is default method");
    }
}
