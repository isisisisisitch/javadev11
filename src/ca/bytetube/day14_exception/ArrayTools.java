package ca.bytetube.day14_exception;

public class ArrayTools {

    public static int getElement(int[] arr, int index) throws NullPointerException, ArrayIndexOutOfBoundsException{
        if (arr == null) {
            throw new NullPointerException("arr is null !");
        }

        if (index < 0 || index > arr.length - 1) {
            throw new ArrayIndexOutOfBoundsException("error index，"+index+"does not exisit");
        }

        int ele = arr[index];
        return ele;

    }
}
