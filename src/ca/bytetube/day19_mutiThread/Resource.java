package ca.bytetube.day19_mutiThread;

public class Resource {
    private String name;
    private String sex;

    private boolean haveResource = false;


    //input thread
    public synchronized void setResource(String name,String sex){
        //1.有数据
        if (haveResource) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //2.无数据
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.name = name;
        this.sex = sex;
        //设置完数据，Resource中有值了，haveResource改变其状态为true
        haveResource = true;
        //唤醒output线程
        this.notify();

    }

    public synchronized void getResource(){
        //1.无数据
        if (!haveResource) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //2.有数据 将Resource输出
        System.out.println("name: "+this.name+", sex: "+this.sex );
        //输出完数据，Resource中无值了，haveResource改变其状态为false
        haveResource = false;

        //唤醒input线程
        this.notify();
    }




}
