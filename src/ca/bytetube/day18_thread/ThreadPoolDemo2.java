package ca.bytetube.day18_thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolDemo2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        //创建线程池对象
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        //创建一个Callable 接口子类对象
        //MyCallable c = new MyCallable();
        MyCallable2 c = new MyCallable2(100, 200);
        MyCallable2 c2 = new MyCallable2(10, 20);
        //获取线程池中的线程，调用Callable 接口子类对象中的call()方法, 完成求和操作
        //<Integer> Future<Integer> submit(Callable<Integer> task)
        // Future 结果对象
        Future<Integer> result = threadPool.submit(c);
        //此Future 的get 方法所返回的结果类型
        Integer sum = result.get();
        System.out.println("sum=" + sum);
        //再演示
        result = threadPool.submit(c2);
        sum = result.get();
        System.out.println("sum=" + sum);
        //关闭线程池(可以不关闭)
        threadPool.shutdown();
    }
}
