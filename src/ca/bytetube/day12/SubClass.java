package ca.bytetube.day12;

public class SubClass extends SuperClass{
    int SubAttr ;

    public SubClass(int superAttr,int SubAttr) {
        super(superAttr);
        this.SubAttr = SubAttr;
    }

    public SubClass() { }

    @Override
    public void show(){
        System.out.println("SubClass show");
    }


    public static void main(String[] args) {
//        SubClass sb = new SubClass(10,11);


    }
}
