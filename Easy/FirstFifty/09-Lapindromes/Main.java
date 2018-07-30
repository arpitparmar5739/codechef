import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        ) {
            byte T = Byte.parseByte(br.readLine());
            while (T-->0) {
                String input = br.readLine();
                int strlen = input.length();
                String a = input.substring(0,strlen/2);
                StringBuilder b = new StringBuilder(input.substring((strlen+1)/2,strlen));
                
                for(int i=0 ; i<a.length() ; i++) {
                    int index = b.indexOf(String.valueOf(a.charAt(i)));
                    if(index!=-1) {
                        b.deleteCharAt(index);
                    } else {
                        break;
                    }
                }
                if(b.length()==0) {
                    out.println("YES");
                } else {
                    out.println("NO");
                }
            }
        } catch (IOException e) {}
    }
}