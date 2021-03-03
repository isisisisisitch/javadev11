package ca.bytetube.day15_collection;

public class ForEachDemo {
    public static void main(String[] args) {
        String[] persons = {"bytetube","dal","tony","bob"};

        for (String name : persons) {
            System.out.println(name);
        }
    }
}
