package ca.bytetube.day17_reviewCollection;

import java.util.Collection;
import java.util.LinkedList;

public class ArrayToCollection {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Collection<Integer> collection = arrayToCollection(arr);
        System.out.println(collection);
    }


    public static Collection<Integer> arrayToCollection(int[] arr){
        if (arr == null || arr.length == 0) return null;
        Collection<Integer> collection = new LinkedList<>();
        for (int element : arr) {
            collection.add(element);
        }

        return collection;
    }
}
