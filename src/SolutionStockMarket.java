import java.io.*;
import java.util.*;

public class SolutionStockMarket {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        int pairOfSocks = 0;

        Map<Integer, Integer> numberMap = new HashMap<Integer, Integer>();

        for(int index = 0; index < ar.length ; index++){
            if(numberMap.containsKey(ar[index])){
                int count = numberMap.get(ar[index]);
                count++;
                numberMap.put(ar[index], count);
            } else {
                numberMap.put(ar[index], 1);
            }
        }
        for(int key: numberMap.keySet()){
            if(numberMap.get(key) > 1){
              pairOfSocks +=  numberMap.get(key) / 2;
            }
        }

        return pairOfSocks;
    }

    public static void main(String[] args) throws IOException {
        int n = 9;
        int[] ar = new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20};
        int result = sockMerchant(n, ar);
        System.out.println("result=" + result);

    }
}
