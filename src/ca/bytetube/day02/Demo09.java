package ca.bytetube.day02;

//method--->function--->api
/**
 * two nums sum
 * num1,num2(int)
 * res(int)
 */
public class Demo09 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = sum(a,b);
        System.out.println(c);
    }


    public static int sum(int num1,int num2){
        int res = num1 + num2;
        return res;
    }
}
