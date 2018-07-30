import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,j=0,k,temp;
        n = sc.nextInt();
        k = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>(n);
        for(int i=0 ; i<n ; i++) {
            temp = sc.nextInt();
            al.add(temp);

            if(temp % k == 0) {
                j++;
            }
        }

        System.out.println(j);
    }
}