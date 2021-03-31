package ca.bytetube.day19_mutiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo {
    public static void main(String[] args) {
//        //1.创建线程池对象
//        int numOfThread = 2;
//        ExecutorService threadPool = Executors.newFixedThreadPool(numOfThread);
//        //2.创建runnable 任务对象
//       ThreadTask task = new ThreadTask();
//        //3.从线程池获取线程对象，然后调用run方法
//        for (int i = 0; i < numOfThread; i++) {
//            threadPool.submit(task);
//        }
//
//        //4.关闭线程池
//        threadPool.shutdown();

        long l = System.currentTimeMillis();
        System.out.println(l);//1617156434691
    }
}
