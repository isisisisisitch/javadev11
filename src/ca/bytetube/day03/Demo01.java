package ca.bytetube.day03;


import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("pls input what you want:");
        int userInput = scanner.nextInt();
//        System.out.println("user's input :"+userInput);
//        if (userInput % 2 == 0) {
//            System.out.println(userInput+" 是偶数");
//        }else {
//            System.out.println(userInput+" 是奇数");
//        }
        String res = userInput % 2 == 0 ? userInput + " 是偶数" : userInput + " 是奇数";
        System.out.println(res);
    }
}
