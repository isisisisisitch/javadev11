package ca.bytetube.day18_thread;

public class ThreadDemo01 {

    String name;
    ThreadDemo01(String name){
        this.name = name;
    }
    void show() {
        for (int i=1;i<=10000 ;i++ ) {
            System.out.println("name="+name+",i="+i);
        }
    }

    public static void main(String[] args) {
        ThreadDemo01 d = new ThreadDemo01("bytetube");
        ThreadDemo01 d2 = new ThreadDemo01("dal");
        d.show();
        d2.show();
        System.out.println("Hello World!");
    }

}
