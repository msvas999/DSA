import java.math.BigInteger;

import static java.lang.Math.sqrt;

public class NumberOfCommonFactors {
    public static void main(String a[]){
        BigInteger x = new BigInteger(a[0]);
        BigInteger y = new BigInteger(a[1]);
        /*int cnt = 0;
        for(int i=1;i<=min(x,y);i++){
            if (x % i == 0 && y % i == 0) {
                System.out.println(i);
                cnt++;
            }

        }
        System.out.println("Total number of factors are: "+cnt);*/
        int gcd_value = x.gcd(y).intValue();
        int n = gcd_value;
        System.out.println("GCD: "+gcd_value);
        int cnt = 0;
        for (int i=1;i<=sqrt(n);i++){
            if(n % i == 0){
                cnt++;
                if (n / i != i)
                    cnt ++;
            }

        }
        System.out.println("Number of Common Factors are:  "+cnt);

    }
}
