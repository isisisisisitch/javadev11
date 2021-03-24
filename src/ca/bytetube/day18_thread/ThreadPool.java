package ca.bytetube.day18_thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPool {
    public static void main(String[] args) throws Exception {
//        //创建线程池对象
//        ExecutorService executorService = Executors.newFixedThreadPool(3);
//        //创建Runnable 接口子类对象
//        MyRunnable2 task = new MyRunnable2();
//        //提交Runnable 接口子类对象
//        for (int i = 0; i < 5; i++) {
//            executorService.submit(task);
//        }
//        //关闭线程池
//        executorService.shutdown();

        //创建线程池对象
        ExecutorService service = Executors.newFixedThreadPool(2);//包含2 个线程对象
    //创建Callable 对象
        MyCallable c = new MyCallable();
    //从线程池中获取线程对象,然后调用MyRunnable 中的run()
        for (int i = 0; i < 5; i++) {
            Future<String> submit = service.submit(c);
            String s = submit.get();
            System.out.println(s);
        }


    //注意：submit 方法调用结束后，程序并不终止，是因为线程池控制了线程的关闭。将使用完的线程又归还到了线程池中
    //关闭线程池
    service.shutdown();
    }
}

