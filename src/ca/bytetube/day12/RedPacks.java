package ca.bytetube.day12;

public class RedPacks {
    public static void main(String[] args) {
        Host host = new Host("bytetube",100);
        Member member1 = new Member("jim",100);
        Member member2 = new Member("tony",100);
        Member member3 = new Member("eric",100);
        Member member4 = new Member("ali",30);
        host.sendMoney(50,3);
        member1.recMoney(host);
        member2.recMoney(host);
        member3.recMoney(host);
        member4.recMoney(host);
        System.out.println(host.showUerInfo());

        System.out.println(member1.showUerInfo());
        System.out.println(member2.showUerInfo());
        System.out.println(member3.showUerInfo());
        System.out.println(member4.showUerInfo());


    }
}
