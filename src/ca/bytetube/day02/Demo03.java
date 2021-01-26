package ca.bytetube.day02;

public class Demo03 {
    public static void main(String[] args) {
        int a = 10;
        int b = 100;
        int c = 1000;
//                //10×99 - 1000/12
//        int sum = a++ * --b - c++ / ++a;//906 998 992 980 996 907
//
//        System.out.println(sum);
                //100 -(999 + 10)%11 + 999 * 101
                //100 - 8 +  100899 =100991
        int sum = b++ -(--c + a++)%a-- + c++ * b--;//100091 9996 100993 99892
        System.out.println(sum);
    }

}
