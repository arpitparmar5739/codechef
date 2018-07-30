import java.io.PrintWriter;
import java.util.Arrays;
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
            for(short T=Short.parseShort(br.readLine()) ; T>0 ; T--) {
                int N = Integer.parseInt(br.readLine());
                String input[] = (br.readLine()).split(" ");
                int uncleJhony = Integer.parseInt(input[Integer.parseInt(br.readLine())-1]);
                int data[] = new int[N];

                for(int i=0 ; i<N ; i++) {
                    data[i] = Integer.parseInt(input[i]);
                }

                Arrays.sort(data);
                out.println(Arrays.binarySearch(data, uncleJhony)+1);
            }
        } catch (IOException e) {}
    }
}