package ca.bytetube.day11;

import java.util.Arrays;
import java.util.Random;

public class ArraysDemo01 {
    public static void main(String[] args) {
        int[] arr =  getRandArray(100,10);
        printArray(arr);
        System.out.println();
        System.out.println("========================");
        BubbleSort.sort(arr);//quickSort(数据量大) insertSort/mergeSort(数据量小)
        printArray(arr);
//        int resIndex = Arrays.binarySearch(arr, 56);
//        System.out.println();
//        System.out.println(resIndex);

//        Student student1 = new Student("bytetube",5);
//        Student student2 = new Student("dal",30);
//        Student student3 = new Student("tony",35);
//        Student[] students = {student1,student2,student3};
//        printStudents(students);
//        System.out.println();
//        System.out.println("========================");
//        //Arrays.sort(students);
//        Arrays.sort(students,new StudentComparator());
////        String StudentString = Arrays.toString(students);
////        System.out.println(StudentString);
//        printStudents(students);
    }

    public static int[] getRandArray(int bound,int size){
        int[] arr = new int[size];
        arr[0] = 56;
        Random random = new Random();

        for (int i = 1; i < arr.length; i++) {
            arr[i] =  random.nextInt(bound);
        }


        return arr;

    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    public static void printStudents(Student[] students){
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i]+" ");
        }
    }



}
