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
                int r = Integer.parseInt(br.readLine());
                String xy[][] = {(br.readLine()).split("\\s+"),(br.readLine()).split("\\s+"),(br.readLine()).split("\\s+")};
                double d1 = Math.sqrt(Math.pow(Integer.parseInt(xy[0][0])-Integer.parseInt(xy[1][0]),2) + Math.pow(Integer.parseInt(xy[0][1])-Integer.parseInt(xy[1][1]),2)),
                       d2 = Math.sqrt(Math.pow(Integer.parseInt(xy[1][0])-Integer.parseInt(xy[2][0]),2) + Math.pow(Integer.parseInt(xy[1][1])-Integer.parseInt(xy[2][1]),2)),
                       d3 = Math.sqrt(Math.pow(Integer.parseInt(xy[2][0])-Integer.parseInt(xy[0][0]),2) + Math.pow(Integer.parseInt(xy[2][1])-Integer.parseInt(xy[0][1]),2));

                if((d1<=r && d2<=r) || (d2<=r && d3<=r) || (d3<=r && d1<=r)) {
                    out.println("yes");         
                } else {
                    out.println("no");
                }
            }
        } catch (Exception e) {}
    }
}