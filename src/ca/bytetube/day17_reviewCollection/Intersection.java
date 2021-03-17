package ca.bytetube.day17_reviewCollection;

import java.util.Arrays;
import java.util.HashSet;

public class Intersection {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] intersection = intersection(nums1, nums2);
        printArray(intersection);
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        //1.array to set
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int num :nums1) {
            set1.add(num);
        }
        for (int num :nums2) {
            set2.add(num);
        }

        if (set1.size() < set2.size()) {
           return compareElementInSets(set1,set2);
        }else {
            return compareElementInSets(set2, set1);
        }
    }

    private static int[] compareElementInSets(HashSet<Integer> setS,HashSet<Integer> setL){
        int[] res = new int[setS.size()];
        int index = 0;
        for (Integer s:setS) {
            if (setL.contains(s)){
                res[index++] = s;
            }
        }

        return Arrays.copyOf(res,index);
    }

    private static void printArray(int[] integerArray){
        for (int i :integerArray) {
            System.out.print(i+" ");
        }
    }
}
