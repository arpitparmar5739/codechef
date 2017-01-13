import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x=0,y=0;
        Scanner sc = new Scanner(System.in);

        x = sc.nextDouble();
        y = sc.nextDouble();

        if(x % 5 == 0 && x+0.5 < y) {
            System.out.printf("%.2f",(y-x-0.50));
        } else {
            System.out.printf("%.2f",y);
        }
    }
}