import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a[] = new int[t];
        for(int i=0 ; i<t ; i++) {
            a[i] = sc.nextInt()/2 + 1;
        }

        for(int i=0 ; i<t ; i++) {
            System.out.println(a[i]);
        }
    }
}