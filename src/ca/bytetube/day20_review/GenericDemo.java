package ca.bytetube.day20_review;

public class GenericDemo<E> {
    private  E data ;

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }


    public <T> T showData(T data){
        return data;
    }


    public static void main(String[] args) {
        GenericDemo<Integer> generic = new GenericDemo<>();
        generic.setData(100);
       // System.out.println(generic.getData());

//        System.out.println(generic.showData());

        System.out.println(generic.showData("bytetube"));
    }
}
