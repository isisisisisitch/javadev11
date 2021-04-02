package ca.bytetube.day19_mutiThread;

public class TestResource {
    public static void main(String[] args) {
        //资源
        Resource resource = new Resource();
        //任务类1
        Input inputTask = new Input(resource);
        //任务类2
        OutPut outPutTask = new OutPut(resource);
        //线程类1
        Thread t1 = new Thread(inputTask,"t1");
        //线程类2
        Thread t2 = new Thread(outPutTask,"t2");

        t1.start();
        t2.start();
    }
}
