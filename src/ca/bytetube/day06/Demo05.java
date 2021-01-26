package ca.bytetube.day06;

public class Demo05 {
    public static void main(String[] args) {
        int[] array = {10,11,12,13,14};
        int element = 0;
        //element  = getElementFromArray(null, 8);
        try {
            element  = getElementFromArray(null, 8);
        }catch (Exception e){
            e.getStackTrace();
        }

        System.out.println("code is here");

//        System.out.println(array[3]);
//        System.out.println(array[4]);
//        //System.out.println(array[8]);//ArrayIndexOutOfBoundsException
//        array = null;
//        System.out.println(array[3]);//NullPointerException

    }

    public static int getElementFromArray(int[] arr,int index){
        if (arr == null) {
            throw new NullPointerException("array must not be null!");
        }
        if (index > arr.length - 1) {
            throw new ArrayIndexOutOfBoundsException("index is out of bounds!");
        }

        return arr[index];
    }
}
