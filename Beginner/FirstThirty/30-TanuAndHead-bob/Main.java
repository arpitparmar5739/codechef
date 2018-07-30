import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) {
        try (
            PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
        ) {
            for(int T = Integer.parseInt(br.readLine()) ; T>0 ; T--) {
                int n = Integer.parseInt(br.readLine());
                String input = br.readLine();

                if(input.contains("I")) {
                    out.println("INDIAN");
                } else if(input.contains("Y")) {
                    out.println("NOT INDIAN");
                } else {
                    out.println("NOT SURE");
                }
            }
        } catch (Exception e) {}
    }
}