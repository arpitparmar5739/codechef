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
            TestCaseForLoop : 
            for(byte T=Byte.parseByte(br.readLine()) ; T>0 ; T--) {
                String input[] = (br.readLine()).split(" ");
                int n=Integer.parseInt(input[0]), m=Integer.parseInt(input[1]);
                int data[] = new int[n];
                for (int i=0 ; i<n ; i++) {
                    data[i] = Integer.parseInt(br.readLine());
                }

                for(int i=0 ; i<(2<<n) ; i++) {
                    int sum=0;
                    for (int j=0 ; j<n ; j++) {
                        if((i&(1<<j)) != 0) {
                            sum += data[j];
                        }
                    }

                    if(sum == m) {
                        out.println("Yes");
                        continue TestCaseForLoop;
                    }
                }
                out.println("No");
            }
        } catch (IOException e) {}
    }
}