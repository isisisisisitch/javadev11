package ca.bytetube.day17_reviewCollection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionToArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(100);
        list.add(200);
        list.add(300);
        Integer[] integerArray = collectionToArray2(list);
        printArray(integerArray);
    }

    public static Integer[] collectionToArray(Collection<Integer> collection){
        if (collection == null || collection.size() == 0) return null;

        Object[] objects = collection.toArray();
        Integer[] intArray = new Integer[objects.length];
        for (int i = 0; i < objects.length; i++) {
            intArray[i] = (Integer) objects[i];
        }

        return intArray;

    }

    public static Integer[] collectionToArray2(Collection<Integer> collection){
        if (collection == null || collection.size() == 0) return null;
        Integer[] intArray = new Integer[collection.size()];
        intArray = collection.toArray(intArray);

        return intArray;

    }

    private static void printArray(Integer[] integerArray){
        for (Integer i :integerArray) {
            System.out.print(i+" ");
        }
    }


}
