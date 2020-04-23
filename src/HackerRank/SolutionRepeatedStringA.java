package HackerRank;

import java.io.IOException;
import java.util.Scanner;

public class SolutionRepeatedStringA {

    // Complete the repeatedString function below.
    static long repeatedString(String s, Long n) {

        long numberOfAFoundInString = 0;
        long numberOfTimeShouldIterate = (long) (n / s.length());
        int remainderOfString = (int) (n % s.length());
        //char[] newS = s.toCharArray();

        for (char ch: s.toCharArray()) {
            if (ch == 'a' || ch == 'A') {
                numberOfAFoundInString++;
            }
        }

        long total = numberOfTimeShouldIterate * numberOfAFoundInString;
        if (remainderOfString == 0) {
            return total;
        } else {
            String finalString = s.substring(0, remainderOfString);
            for (char ch : finalString.toCharArray()) {
                if (ch == 'a' || ch == 'A') {
                    total++;
                }
            }
            return total;
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = "a";
        long n = 1000000000000L;
        long result = repeatedString(s, n);
        System.out.println("Number of {a}  in the string:=" + result);

    }
}
