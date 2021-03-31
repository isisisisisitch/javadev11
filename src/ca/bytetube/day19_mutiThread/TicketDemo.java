package ca.bytetube.day19_mutiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TicketDemo {
    public static void main(String[] args) {
//        //1.创建任务对象
//        Ticket ticket = new Ticket();
//
//        //2.创建线程对象
//        Thread w1 = new Thread(ticket,"win1");
//        Thread w2 = new Thread(ticket,"win2");
//        Thread w3 = new Thread(ticket,"win3");
//
//        w1.start();
//        w2.start();
//        w3.start();
        //1.创建线程池对象
        int numOfThread = 3;
        ExecutorService threadPool = Executors.newFixedThreadPool(numOfThread);
        //2.创建runnable 任务对象
        Ticket ticket = new Ticket();
        //3.从线程池获取线程对象，然后调用run方法
        for (int i = 0; i < numOfThread; i++) {
            threadPool.submit(ticket);
        }

        //4.关闭线程池
        threadPool.shutdown();


    }
}
