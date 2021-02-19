package ca.bytetube.day14_exception;

public class Demo01 {

    public static void main(String[] args) {

            int[] arr = {34,12,67}; //创建数组
            //int num = ArrayTools.getElement(null,2);// 调用方法，获取数组中指定索引处元素
            int num = ArrayTools.getElement(arr,2);// 调用方法，获取数组中指定索引处元素
            System.out.println("num="+num);//打印获取到的元素值
    }
}
