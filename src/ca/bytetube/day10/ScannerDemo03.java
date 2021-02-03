package ca.bytetube.day10;

import java.util.Scanner;

/**
 * 获取用户的输入5个数，并找到其中的最大值
 * 1.array
 */
public class ScannerDemo03 {
    public static void main(String[] args) {
        //1.获取用户的数据
        Scanner sc = new Scanner(System.in);
        //2.把数据放入数组中
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("plz input your data:there are "+(arr.length - i)+" data to input: ");
            arr[i] = sc.nextInt();
        }
//        //2.5 查看数组中的数据
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//
//        }
        //3.在数组中找到最大值
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = max < arr[i] ? arr[i] : max;
//            if (max < arr[i]) {
//                max = arr[i];
//            }
        }
        System.out.println(max);

    }
}
