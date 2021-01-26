package ca.bytetube.day05;

//add(a,b)
public class Demo03 {
    public static void main(String[] args) {
        int res = add(10, 20);
        System.out.println(res);

    }
    //add overload
    public static int add(int num1, int num2){
        int res = num1 + num2;
        return res;
    }

    public static double add(double num1, double num2){
        double res = num1 + num2;
        return res;
    }

    public static double add(int num1, double num2){
        double res = num1 + num2;
        return res;
    }

    public static double add(double num1, int num2){
        double res = num1 + num2;
        return res;
    }

    public static double add(double num1, int num2,double num3){
        double res = num1 + num2 + num3;
        return res;
    }




}
