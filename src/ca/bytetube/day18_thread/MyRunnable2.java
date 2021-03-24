package ca.bytetube.day18_thread;

public class MyRunnable2 implements Runnable {

    @Override
    public void run() {

        System.out.println("I need a dolphin");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("dolphin is coming: "
                +Thread.currentThread().getName());
        System.out.println("Saved my life and dolphin went back to the pool");
    }
}