package ca.bytetube.day16_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        //1.创建map集合
        Map<Student,String> map = new LinkedHashMap<>();
        //2.添加元素
        map.put(new Student("dal",30),"van");
        map.put(new Student("bob",30),"mtl");
        map.put(new Student("tony",30),"trt");
        map.put(new Student("eric",30),"cadiac");
        //3.取元素
        Set<Student> keySet = map.keySet();
        for (Student key : keySet) {
            String value = map.get(key);
            System.out.println(key+" lives in " + value);
        }

    }
}
