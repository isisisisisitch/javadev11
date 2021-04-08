package ca.bytetube.day20_review;

import java.util.Scanner;

/**
 * 90~100 excellent
 * 80~89 very good
 * 70~79  good
 * 60~69 passed
 * <60 failed
 *
 * 1。获取学生的分数
 * 2。grading
 *
 */

public class IfDemo01 {
    public static void main(String[] args) throws Exception {
        double score = getScore();
        System.out.println(grading(score));
    }

    public static double getScore(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("plz input your score: ");
        return scanner.nextDouble();
    }


    public static String grading(double score) throws Exception {
        if (score < 0 || score > 100)  throw new Exception("your score is wrong!");
        if (score >= 90 && score <= 100 )  return "excellent";

        else if (score >=80 && score <= 89) return "very good";

        else if (score >=70 && score <= 79) return"good";

        else if (score >=60 && score <= 69 ) return "passed";

        else return "failed";

    }
}
