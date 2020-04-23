package HackerRank;

import java.io.IOException;
import java.util.Scanner;

public class TwoDimensionArrayDS {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int row = arr.length;
        int column = arr[0].length;

        int arr1[][] = { {-9, -9, -9,  1, 1, 1},
                {0, -9,  0,  4, 3, 2},
                {-9, -9, -9,  1, 2, 3},
                {0,  0,  8,  6, 6, 0},
                {0,  0,  0, -2, 0, 0},
                {0,  0,  1,  2, 4, 0} };

        for(int i =0; i<=row-2; i++){
            for(int j=0; j<=column-2;j++){
                System.out.println(arr1[i][j]);
            }
        }

            return row;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

//        for (int i = 0; i < 6; i++) {
//            String[] arrRowItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            for (int j = 0; j < 6; j++) {
//                int arrItem = Integer.parseInt(arrRowItems[j]);
//                arr[i][j] = arrItem;
//            }
//        }

        int result = hourglassSum(arr);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}
