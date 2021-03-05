package ca.bytetube.day15_collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("abc");
        set.add("bcd");
        set.add("cde");
        set.add("abc");

        for (String s : set) {
            System.out.println(s);
        }
    }
}
