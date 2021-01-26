package ca.bytetube.day07;

public class Demo02 {
    public static void main(String[] args) {
       int[][] arrs = new int[3][];
        System.out.println(arrs);
        System.out.println(arrs[0]);
        System.out.println(arrs[1]);
        System.out.println(arrs[2]);
        arrs[0] = new int[5];
        arrs[1] = new int[2];
        arrs[2] = new int[8];
        System.out.println(arrs[0]);
        System.out.println(arrs[1]);
        System.out.println(arrs[2]);
    }
}
