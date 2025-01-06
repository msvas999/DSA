import static java.lang.Math.min;

public class NumberOfCommonFactors {
    public static void main(String a[]){
        int x = 4;
        int y = 8;
        for(int i=2;i<=min(x,y);i++){
            if (x % i == 0 && y % i == 0) {
                System.out.println(i);
            }

        }

    }
}
