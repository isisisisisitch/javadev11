package ca.bytetube.day12;

import java.util.ArrayList;
import java.util.Random;

public class Host extends User{
    ArrayList<Double> redPacks;



    public Host(String userName, double balance) {
        super(userName, balance);
    }

    public void sendMoney(double amount , int n){
        this.setBalance(this.getBalance() - amount);
        Random random = new Random();
        redPacks = new ArrayList<>();
        double unit = 0;
        double rest = amount;
        double res = 0;
        for (int i = 0; i < n - 1; i++) {
            rest = rest - unit;
            unit = random.nextDouble()*rest;//(0,1)
            redPacks.add(unit);
            res += unit;
        }
        redPacks.add(amount- res);


    }
}
