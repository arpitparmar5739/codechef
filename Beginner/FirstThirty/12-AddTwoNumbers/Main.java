import java.util.Scanner;
import java.io.PrintWriter;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        try(
            Scanner sc = new Scanner(System.in) ;
            PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out))
        ) {
            for(int i = sc.nextInt() ; i > 0 ; i--) {
                out.println(sc.nextInt() + sc.nextInt());
            }
            out.flush();
        }
    }
}