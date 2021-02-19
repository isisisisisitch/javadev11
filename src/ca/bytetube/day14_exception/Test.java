package ca.bytetube.day14_exception;

public class Test {
    public static void main(String[] args)  {
        Person p = null;
        try {
            p = new Person("bytetube",305);
        }catch (NoAgeException e){
            e.getMessage();
        }

        System.out.println(p);
    }
}
