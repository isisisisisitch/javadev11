package ca.bytetube.day10;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();

        arrayList.add("bytetube");//0
        arrayList.add("Dal");//1
        arrayList.add(1,"Tony");
        System.out.println(arrayList.get(1));//tony
        System.out.println(arrayList.size());//2 3
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        boolean removed = arrayList.remove("Tony");
        System.out.println("data removed:"+ removed);
        System.out.println();
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
