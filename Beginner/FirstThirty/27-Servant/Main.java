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
                if(Integer.parseInt(br.readLine()) < 10) {
                    out.println("What an obedient servant you are!");
                } else {
                    out.println(-1);
                }
            }
        } catch (Exception e) {}
    }
}