import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.BufferedReader;

class Main {
    public static void main(String[] args) {
        try (
            PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            for(int t = Integer.parseInt(br.readLine()) ; t>0 ; t--) {
                out.println(Math.round(Math.sqrt(Integer.parseInt(br.readLine()))));
            }
        } catch (Exception e) {}
    }
}