package PatternProgramming;

public class PyramidShape {

    public static void printRightTriangle(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void printLeftTriangle(int n) {
        for (int i = 0; i<=n; i++) {
            for (int j = 2 * (n - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j=0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void printEqualTriangle(int n) {
        for (int i = 0; i<=n; i++) {
            for (int j = (n - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j=0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int n = 10;
        printRightTriangle(10);
        printLeftTriangle(10);
        printEqualTriangle(10);

    }
}
