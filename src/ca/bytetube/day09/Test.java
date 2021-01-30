package ca.bytetube.day09;

/**
 * 3种方式对类成员进行初始化
 * 1.obj.attribute = xxx(attribute not private  ,not safe)
 * 2.setXX(XX xx)
 * 3.Constructor
 * 4.反射（.class）
 * 5.design pattern
 */
public class Test {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setName("bytetube");
        user1.setAge(5);
        user1.setAddress("van");
        System.out.println(user1);
       // System.out.println(user1.getName()+","+user1.getAge()+","+user1.getAddress());
        User user2 = new User("Dal","mtl",30);
        System.out.println(user2);
        //System.out.println(user2.getName()+","+user2.getAge()+","+user2.getAddress());
//        String name = "bytetube";
//        System.out.println(name);
    }
}
