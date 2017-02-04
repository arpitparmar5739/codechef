import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (
            PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            for(short T=Short.parseShort(br.readLine()) ; T>0 ; T--) {
                String input[] = (br.readLine()).split(" "), m[] = (br.readLine()).split(" ");
                HashSet<String> hs = new HashSet<>();

                for(short i=0 ; i<m.length ; i++) {
                    hs.add(m[i]);
                }

                short a[] = new short[Short.parseShort(input[0]) - Short.parseShort(input[1])];

                for(short i=1,j=0 ; i<=Short.parseShort(input[0]) ; i++) {
                    if(!hs.contains(String.valueOf(i))) {
                        a[j] = i;
                        j++;
                    }
                }

                for(short i=0 ; i<a.length ; i+=2) {
                     out.print(a[i] + " ");
                }

                out.println();

                for(short i=1 ; i<a.length ; i+=2) {
                   out.print(a[i] + " ");
                }

                out.println();
            }
        } catch (IOException e) {}
    }
}