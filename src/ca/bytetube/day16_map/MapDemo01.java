package ca.bytetube.day16_map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo01 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        //向map中添加元素
//        map.put("bytetube","dal");
//        map.put("bytetube","jobs");
//        map.put("tesla","mask");
        add("bytetube","dal",map);

        add("bytetube","jobs",map);
        System.out.println(map);
        String removed = map.remove("tesla");
        System.out.println(removed);
        System.out.println(map);

        String s = map.get("tesla");
        System.out.println(s);//null


    }

    public static void add(String key, String value,Map<String,String> map){
        if (!map.containsKey(key)){
            map.put(key,value);
        }
    }
}
