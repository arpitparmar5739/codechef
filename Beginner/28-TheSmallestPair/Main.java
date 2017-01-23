import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        try (
            PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            for(int t = Integer.parseInt(br.readLine()) ; t>0 ; t--) {
                int n = Integer.parseInt(br.readLine());
                int data[] = new int[n];
                String input[] = (br.readLine()).split("\\s+");
                for(int i=0 ; i<n ; i++) {
                    data[i] = Integer.parseInt(input[i]);
                }
                Arrays.sort(data);        
                out.println(data[0] + data[1]);
            }
        } catch (Exception e) {}
    }
}