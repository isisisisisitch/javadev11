package ca.bytetube.day05;


import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        int userInput = getUserInput();
        String res = judge(userInput);
        System.out.println(res);
    }

    //1.get user input
    public static int getUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("pls input what you want:");
        int userInput = scanner.nextInt();
        return userInput;
    }

    //2.judge odd even
    public static String judge(int num){
        String res = num % 2 == 0 ? num + " 是偶数" : num + " 是奇数";
        return res;
    }


}
