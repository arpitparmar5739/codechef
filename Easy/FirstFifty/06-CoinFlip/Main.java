import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

class Main {
    public static void main(String[] args) {
        try (
            PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            for(byte T=Byte.parseByte(br.readLine()) ; T>0 ; T--) {
                short G = Short.parseShort(br.readLine());
                for(int j=0 ; j<G ; j++) {
                    String input[] = (br.readLine()).split(" ");
                    
                    int L = Integer.parseInt(input[0]), N = Integer.parseInt(input[1]), 
                        Q = Integer.parseInt(input[2]);

                    if(L==Q) {
                        out.println(N/2);
                    } else {
                        out.println(N-N/2);
                    }
                }
            }
        } catch (IOException e) {}
    }
}