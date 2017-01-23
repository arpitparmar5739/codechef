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
            for(int T = Integer.parseInt(br.readLine()); T > 0 ; T--) {
                String input = br.readLine();
                out.println(input.length() - input.replace("4", "").length());
            }
        } catch(Exception e) {}
    }
}