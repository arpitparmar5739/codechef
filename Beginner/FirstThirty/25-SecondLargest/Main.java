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
                String result[] = br.readLine().split("\\s+");
                int a = Integer.parseInt(result[0]),
                    b = Integer.parseInt(result[1]),
                    c = Integer.parseInt(result[2]);

                if(a>=b) {
                    if(b>=c) {
                        out.println(b);
                    } else if(a>=c) {
                        out.println(c);
                    } else {
                        out.println(a);
                    }
                } else {
                    if(a>=c) {
                        out.println(a);
                    } else if(b>=c) {
                        out.println(c);
                    } else {
                        out.println(b);
                    }
                }
            }
        } catch (Exception e) {}
    }
}