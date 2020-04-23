package HackerRank;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int altitude = 0, valleyCounter = 0;
        char [] valleyPath = s.toCharArray();
        for(int i = 0; i <n ; i++){
            if(valleyPath[i] == 'D' || valleyPath[i] == 'd'){
                altitude--;
                System.out.println("--ve altitude =" + altitude);

            }
            else {
                altitude++;
                if(altitude == 0){
                    valleyCounter++;
                }
                System.out.println("++ve altitude =" + altitude);
            }

        }
        return valleyCounter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = 8;
        String s = "UUUUDDDD";
        int result = countingValleys(n, s);
        System.out.println("result" + result);

    }
}
