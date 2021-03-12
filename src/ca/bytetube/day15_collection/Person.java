package ca.bytetube.day15_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Person implements Comparable<Person>{
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person p) {
        return this.age - p.age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Person> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,new Person("dal",30),
                new Person("bob",34),new Person("lucua",27),
                new Person("tony",20));

        System.out.println(arrayList);

        Collections.sort(arrayList, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {

                return p2.age - p1.age;
            }
        });

        Collections.sort(arrayList);

        System.out.println(arrayList);

    }


}
