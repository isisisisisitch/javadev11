package ca.bytetube.day15_collection;

public class MyGenericMethod {

    public <T> void show(T mvp) {
        System.out.println(mvp.getClass());
    }

    public <MVP> MVP show2(MVP mvp) {
        return mvp;
    }

    public static void main(String[] args) {
        // 创建对象
        MyGenericMethod mm = new MyGenericMethod();
        // 演示看⽅方法提示
        mm.show("bytetube");
        mm.show(123);
        mm.show(12.45);
    }
}
