package ca.bytetube.day15_collection;

public class ParamsDemo {
    public static void main(String[] args) {
        System.out.println(add(10,11,10,32));
    }

    public static int add(int... num){
        int res = 0;

        for (int i: num) {
            res += i;
        }

        return res;

    }
}
