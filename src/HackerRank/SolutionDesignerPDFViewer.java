package HackerRank;

import java.util.*;

public class SolutionDesignerPDFViewer {

    public static void main(String[] args) {

        int[] intArray = new int[]{1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        String word = "abc";

        int value = designerPdfViewer(intArray, word);
        System.out.println(value);
    }

    static int designerPdfViewer(int[] h, String word) {
        //char[] charArray = new char[word.length()];
        char[] charArray = word.toCharArray();
        List<Integer> storeValueForMax = new ArrayList<>();
        //List<Character> characterList = new ArrayList<Character>();
        Map<Character, Integer> alphaCharacterValue = new HashMap<Character, Integer>();
        int maxValue = 0;
        int index = 0;
        for(char i='a'; i<='z'; i++){
            alphaCharacterValue.put(i, h[index]);
            index++;
        }

        for(Map.Entry<Character, Integer> e: alphaCharacterValue.entrySet()){
            System.out.println(e.getKey() + ":" + e.getValue());
            for(int i=0; i<charArray.length; i++) {
                if(charArray[i] == e.getKey()){
                    storeValueForMax.add(e.getValue());
                }

            }
        }
        maxValue = Collections.max(storeValueForMax);

        return maxValue * word.length();

    }
}
