package ca.bytetube.day14_exception;

public class Demo02 {
    public static void show(int x) throws Exception {
        if (x > 0) {
            throw new Exception("there is an exception");
        }else {
            System.out.println(x);
        }
        
    }

    public static void main(String[] args) throws Exception {//jvm
        show(10);
    }
}
