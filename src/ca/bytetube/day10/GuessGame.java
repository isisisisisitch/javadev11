package ca.bytetube.day10;

import java.util.Scanner;
import java.util.Random;
/**
 */
public class GuessGame {


    //1.产生[1,100]随机数
    private  int getRandNum(int bound){
        Random random = new Random();
        return  random.nextInt(bound)+1;//[1,100];
    }

    //2.获取用户的输入
    private  int getUserData(){
        System.out.println("input:");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void main(String[] args) {
        GuessGame game = new GuessGame();
       int n = 100;
        int randNum = game.getRandNum(n);
        System.out.println(randNum);
        int guessNumber = game.getUserData();

        while(guessNumber != randNum){

            if(guessNumber > randNum){
                System.out.println("lesser");

                guessNumber =  game.getUserData();
            }else if(guessNumber < randNum){
                System.out.println("larger");

                guessNumber =  game.getUserData();

            }

        }
        System.out.println("you bet!");
    }

}
