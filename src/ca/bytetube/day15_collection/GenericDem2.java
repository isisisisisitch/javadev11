package ca.bytetube.day15_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericDem2 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList();
        coll.add("abc");
        coll.add("it");
        //coll.add(5);//由于集合没有做任何限定，任何类型都可以给其中存放
        Iterator it = coll.iterator();
        while(it.hasNext()){
//需要打印每个字符串串的⻓长度,就要把迭代出来的对象转成String类型
            String str = (String) it.next();
            System.out.println(str.length());
        }
    }
}
