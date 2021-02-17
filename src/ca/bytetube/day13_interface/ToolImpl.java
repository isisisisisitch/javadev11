package ca.bytetube.day13_interface;

public class ToolImpl implements Tools{
    @Override
    public void func1() {
        System.out.println("this is ToolImpl method");
    }

    public static void main(String[] args) {
        ToolImpl tool = new ToolImpl();
        tool.func1();
        tool.func3();
        Tools.func2();
    }
}
