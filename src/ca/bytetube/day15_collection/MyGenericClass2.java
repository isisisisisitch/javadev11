package ca.bytetube.day15_collection;

import java.util.Collection;
import java.util.ArrayList;
public class MyGenericClass2{
   //⽐比如：现已知Object类，String 类，Number类，Integer类，其中Number是Integer的父类
    public static void main(String[] args) {

        Collection<Integer> list1 = new ArrayList<Integer>();
        Collection<String> list2 = new ArrayList<String>();
        Collection<Number> list3 = new ArrayList<Number>();
        Collection<Object> list4 = new ArrayList<Object>();

        getElement1(list1);
        //getElement1(list2);//报错
        getElement1(list3);
       // getElement1(list4);//报错

        //getElement2(list1);//报错
        //getElement2(list2);//报错
        getElement2(list3);
        getElement2(list4);
    }
    // 泛型的上限：此时的泛型?，必须是Number类型或者Number类型的⼦子类
    public static void getElement1(Collection<? extends Number> coll){}
    // 泛型的下限：此时的泛型?，必须是Number类型或者Number类型的⽗父类
    public static void getElement2(Collection<? super Number> coll){}
}
