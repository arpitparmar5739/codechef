import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int a[] = new int[T];

        for(int i=0 ; i<T ; i++) {
            a[i] = sc.nextInt();
            int temp = a[i]/5, j=2;
            
            while (a[i]/(int)Math.pow(5,j) > 0) {
                temp = temp + a[i]/(int)Math.pow(5,j);
                j++;
            }
            a[i] = temp;
        }

        for(int i=0 ; i<T ; i++) {
            System.out.println(a[i]);
        }
    }
}