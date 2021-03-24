package ca.bytetube.day18_thread;

public class Test {
    public static void main(String[] args) {
//       new Thread("bytetube"){
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println(Thread.currentThread().getName()+" is executing! "+i);
//                }
//            }
//        }.start();



        Runnable task = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+" is executing! "+i);
                }
            }
        };

        Thread t1 = new Thread(task,"bytetube1");
        Thread t2 = new Thread(task,"bytetube2");
        t1.start();
        t2.start();

    }
}
