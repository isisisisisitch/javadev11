package ca.bytetube.day15_collection;

import java.util.ArrayList;
import java.util.Collections;

//addAll()
//shuffle()
//sort
public class CollectionsDemo {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        Collections.addAll(arrayList,1,10,100,1000);
//        System.out.println(arrayList);
//        Collections.shuffle(arrayList);
//        System.out.println(arrayList);
//        Collections.sort(arrayList);
//        System.out.println(arrayList);

        ArrayList<String> stringArrayList = new ArrayList<>();
        Collections.addAll(stringArrayList,"ab","bc","abc");
        System.out.println(stringArrayList);
        Collections.shuffle(stringArrayList);
        System.out.println(stringArrayList);
        Collections.sort(stringArrayList);
        System.out.println(stringArrayList);
    }
}
