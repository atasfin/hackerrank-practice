import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;


public class SolutionCloud {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {

        int jumpCount = 0;
        for (int i = 0; i < c.length; ++i) {
            if (c[i] != 1){
                if (i + 2 < c.length && c[i + 2] != 1) {
                    jumpCount++;
                    i=i+1;
                    System.out.println("i=" + i + "numOfZero=" + jumpCount);
                } else if (i + 1 < c.length && c[i + 1] != 1) {
                    jumpCount++;
                    System.out.println("i=" + i + "numOfZero=" + jumpCount);

                }
            }
        }
        return jumpCount;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[] c = new int[]{0,0 ,0 ,0, 1, 0};
        int result = jumpingOnClouds(c);
        System.out.println("result" + result);
    }
}
