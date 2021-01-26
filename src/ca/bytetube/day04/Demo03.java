package ca.bytetube.day04;

/**
 * while loop
 */
public class Demo03 {
    public static void main(String[] args) {
        //1
        int i = 2;
        int res = 0;
        while (i< 101){
            //3
            res += i;
            //4
            i+=2;
        }
        System.out.println(res);


//        int res = 0;
//        int i =1;
//        while (i < 101){
//            if (i % 2 == 0) {
//                res += i;
//                i++;
//            }else {
//                i++;
//            }
//        }
//
//        System.out.println(res);

    }
}
