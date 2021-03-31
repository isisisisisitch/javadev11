package ca.bytetube.day19_mutiThread;

import java.util.Random;

public class ThreadTask implements Runnable{

    int x = new Random().nextInt(1);//0,1
    @Override
    public void run() {
        while (true){
//            synchronized (this){
                if(x % 2 == 0){
                    synchronized (MyLock.lockA){
                        System.out.println("X-lockA");
                        synchronized (MyLock.lockB){
                            System.out.println("X-lockB");
                            System.out.println("get bonus");
                        }
                    }
                }else {
                    synchronized (MyLock.lockB){
                        System.out.println("Y-lockB");
                        synchronized (MyLock.lockA){
                            System.out.println("Y-lockA");
                            System.out.println("get bonus");
                        }
                    }
                }
//            }

            x++;
        }
    }
}
