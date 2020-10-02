package HackerRank;

public class SolutionUtopianTree {
    // Complete the utopianTree function below.
    static int utopianTree(int n) {
        int height=0;
        for(int period=0; period<=n; period++){
            if(period==0){
                height = 1;
            } else if (period%2!=0){
                height = 2 * height;
            } else {
                height++;
            }
            System.out.println("period " + period + ":" + "height " + height);
        }
        return height;
    }


    public static void main(String[] args)  {

        int[]  t = {} ;
        int n = 5;
        int result = utopianTree(n);
        System.out.println("result:"+result);
    }

}
