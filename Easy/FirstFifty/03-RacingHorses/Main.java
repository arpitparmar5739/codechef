import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        try (
            PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            for(byte T=Byte.parseByte(br.readLine()) ; T>0 ; T--) {
                int N = Integer.parseInt(br.readLine());
                String input[] = (br.readLine()).split(" ");
                int data[] = new int[N];
                
                int index = 0;
                for(String i : input) {
                    data[index++] = Integer.parseInt(i);
                }

                Arrays.sort(data);

                int minDiff= Math.abs(data[0]-data[1]),temp=0;
                for(int i=1 ; i<N ; i++) {
                    temp = Math.abs(data[i-1] - data[i]);
                    if(temp < minDiff) {
                        minDiff = temp;
                    }
                }

                out.println(minDiff);
            }
        } catch (IOException e) {}
    }
}