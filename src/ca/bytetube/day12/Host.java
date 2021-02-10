package ca.bytetube.day12;

import java.util.ArrayList;

public class Host extends User{
    ArrayList<Double> redPacks;



    public Host(String userName, double balance) {
        super(userName, balance);
    }

    public void sendMoney(double amount , int n){
        this.setBalance(this.getBalance() - amount);
        double unit = amount / n;
        redPacks = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            redPacks.add(unit);
        }

    }
}
