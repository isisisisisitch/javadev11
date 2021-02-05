package ca.bytetube.day11;

public class BubbleSort {

        public static void sort(int[] arr){
            if (arr == null || arr.length < 2) return;

            for (int i = 0; i < arr.length; i++) {//一共比较多少轮

                for (int j = 0; j < arr.length - 1 - i; j++) {//每轮比较的次数

                    if (arr[j] > arr[j + 1]) swap(arr,j,j+1);

                }
            }

        }

        public static void swap(int[] arr,int i,int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }

}
