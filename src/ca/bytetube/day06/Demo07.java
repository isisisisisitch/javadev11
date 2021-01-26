package ca.bytetube.day06;


/**
 * get max element from array
 */
public class Demo07 {
    public static void main(String[] args) throws Exception {

//       int[] arr = {10,2,18,99,-4,6};
//        int max = getMax(arr);
//        System.out.println(max);
        int[] randArray = getRandArray(20,500);
        printArray(randArray);
        int max = getMax(randArray);
        System.out.println();
        System.out.println(max);

    }

    public static int getMax(int[] arr) throws Exception {
        if (arr == null || arr.length == 0) {
            throw new Exception("array must not be null! or array length should be at less 1");
        }
        int max = arr[0];
        //int cur = 0;//index
        for (int i = 0; i < arr.length; i++) {
//            if (max < arr[i]) {
//                max = arr[i];
//            }
            max = max < arr[i] ? arr[i]:max;
            //cur++;
        }

        return max;
    }

    public static int[] getRandArray(int size,int bound){

        int[] randArray = new int[size];
        for (int i = 0; i < randArray.length; i++) {
            int randNum = (int) (Math.random() * bound)-(int) (Math.random() * bound);
            randArray[i] = randNum;
        }

       return randArray;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }


}



