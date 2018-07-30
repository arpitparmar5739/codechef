import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out))
        ) {
            for(int i = Integer.parseInt(br.readLine()) ; i > 0 ; i--) {
                char input[] = br.readLine().toCharArray();
                String rpn = "";
                Stack<Character> stack = new Stack<>();

                for(char letter : input) {
                    if (letter == ')') {
                        while((char)stack.peek() != '(') {
                            rpn += stack.pop();
                        }
                        stack.pop();
                    } else if (Character.isLetter(letter)) {
                        rpn += Character.toString(letter);
                    } else {
                        stack.push(letter);
                    }
                }
                out.println(rpn);
            }
            out.flush();
        } catch (Exception e){}
    }
}