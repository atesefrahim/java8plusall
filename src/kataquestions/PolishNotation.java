package kataquestions;

import java.util.Stack;

public class PolishNotation {

    public static void main(String[] args) {
        System.out.println(polishNotation("+ 5 1 2 + 4 * + 3 -"));
    }

    public static Double polishNotation(String s){
        Stack<Double> stack = new Stack<Double>();


        for(String token:s.split(("\\s+")))
        {
            switch (token){
                case "+":
                    stack.push(stack.pop()+stack.pop());
                    break;
                case "-":
                    stack.push(-stack.pop()+stack.pop());
                    break;
                case "*":
                    stack.push(stack.pop()*stack.pop());
                    break;
                case "/":
                    double divisior=stack.pop();
                    stack.push(stack.pop()/divisior);
                    break;
                case "^":
                    double exponent=stack.pop();
                    stack.push(Math.pow(stack.pop(),exponent));
                    break;
                default:
                    stack.push(Double.parseDouble(token));
                    break;

            }
        }

        return stack.pop();
    }
}

