package ca.bytetube.day06;



/**
 * reverse array
 */
public class Demo09 {
    public static void main(String[] args) throws Exception {
        int[] randArray = getRandArray(10, 200);
        printArray(randArray);
        System.out.println();
        int[] reverseArray = reverseArray2(randArray);
        printArray(reverseArray);

    }

    //2.
    public static int[] reverseArray2(int[] array) throws Exception {
        if (array == null || array.length == 0) {
            throw new Exception("array must not be null! or array length should be at less 1");
        }
        int front = 0;
        int rear = array.length - 1;
        while (front < rear){
            swap(array,front,rear);
            front++;
            rear--;
        }
        return array;
    }

    public static void swap(int[] array,int i, int j){

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

    //1.
    public static int[] reverseArray1(int[] array) throws Exception {
        if (array == null || array.length == 0) {
            throw new Exception("array must not be null! or array length should be at less 1");
        }
        int[] newArr = new int[array.length];
        int cur = 0;
        for (int i = array.length - 1; i >= 0 ; i--) {
            newArr[cur] = array[i];
            cur++;
        }

        return newArr;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
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

}



