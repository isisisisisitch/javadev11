package ca.bytetube.day05;


public class Demo02 {
    public static void main(String[] args) {

        System.out.println( sum(1000));
    }

    public static int sum(int bound){
        int res = 0;
        for(int i = 1; i <= bound; i++){
            res += i;
        }
        return res;
    }



}
