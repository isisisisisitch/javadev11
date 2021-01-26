package ca.bytetube.leetcode.array;

/**
 * https://leetcode.com/problems/merge-sorted-array/
 * @author dal
 */
public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int l1 = m - 1;
        int l2 = n - 1;
        int curr = nums1.length - 1;
        //把nums2merge到nums1中
        while (l2 >= 0){
            if (l1 >= 0 && nums2[l2] < nums1[l1]) {
                nums1[curr--] = nums1[l1--];
            }else {//l1 < 0 || nums2[l2] > nums1[l1]
                nums1[curr--] = nums2[l2--];
            }
        }
    }

    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums2 == null) {
            return ;
        }

        int l1 = 0;
        int l2 = 0;
        int curr = 0;
        int[] nums3 = new int[m + n];

        //1. 比较nums1和nums2数组中的元素大小，将较小者放入nums3中
        while (l1 <= m - 1 && l2 <= n - 1){
            if (nums1[l1] <= nums2[l2]) {
                nums3[curr++] = nums1[l1++];
//            l1++;
//            curr++;
            }else {
                nums3[curr++] = nums2[l2++];
            }
        }

        //2.1. nums1有效元素遍历完了，则把nums2剩余元素放入nums3中
        if (l1 > m-1) {
            while (l2 <= n - 1) {
                nums3[curr++] = nums2[l2++];
            }
        }
        //2.2. nums2有效元素遍历完了，则把nums1剩余元素放入nums3中
        else if (l2 > n - 1) {
            while (l1 <= m - 1) {
                nums3[curr++] = nums1[l1++];
            }
        }
        for (int i = 0; i < nums3.length; i++) {
            nums1[i] = nums3[i];
        }

    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1,3,nums2,3);
        printArray(nums1);
    }
}
