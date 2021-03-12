package ca.bytetube.day16_map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo04 {
    public static void main(String[] args) {
        String s = "abbcadeccb";
        countNumOfString(s);
    }

    public static void countNumOfString(String s){
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c,1);
            }else {
                //先获取之前这个字符出现的次数
                Integer count = map.get(c);
                count++;
                map.put(c,count);
            }
        }

        System.out.println(map);

    }
}
