package ca.bytetube.day14_exception;

public class Demo03 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        try {
            arr[0] = 10;
            arr[1] = 100;
            arr[2] = 1000;
           int index = 5;
            if (index < 0 || index > arr.length - 1) {
                throw new ArrayIndexOutOfBoundsException("error index，"+index+"does not exisit");
            }
            System.out.println(arr[index]);
        }catch (ArrayIndexOutOfBoundsException e){

            System.out.println("there is an exception !");
            System.out.println(arr[arr.length - 1]);
        }finally {
            arr = null;
        }

        System.out.println("code is here");
    }
}
