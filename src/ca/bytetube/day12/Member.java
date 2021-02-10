package ca.bytetube.day12;

import java.util.ArrayList;

public class Member extends User{

    public Member(String userName, double balance) {
        super(userName, balance);
    }

    public void recMoney(Host host){
        ArrayList<Double> packs = host.redPacks;
        if (packs.isEmpty()){
            System.out.println("see you next time");
            return;
        }
        Double pack = packs.remove(0);
        this.setBalance(this.getBalance() + pack);

    }
}
