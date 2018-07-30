import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) {
        try (
            PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
        ) {
            int notes[] = {1,2,5,10,50,100};
            for(int T = Integer.parseInt(br.readLine()) ; T>0 ; T--) {
                int input = Integer.parseInt(br.readLine()), result=0, nextNote = notes.length-1;
                while (input>0) {
                    if(input >= notes[nextNote]) {
                        input -= notes[nextNote];
                        result++;
                    } else {
                        nextNote--;
                    }
                }
                out.println(result);
            }
        } catch (Exception e) {}
    }
}