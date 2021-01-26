package ca.bytetube.day03;

import java.util.Scanner;

//switch
public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("plz input the date:");
        String date = scanner.next().toUpperCase();
       // System.out.println(date);
        switch (date){
            case "MON":
                System.out.println("running");
                break;
            case "WED":
                System.out.println("reading");
                break;
            case "FRI":
                System.out.println("shopping");
                break;
            default:
                System.out.println("sleeping");
                break;
        }
    }
}
