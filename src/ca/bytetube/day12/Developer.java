package ca.bytetube.day12;
//Developer is a(an) Employee
public  class Developer extends Employee{

    public Developer(String name, double salary, String id) {
        super(name, salary, id);
    }

    public void printName(){
        System.out.println("name:"+ this.name);
    }


    public  void work(){
        System.out.println("coding and debugging");
    }





    public static void main(String[] args) {
        Developer developer = new Developer("bytetube",100,"aer134");
//        developer.name = "bytetube";
//        developer.printName();//name:bytetube
//        developer.work();//work hard
    }
}
