import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.io.BufferedReader;

class Main {
    public static void main(String[] args) {
        try (
            PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            for(int t = Integer.parseInt(br.readLine()) ; t>0 ; t--) {
                long input=Integer.parseInt(br.readLine()), 
                    result = input>0 ? input:1;
                
                while( --input > 1 ) {
                    result *= input;
                }
                out.println(result);
            }
        } catch (Exception e) {}
    }
}