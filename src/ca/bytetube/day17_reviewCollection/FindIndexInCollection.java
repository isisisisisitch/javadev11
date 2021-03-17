package ca.bytetube.day17_reviewCollection;

import java.util.ArrayList;
import java.util.Collection;

public class FindIndexInCollection {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(findIndexInCollection(list, 5,2));
    }


    public static int  findIndexInCollection(ArrayList<Integer> list, Integer target){
        if (list == null || list.size() == 0) {
            throw new NullPointerException("collection is null or size = 0");
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                return i;
            }
        }

        return -1;

    }

    public static int  findIndexInCollection(ArrayList<Integer> list, Integer target,int n){
        if (list == null || list.size() == 0) {
            throw new NullPointerException("collection is null or size = 0");
        }

        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                count++;
            }
            if (count == n) {
                return i;
            }
        }

        return -1;

    }
}
