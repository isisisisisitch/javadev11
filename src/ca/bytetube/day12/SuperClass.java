package ca.bytetube.day12;

public class SuperClass extends Object{
    int superAttr;

    public SuperClass() { }

    public SuperClass(int superAttr) {
        this.superAttr = superAttr;
    }

    public void show(){
        System.out.println("superClass show");
    }

}
