package ca.bytetube.day19_mutiThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable{
    int ticket = 100;
    Lock ck = new ReentrantLock();
    @Override
    public void run() {
        while (true){
            if (ticket <= 0) break;
            //sellTicket();
            ck.lock();
                if (ticket > 0) {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+" is selling ticket:" + ticket--);
                }
                ck.unlock();


        }
    }

    public synchronized void sellTicket(){
        if (ticket > 0) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" is selling ticket:" + ticket--);
        }
    }
}
