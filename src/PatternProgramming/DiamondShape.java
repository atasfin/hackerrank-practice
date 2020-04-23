package PatternProgramming;

public class DiamondShape {

    public static void printDiamondShape(int n) {

        for (int i = 0; i < n; i++) {
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }

            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        for (int i = n; i > 0; i--) {
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int n = 10;
        printDiamondShape(n);
    }
}
