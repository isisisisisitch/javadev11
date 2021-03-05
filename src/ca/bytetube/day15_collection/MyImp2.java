package ca.bytetube.day15_collection;

public class MyImp2<E> implements MyGenericInterface<E> {
    private E element;

    @Override
    public void add(E e) {
        element = e;
    }

    @Override
    public E getE() {
        return element;
    }

    public static void main(String[] args) {
        MyImp2<String> myImp = new MyImp2<>();
        myImp.add("bytetube");
        System.out.println(myImp.getE());

        MyImp2<Long> myImp2 = new MyImp2<>();
        myImp2.add(100L);
        System.out.println(myImp2.getE());
    }
}
