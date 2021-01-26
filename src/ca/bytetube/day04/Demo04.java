package ca.bytetube.day04;

/**
 * break,continue
 */
public class Demo04 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i+" ");
        }

    }
}
