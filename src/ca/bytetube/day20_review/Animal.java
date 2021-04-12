package ca.bytetube.day20_review;

public class Animal {

    int life = 1;

    public void eat(){
        System.out.println("animal eats");
    }

    public <A> A showData(A data){
        return data;
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.showData(1));
    }
}
