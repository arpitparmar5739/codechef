import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        ) {
            for(byte T=Byte.parseByte(br.readLine()); T>0 ; T--) {
                int N=Integer.parseInt(br.readLine());
                String input[] = (br.readLine()).split(" ");
                int result=1,min=Integer.parseInt(input[0]),temp=0;
                for(int i=1 ; i<N ; i++) {
                    temp = Integer.parseInt(input[i]);
                    if(min>=temp) {
                        min=temp;
                        result++;
                    }
                }
                out.println(result);
            }
        } catch(IOException e) {}
    }
}