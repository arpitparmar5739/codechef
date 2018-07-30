import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        ) {
            String input[] = (br.readLine()).split(" ");
            int A=Integer.parseInt(input[0]), N=Integer.parseInt(input[1]), 
                K=Integer.parseInt(input[2]), current=0, temp=0;
                
            while(K-->0) {
                out.print((A%(N+1)) + " ");
                A/=(N+1);
            }
        } catch (IOException e) {}
    }
}