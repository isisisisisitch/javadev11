package ca.bytetube.day15_collection;

public class Test {
    public static void main(String[] args) {
        String name = "Dal Luo";
        String[] res = name.split(" ");
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
