package ca.bytetube.day17_reviewCollection;

import java.util.ArrayList;
import java.util.Collection;

public class CountNumOfElement {

    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        System.out.println("a:"+countNumOfElement(list, "a"));
        System.out.println("b:"+countNumOfElement(list, "b"));
        System.out.println("c:"+countNumOfElement(list, "c"));
        System.out.println("xxx:"+countNumOfElement(list, "xxx"));
    }


    public static int countNumOfElement(Collection<String> list,String element){
        if (list == null || list.size() == 0) return 0;
        if (element == null ) return 0;
        int count = 0;
        for (String s : list) {
            if (element.equals(s)) {
                count++;
            }
        }

        return count;

    }
}
