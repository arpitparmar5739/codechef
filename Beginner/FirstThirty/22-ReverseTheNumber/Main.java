//I know how to reverse the string but just for the sake of chull i am doing this also. ;-)
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
                int n = Integer.parseInt(br.readLine()), result=n%10;
                n/=10;
                while (n > 0) {
                    result = result*10 + n%10;
                    n/=10;    
                }
                out.println(result);
            }
        } catch (Exception e) {}
    }
}