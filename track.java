import java.util.*;

public class Parentheses {

    static void generate(int open, int close, String s) {

        if (open == 0 && close == 0) {
            System.out.println(s);
            return;
        }

        if (open > 0)
            generate(open - 1, close, s + "(");

        if (close > open)
            generate(open, close - 1, s + ")");
    }

    public static void main(String[] args) {
        generate(3, 3, "");
    }
}

output:
((()))
(()())
(())()
()(())
()()()

