import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n>0) {
            int a[] = new int[n],b[] = new int[n];
            int j=0;
            boolean same=true;

            for(j=0 ; j<n ; j++) {
                a[j] = sc.nextInt();
            }

            for(j=0; j<n ; j++) {
                b[a[j]-1] = j+1;
            }

    check: for(j=0; j<n ; j++) {
                if(b[j] != a[j]) {
                    System.out.println("not ambiguous");
                    break check;
                }
            }

            if(j==n) {
                System.out.println("ambiguous");
            } 

            n = sc.nextInt();
        }
    }
}