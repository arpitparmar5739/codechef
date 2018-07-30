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
                String input[] = (br.readLine()).split("\\s+");
                int B=Integer.parseInt(input[0]) , LS=Integer.parseInt(input[1]);
                B*=B;LS*=LS;
                out.println(Math.sqrt(LS-B) + " " + Math.sqrt(B+LS));
            }
        } catch (Exception e) {}
    }
}