import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

class Main {
    public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out))
        ) {
            for(int t = Integer.parseInt(br.readLine()) ; t > 0 ; t--) {
                int i = Integer.parseInt(br.readLine()),sum=0;
                while(i>0) {
                    sum += i%10;
                    i/=10;
                }
                out.println(sum);
            }
        } catch(Exception e) {}
    }
}