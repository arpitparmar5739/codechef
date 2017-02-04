//  Warning before you read the code : 
//              This answer of mine needs some serious improvements and i know that!

import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) {
        try (
            PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            
            String input[] = (br.readLine()).split(" ");
            String diff = "";
            if (Integer.parseInt(input[0]) >= Integer.parseInt(input[1])) {
                diff = String.valueOf(Integer.parseInt(input[0]) - Integer.parseInt(input[1]));
            } else {
                diff = String.valueOf(Integer.parseInt(input[1]) - Integer.parseInt(input[0]));
            }

            diff = diff.substring(0,diff.length()-1) + (Integer.parseInt(diff.substring(diff.length()-1))!=5?5:6);
            out.println(diff);

        } catch (Exception e) {}
    }
}