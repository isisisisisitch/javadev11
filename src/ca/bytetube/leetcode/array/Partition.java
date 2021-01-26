package ca.bytetube.leetcode.array;

public class Partition {

    public static void partition(int[] array,int pivot){
        if (array == null || array.length < 2)  return;

        partition(array,0,array.length - 1, pivot);

    }

    //overload
    public static void partition(int[] array,int l, int r, int pivot){
            int less = l-1;
            int more = r + 1;
            while (l < more){
                if (array[l] < pivot) {
                    swap(array,++less,l++);

                }else if (array[l] > pivot) {
                    swap(array,--more,l);
                }else {
                    l++;
                }
            }

    }

    public static int[] getRandArray(int size,int bound){

        int[] randArray = new int[size];
        for (int i = 0; i < randArray.length; i++) {
            int randNum = (int) (Math.random() * bound)-(int) (Math.random() * bound);
            randArray[i] = randNum;
        }

        return randArray;
    }

    public static void swap(int[] array,int i, int j){

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }


    public static void main(String[] args) {
        int[] array = {10,2,4,56,21,67,9,12,33,-4};
        printArray(array);
        partition(array,2,6,21);
        System.out.println();
        printArray(array);
    }
}
