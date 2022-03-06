import java.util.*;

public class CloseYourBracket {
    public static int solution(String s) {
        if (s.length() == 0) {
            return 0;
        }

        Stack<String> leftBrktStack = new Stack<String>();
        Stack<String> rightBrktStack = new Stack<String>();
        String[] arrStr = s.split("");

        for (int i = 0; i < arrStr.length; i++) {

            if (arrStr[i].equals("(")) {
                leftBrktStack.push("(");
                continue;
            }

            if (arrStr[i].equals(")") && !leftBrktStack.isEmpty()) {
                leftBrktStack.pop();
                continue;
            }

            if (arrStr[i].equals(")") && leftBrktStack.isEmpty()) {
                rightBrktStack.push(")");
            }

        }

        return (leftBrktStack.size() + rightBrktStack.size());
    }

    public static void main(String[] args) {
    }
}
