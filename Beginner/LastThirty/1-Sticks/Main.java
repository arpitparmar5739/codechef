import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        try (
            PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
        ) {
            for(byte T = Byte.parseByte(br.readLine()) ; T>0 ; T--) {
                short n = Short.parseShort(br.readLine()), len=0, brdth=0;
                String input[] = (br.readLine()).split(" ");
                short data[] = new short[n];
                for(int i=0 ; i<n ; i++) {
                    data[i] = Short.parseShort(input[i]);
                }
                Arrays.sort(data);
                for(short i=0 ; i<n-1 ; i++) {
                    if(data[i]==data[i+1]) {
                        brdth = len;
                        len = data[i];
                        i++;
                    }
                }
                if(brdth != 0) {
                    out.println(len*brdth);
                } else {
                    out.println(-1);
                }
            }
        } catch (Exception e) {}
    }
}