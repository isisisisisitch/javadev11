package ca.bytetube.day20_review;

import ca.bytetube.day19_mutiThread.Input;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 1。获取用户的输入（Mon,Tue,Wed,4,5,6,7...sth else）
 * 2。根据当前用户的输入给出相应的输出 1~5 --- work hard  6,7---- happy weekend(Ternary Operator) error data
 *
 *  Map map = new HashMap();
 * //  map.put("Mon",1);

 */
public class TernaryOperatorDemo {

    public static int getUserInput(){
        System.out.println("plz input your date:");
        Scanner scan = new Scanner(System.in);
        String userInput = scan.next();
        HashMap<String, Integer> map = new HashMap<>();
        switch (userInput){
            case "Mon":
                map.put(userInput,1);
        }

        return map.get(userInput);


    }

    public static String outPut(int date){
        String res = date >= 1 && date <= 5 ? "work hard": date >= 6 && date <= 7 ? "happy weekend": "error data";

        return res;

    }

    public static void main(String[] args) {
        int date = getUserInput();
        String res = outPut(date);
        System.out.println(res);
    }

}
