import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int ans[] = new int[t];
        for(int i=0 ; i<t ; i++) {
            int h = sc.nextInt();
            int a[][] = new int[h][];
            for(int j=0 ; j<h ; j++) {
                a[j] = new int[j+1];
                for(int k=0 ; k<j+1 ; k++) {
                    a[j][k] = sc.nextInt();
                }
            }

            for(int j=h-1 ; j>=0 ; j--) {
                for(int k=0 ; k<j ; k++) {
                    a[j-1][k] += a[j][k]>a[j][k+1]?a[j][k]:a[j][k+1];
                }
            }
            ans[i] = a[0][0];
        }

        for(int i=0 ; i<t ; i++) {
            System.out.println(ans[i]);
        }
    }
}