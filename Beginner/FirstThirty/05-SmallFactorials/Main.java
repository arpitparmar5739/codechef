import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        BigInteger a[] = new BigInteger[T];

        for(int i=0 ; i<T ; i++) {
            a[i] = BigInteger.valueOf(sc.nextInt());
            int j=a[i].intValue()-1;
            while(j>1) {
                a[i] = a[i].multiply(BigInteger.valueOf(j));
                j--;
            }
        }

        for(int i=0 ; i<T ; i++) {
            System.out.println(a[i]);
        }
    }
}