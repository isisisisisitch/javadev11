package ca.bytetube.day18_thread;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+" is executing! "+i);
        }

    }
}
