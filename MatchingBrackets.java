import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

class Bracket {
    Bracket(char type, int position) {
        this.type = type;
        this.position = position;
    }

    boolean Match(char c) {
        if (this.type == '[' && c == ']')
            return true;
        if (this.type == '{' && c == '}')
            return true;
        if (this.type == '(' && c == ')')
            return true;
        return false;
    }

    char type;
    int position;
}

class check_brackets {
    public static void main(String[] args) throws IOException {
        InputStreamReader input_stream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input_stream);
        String text = reader.readLine();

        Stack<Bracket> opening_brackets_stack = new Stack<Bracket>();
        for (int position = 0; position < text.length(); ++position) {
            char next = text.charAt(position);

            if (next == '(' || next == '[' || next == '{') {
                opening_brackets_stack.push(new Bracket(next,position));
            }

            if (next == ')' || next == ']' || next == '}') {
                if(opening_brackets_stack.isEmpty()){
			System.out.println(position+1);System.exit(0); } //unmatched closing bracket--no opening bracket is there
		else if(!opening_brackets_stack.peek().Match(next)){
			System.out.println(position+1);System.exit(0); } //unmatched closing bracket--wrong opening bracket
        	opening_brackets_stack.pop();    
		}
        }
	if(!opening_brackets_stack.isEmpty()){
		int top=opening_brackets_stack.peek().position;
		opening_brackets_stack.pop(); //unmatched opening brackets
		System.out.println(top+1);
	}

        else System.out.println("Success");
    }
}
