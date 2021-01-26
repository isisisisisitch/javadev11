package ca.bytetube.day06;



/**
 *
 */
public class Demo10 {
    public static void main(String[] args) throws Exception {
        int a = 10;
        int b = 11;
        int[] swapArr = swap(a, b);
        System.out.println(swapArr[0]);
        System.out.println(swapArr[1]);
//        swap(a, b);
//        System.out.println(a);
//        System.out.println(b);
    }

    public static int[] swap(int num1, int num2){
        int[] arr = new int[2];

        int temp = num1;
        num1 = num2;
        num2 = temp;

        arr[0] = num1;
        arr[1] = num2;
        return arr;

    }


}



