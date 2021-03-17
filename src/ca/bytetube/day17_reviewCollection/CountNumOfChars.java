package ca.bytetube.day17_reviewCollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountNumOfChars {

    public static void main(String[] args) {
        String s = "aabbdfgggtt";
        Map<Character, Integer> map = countNumOfChars(s);
        System.out.println(map);
    }

    public static Map<Character,Integer> countNumOfChars(String s){
        //0.参数判断
        if (s == null || s.length() == 0) {
            return null;
        }
        //1.创建map集合
        Map<Character,Integer> map = new LinkedHashMap<>();
        //2.遍历字符串串得到每个字符
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            //3.判断Map中是否有该键
            if (!map.containsKey(ch)) {
                map.put(ch,1);
            }else {
                //4.如果有，则说明已经出现过，获取到对应的值进行++，再次存储
                Integer count = map.get(ch);
                count++;
                map.put(ch,count);
            }
        }


        return map;

    }


}
