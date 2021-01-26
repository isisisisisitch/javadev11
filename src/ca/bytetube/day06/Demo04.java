package ca.bytetube.day06;

public class Demo04 {
    public static void main(String[] args) {
       double[] arr1 = new double[10];
       arr1[5] = 55;
        System.out.println(arr1[5]);
       double[] arr2 = arr1;
        arr2[5] = 555;
        System.out.println(arr1[5]);
    }
}
