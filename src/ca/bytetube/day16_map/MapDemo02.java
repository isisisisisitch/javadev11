package ca.bytetube.day16_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo02 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        //向map中添加元素
        map.put("dal","bytetube");
        map.put("jobs","apple");
        map.put("mask","tesla");

        Set<String> ks = map.keySet();
        for (String key : ks) {
            String value = map.get(key);
            System.out.println(key+" 的公司是 "+value);

        }


    }
}
