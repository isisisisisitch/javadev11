package ca.bytetube.day04;

/**
 * for for
 * 5*8 matrix
 */
public class Demo07 {
//    public static void main(String[] args) {
//        for (int i = 1; i < 6; i ++ ){
//            for(int j = 1; j <= i; j++){
//                if(j != i){
//                    System.out.print("*" + " ");
//                }else{
//                    System.out.println("*");
//                }
//            }
//        }
//    }
public static void main(String[] args) {
    for (int i = 0; i < 5; i++){
        for (int j = 0; j <= i; j++){
            System.out.print ("*" + " ");
        }
        System.out.println ();
    }

}
}
