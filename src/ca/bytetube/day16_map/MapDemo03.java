package ca.bytetube.day16_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
public class MapDemo03 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        //向map中添加元素
        map.put("dal","bytetube");
        map.put("jobs","apple");
        map.put("mask","tesla");


        Set<Entry<String, String>> entrySet = map.entrySet();

        for (Entry<String,String> entry : entrySet) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" 的公司是 "+value);
        }
    }
}
