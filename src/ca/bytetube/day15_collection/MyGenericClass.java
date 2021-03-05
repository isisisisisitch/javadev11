package ca.bytetube.day15_collection;

public class MyGenericClass<MVP> {
    private MVP mvp;

    public MVP getMvp() {
        return mvp;
    }

    public void setMvp(MVP mvp) {
        this.mvp = mvp;
    }


    public static void main(String[] args) {
        MyGenericClass<String> my = new MyGenericClass<String>();
        my.setMvp("James");
        // 调⽤用getMVP
        String mvp = my.getMvp();
        System.out.println(mvp);

        MyGenericClass<Double> my2 = new MyGenericClass<Double>();
        my2.setMvp(20.2);
        // 调⽤用getMVP
        Double mvp2 = my2.getMvp();
        System.out.println(mvp2);
    }
}
