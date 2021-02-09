package HackerRank;

import java.io.IOException;
import java.util.*;

public class SolutionTwoDimensionArrayDS {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int row = arr.length;
        int column = arr[0].length;
        int maxSum = 0;
        List<Integer> listOfNumber = new ArrayList<>();
        arr = new int[][]{
                {-9, -9, -9, 1, 1, 1},
                {0, -9, 0, 4, 3, 2},
                {-9, -9, -9, 1, 2, 3},
                {0, 0, 8, 6, 6, 0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };

        for (int i = 0; i < row - 2; i++) {
            for (int j = 0; j < column - 2; j++) {
                //System.out.println(arr1[i][j]);
                listOfNumber.add(arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]);
            }
        }
        maxSum = Collections.max(listOfNumber);
        return maxSum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[][] arr = new int[6][6];


        int result = hourglassSum(arr);
        System.out.println("Printing the value:" + result);

    }
}
